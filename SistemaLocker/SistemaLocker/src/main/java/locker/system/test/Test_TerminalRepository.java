package locker.system.test;
import locker.system.connectors.Connector;
import locker.system.entities.Terminal;
import locker.system.enumerados.Modelo;
import locker.system.enumerados.Ploteo;
import locker.system.enumerados.Tipo;
import locker.system.enumerados.TnBoxes;
import locker.system.repositories.interfaces.I_TerminalRepository;
import locker.system.repositories.jdbc.TerminalRepository;
import java.sql.Connection;
public class Test_TerminalRepository {
    public static void main(String[] args) {
        
        try (Connection conn = Connector.getConnection()){
            
            I_TerminalRepository tr = new TerminalRepository(conn);
            
            Terminal terminal = new Terminal(2,"Nuevo", Tipo.New_Modulo, Modelo.M, TnBoxes.t00, Ploteo.Sin_Plot);
            tr.save(terminal);
            System.out.println(terminal);
            
            System.out.println("----------------------------------------------------------------\n");
            
            tr.remove(tr.getByIdTerminal(12));
            
            terminal = tr.getByIdTerminal(8);
            System.out.println(terminal);
            System.out.println("----------------------------------------------------------------\n");
            
            terminal.setModelo(Modelo.HT);
            terminal.setNombrePc("New");
            terminal.setModelo(Modelo.D);
            terminal.setTipo(Tipo.City_Terminal);
            terminal.setTnBoxes(TnBoxes.t60);
            tr.update(terminal);
            System.out.println(terminal);
            System.out.println("----------------------------------------------------------------\n");
            
            tr.getAll().forEach(System.out::println);
            
            System.out.println("----------------------------------------------------------------\n");
            
            tr.getLikeModelo(Modelo.F).forEach(System.out::println);
            
            System.out.println("----------------------------------------------------------------\n");
            
            tr.getLikeNombrePc("054CT00002").forEach(System.out::println);
            
            System.out.println("----------------------------------------------------------------\n");
            
            tr.getLikeTipo(Tipo.Home_Terminal).forEach(System.out::println);
            
            System.out.println("----------------------------------------------------------------\n");
            
            tr.getLikePloteo(Ploteo.Correo).forEach(System.out::println);
            
            System.out.println("----------------------------------------------------------------\n");
            
            tr.getLikeTnBoxes(TnBoxes.t56).forEach(System.out::println);
            
            System.out.println("----------------------------------------------------------------\n");
                        
            
        } catch (Exception e) { e.printStackTrace(); }
        
    }
}
