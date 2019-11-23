package locker.system.repositories.jdbc;
import locker.system.entities.Ubicacion;
import locker.system.repositories.interfaces.I_UbicacionRepository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class UbicacionRepository implements I_UbicacionRepository{
    
    private Connection conn;
    public UbicacionRepository(Connection conn) { this.conn = conn; }    

    @Override
    public void save(Ubicacion ubicacion) {
        if(ubicacion == null) return;
        try (PreparedStatement ps = conn.prepareStatement(
                "insert into ubicaciones(provincia, barrio, direccion, locacion) values(?,?,?,?)",
                PreparedStatement.RETURN_GENERATED_KEYS
        )){
            ps.setString(1, ubicacion.getProvincia());
            ps.setString(2, ubicacion.getBarrio());
            ps.setString(3, ubicacion.getDireccion());
            ps.setString(4, ubicacion.getLocacion());
            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()) ubicacion.setIdUbicacion(rs.getInt(1));
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override
    public void remove(Ubicacion ubicacion) {
        if(ubicacion == null) return;
        try (PreparedStatement ps = conn.prepareStatement(
                "delete from ubicaciones where idUbicacion=?")){
            ps.setInt(1, ubicacion.getIdUbicacion());
            ps.execute();
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override
    public void update(Ubicacion ubicacion) {
        if(ubicacion == null) return;
        try (PreparedStatement ps = conn.prepareStatement(
                "update ubicaciones set provincia=?, barrio=?, direccion=?, locacion=?"
                        + "where idUbicacion=?")){
            ps.setString(1, ubicacion.getProvincia());
            ps.setString(2, ubicacion.getBarrio());
            ps.setString(3, ubicacion.getDireccion());
            ps.setString(4, ubicacion.getLocacion());
            ps.setInt(5, ubicacion.getIdUbicacion());
            ps.execute();
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override
    public List<Ubicacion> getAll() {
        List<Ubicacion>list = new ArrayList();
        try (ResultSet rs = conn.createStatement().executeQuery(
                "select * from ubicaciones")){
            while(rs.next()){
                list.add(new Ubicacion(
                        rs.getInt("idUbicacion"),
                        rs.getString("provincia"),
                        rs.getString("barrio"),
                        rs.getString("direccion"),
                        rs.getString("locacion")
                ));
            }
        } catch (Exception e) { e.printStackTrace(); }
        return list;
    }
    
}
