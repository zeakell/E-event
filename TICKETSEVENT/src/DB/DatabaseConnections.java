/**
 *
 * @author KH
 */
package DB;
import java.sql.*;
public class DatabaseConnections {
     private Connection connection = null;
        public Connection setConnection()
        {
            try
            {
                    String url = "jdbc:sqlserver://CHEETAH\\KHSQL; databaseName=Eticket";                
                    String user ="sa";
                    String pass = "123qwe";
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                            connection = DriverManager.getConnection(url, user, pass);
                            System.out.println("SuccessFully Connected To  Database");                 
            }
                catch   (ClassNotFoundException  |  SQLException e )
                {
                    System.out.println("Error "+e.getMessage());
                }
            return connection;
        }
}

