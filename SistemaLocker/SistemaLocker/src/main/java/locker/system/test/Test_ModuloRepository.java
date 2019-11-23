package locker.system.test;
import locker.system.connectors.Connector;
import locker.system.entities.Modulo;
import locker.system.enumerados.Apertura;
import locker.system.enumerados.NBoxes;
import locker.system.repositories.interfaces.I_ModuloRepository;
import locker.system.repositories.jdbc.ModuloRepository;
import java.sql.Connection;
public class Test_ModuloRepository {
    public static void main(String[] args) {
        
        try (Connection conn = Connector.getConnection()){
            
            I_ModuloRepository mr = new ModuloRepository(conn);
            
            Modulo modulo = new Modulo(1,"New","New",NBoxes.t3,Apertura.right);
            mr.save(modulo);
            System.out.println(modulo);            
            System.out.println("----------------------------------------------------------------\n");
            
            mr.remove(mr.getByIdModulo(35));
            
            modulo = mr.getByIdModulo(30);
            System.out.println(modulo);            
            System.out.println("----------------------------------------------------------------\n");
            
            modulo.setModelo("Test");
            modulo.setNSerie("Test");
            mr.update(modulo);
            System.out.println(modulo);            
            System.out.println("----------------------------------------------------------------\n");
            
            mr.getAll().forEach(System.out::println);
            
            System.out.println("----------------------------------------------------------------\n");
            
            mr.getLikeModelo("FZ20").forEach(System.out::println);
            
            System.out.println("----------------------------------------------------------------\n");
            
            mr.getLikeApertura(Apertura.right).forEach(System.out::println);
            
            System.out.println("----------------------------------------------------------------\n");
            
            mr.getLikeNBoxes(NBoxes.t2).forEach(System.out::println);
            
            System.out.println("----------------------------------------------------------------\n");
            
            mr.getLikeNSerie("cen").forEach(System.out::println);
            
                                            
        } catch (Exception e) { e.printStackTrace(); }
                    
    }
}
