package locker.system.test;
import locker.system.connectors.Connector;
import java.sql.Connection;
import java.sql.Statement;
public class TestConnector {
        public static void main(String[] args) {
        try (Connection conn=Connector.getConnection()){
           Statement st=conn.createStatement(); 
           String query="insert into ubicaciones(provincia, barrio, direccion, locacion) "
                   + "values ('Cordoba','Arguello','Recta Martinolli','UTN')";
           st.execute(query);
                      
           conn.createStatement().execute(
                   "insert into ubicaciones(provincia, barrio, direccion, locacion) "
                           + "values ('Gran Buenos Aires','Pilar','Av. Caamaño','Shopping')"
           );
                      
        } catch (Exception e) { e.printStackTrace(); }
    }
}
