
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
    static Connection con;
    
// register jdbc Driver 
public static Connection connect() throws SQLException{
    try {
        String url = "jdbc:postgresql:bank";
        String user = "postgres";
        String password = "#Angelpostgresql2025";
        con = DriverManager.getConnection(url,user,password);
    } catch (SQLException e) {
        System.out.println("NO entramos en la base de datos");
    }
    return con;
}
}
