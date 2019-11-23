package locker.system.connectors;
import java.sql.Connection;
import java.sql.DriverManager;
public class Connector {
    
    private static String driver = "com.mysql.jdbc.Driver";
    //private static String driver = "com.mysql.cj.jdbc.Driver";
    
    //Localhost 
    //private static String url="jdbc:mysql://localhost:3306/locker";
    //private static String user="root";
    //private static String pass="root";
    
    //MyPc 
    //private static String url="jdbc:mysql://127.0.0.1:3306/locker";
    //private static String user="root";
    //private static String pass="";
    
    //remotemysql.com
    private static String url="jdbc:mysql://remotemysql.com:3306/a19MVQ8iJ7";
    private static String user="a19MVQ8iJ7";
    private static String pass="nlxJI5DyiX";
    
    private static Connection conn = null;
    private Connector(){}
    public synchronized static Connection getConnection(){
        if(conn == null){
            try {
                Class.forName(driver);
                conn = DriverManager.getConnection(url,user,pass);
            } catch (Exception e) { e.printStackTrace(); }
        }
        return conn;
    }
}
