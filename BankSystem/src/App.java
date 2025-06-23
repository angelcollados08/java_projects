
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {
        String query = "SELECT * FROM students";
        
        Connection con = DataBase.connect();
        Statement st = con.createStatement();
        ResultSet res = st.executeQuery("SELECT * FROM customer");
        System.err.println(res);

    }
}
