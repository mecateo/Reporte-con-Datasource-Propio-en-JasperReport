package conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import utilitarios.ReadProperties;

/**
 *
 * @author Miguel Angel Meca Pacherres <miguelmeca01@gmail.com>
 */
public class ConectaDb {
    
    private String bd ;
    private String login ;
    private String password ;
    private String url ;
    private String host;
    private String puerto;
    private String driver;
    
    private static Connection conexion = null;

    private ConectaDb() {
        
        bd = ReadProperties.getInstance().getPropertie("DB_NAME");
        login = ReadProperties.getInstance().getPropertie("DB_USER");
        password = ReadProperties.getInstance().getPropertie("DB_PASSWORD");
        host = ReadProperties.getInstance().getPropertie("DB_HOST");
        puerto = ReadProperties.getInstance().getPropertie("DB_PORT_NUMBER");
        url = "jdbc:mysql://"+host + ":"+puerto+"/" + bd;
        driver = ReadProperties.getInstance().getPropertie("DB_DRIVER_MYSQL");
        try{
             Class.forName(driver);
             conexion = DriverManager.getConnection(url, login, password);
         }
         catch(ClassNotFoundException | SQLException e){
             e.printStackTrace();
             System.out.println(e.getMessage());
         }
    }
    
    public static Connection getConnection(){
  
         if (conexion == null){
             new ConectaDb();
         }

         return conexion;
    } 
    
}
