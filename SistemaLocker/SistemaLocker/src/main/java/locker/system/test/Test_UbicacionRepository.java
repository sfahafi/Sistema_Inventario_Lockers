package locker.system.test;
import locker.system.connectors.Connector;
import locker.system.entities.Ubicacion;
import locker.system.repositories.interfaces.I_UbicacionRepository;
import locker.system.repositories.jdbc.UbicacionRepository;
import java.sql.Connection;
public class Test_UbicacionRepository {
    public static void main(String[] args) {
        
        try (Connection conn = Connector.getConnection()){
            
            I_UbicacionRepository ur = new UbicacionRepository(conn);
            
            Ubicacion ubicacion = new Ubicacion("CABA", "Almagro", "Av. Rivadavia 3000", "Coto");
            ur.save(ubicacion);
            System.out.println(ubicacion);
            System.out.println("----------------------------------------------------------------\n");
            
            ur.remove(ur.getByIdUbicacion(10));
            
            ubicacion = ur.getByIdUbicacion(9);
            System.out.println(ubicacion);
            System.out.println("----------------------------------------------------------------\n");
            
            ubicacion.setDireccion("xxxxxxxxxxxxx");
            ubicacion.setLocacion("Planta Cordoba");
            ur.update(ubicacion);
            System.out.println(ubicacion);
            System.out.println("----------------------------------------------------------------\n");
            
            ur.getAll().forEach(System.out::println);
            
            ur.getLikeBarrio("Palermo").forEach(System.out::println);
            
            System.out.println("----------------------------------------------------------------\n");
            
            ur.getLikeLocacion("open").forEach(System.out::println);
            
            System.out.println("----------------------------------------------------------------\n");
            
            ur.getLikeProvincia("cordo").forEach(System.out::println);
            
            System.out.println("----------------------------------------------------------------\n");
            
            ur.getLikeDireccion("medra").forEach(System.out::println);
            
        } catch (Exception e) { e.printStackTrace(); }    
        
    }
}
