import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String url2 = "jdbc:postgresql:demo";
        //String url = "jbdc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "#Angelpostgresql2025";
        String query = "SELECT * FROM students";
        //String query = "INSERT INTO students values (5,'antonio',48)";


        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url2,uname,pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        //boolean rs = st.execute(query);
        //String name = rs.getString("sname");
 
        while(rs.next()){
            System.out.println(rs.getString("sname"));
        }


        con.close();
    }
}
