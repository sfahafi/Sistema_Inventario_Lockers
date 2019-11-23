package locker.system.repositories.jdbc;
import locker.system.entities.Terminal;
import locker.system.enumerados.Modelo;
import locker.system.enumerados.Ploteo;
import locker.system.enumerados.Tipo;
import locker.system.enumerados.TnBoxes;
import locker.system.repositories.interfaces.I_TerminalRepository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class TerminalRepository implements I_TerminalRepository{
    
    private Connection conn;
    public TerminalRepository(Connection conn) { this.conn = conn; }    

    @Override
    public void save(Terminal terminal) {
        if(terminal == null) return;
        try (PreparedStatement ps = conn.prepareStatement(
                "insert into terminales(idUbicacion,nombrePc,tipo,modelo,nBoxes,ploteo) values(?,?,?,?,?,?)",
                PreparedStatement.RETURN_GENERATED_KEYS
        )){
            ps.setInt(1, terminal.getIdUbicacion());
            ps.setString(2, terminal.getNombrePc());
            ps.setString(3, terminal.getTipo().toString());
            ps.setString(4, terminal.getModelo().toString());
            ps.setString(5, terminal.getTnBoxes().toString());
            ps.setString(6, terminal.getPloteo().toString());
            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()) terminal.setIdTerminal(rs.getInt(1));
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override
    public void remove(Terminal terminal) {
        if(terminal == null) return;
        try (PreparedStatement ps = conn.prepareStatement(
                "delete from terminales where idTerminal=?")){
            ps.setInt(1, terminal.getIdTerminal());
            ps.execute();            
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override
    public void update(Terminal terminal) {
        if(terminal == null) return;
        try (PreparedStatement ps = conn.prepareStatement(
                "update terminales set idUbicacion=?, nombrePc=?, tipo=?, modelo=?, nBoxes=?, ploteo=? "
                        + "where idTerminal=?")){
            ps.setInt(1, terminal.getIdUbicacion());
            ps.setString(2, terminal.getNombrePc());
            ps.setString(3, terminal.getTipo().toString());
            ps.setString(4, terminal.getModelo().toString());
            ps.setString(5, terminal.getTnBoxes().toString());
            ps.setString(6, terminal.getPloteo().toString());
            ps.setInt(7, terminal.getIdTerminal());
            ps.execute();
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override
    public List<Terminal> getAll() {
        List<Terminal>list = new ArrayList();
        try (ResultSet rs = conn.createStatement().executeQuery(
                "select * from terminales")){
            while(rs.next()){
                list.add(new Terminal(
                        rs.getInt("idTerminal"),
                        rs.getInt("idUbicacion"),
                        rs.getString("nombrePc"),
                        Tipo.valueOf(rs.getString("tipo")),
                        Modelo.valueOf(rs.getString("modelo")),
                        TnBoxes.valueOf(rs.getString("nBoxes")),
                        Ploteo.valueOf(rs.getString("ploteo"))
                ));
            }
        } catch (Exception e) { e.printStackTrace(); }
        return list;
    }
    
}
