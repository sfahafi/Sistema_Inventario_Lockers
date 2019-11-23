package locker.system.repositories.jdbc;
import locker.system.entities.Modulo;
import locker.system.enumerados.Apertura;
import locker.system.enumerados.NBoxes;
import locker.system.repositories.interfaces.I_ModuloRepository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class ModuloRepository implements I_ModuloRepository{
    
    private Connection conn;
    public ModuloRepository(Connection conn) { this.conn = conn; }
    
    @Override
    public void save(Modulo modulo) {
        if(modulo == null) return;
        try (PreparedStatement ps = conn.prepareStatement (
            "insert into modulos(idTerminal,modelo,nSerie,nBoxes,apertura) values(?,?,?,?,?)",
            PreparedStatement.RETURN_GENERATED_KEYS
        )){            
            ps.setInt(1, modulo.getIdTerminal());
            ps.setString(2, modulo.getModelo());
            ps.setString(3, modulo.getNSerie());
            ps.setString(4, modulo.getNBoxes().toString());
            ps.setString(5, modulo.getApertura().toString());
            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()) modulo.setIdModulo(rs.getInt(1));            
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override
    public void remove(Modulo modulo) {
        if(modulo == null) return;
        try (PreparedStatement ps = conn.prepareStatement(
                "delete from modulos where idModulo = ?")){
            ps.setInt(1, modulo.getIdModulo());
            ps.execute();            
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override
    public void update(Modulo modulo) {
        if(modulo == null) return;
        try (PreparedStatement ps = conn.prepareStatement(
                "update modulos set idTerminal=?, modelo=?, nSerie=?, nBoxes=?, apertura=? where idModulo=?"
        )){
            ps.setInt(1, modulo.getIdTerminal());
            ps.setString(2, modulo.getModelo());
            ps.setString(3, modulo.getNSerie());
            ps.setString(4, modulo.getNBoxes().toString());
            ps.setString(5, modulo.getApertura().toString());
            ps.setInt(6, modulo.getIdModulo());
            ps.execute();
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override
    public List<Modulo> getAll() {
        List<Modulo>list = new ArrayList();
        try (ResultSet rs = conn.createStatement().executeQuery(
                "select * from modulos")){
            while(rs.next()){
                list.add(new Modulo(
                        rs.getInt("idModulo"),
                        rs.getInt("idTerminal"),
                        rs.getString("modelo"),
                        rs.getString("nSerie"),
                        NBoxes.valueOf(rs.getString("nBoxes")),
                        Apertura.valueOf(rs.getString("apertura"))
                ));
            }
        } catch (Exception e) { e.printStackTrace(); }
        return list;
    }
    
}
