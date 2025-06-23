
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;

public class bankManagement {

    private static final int NULL = 0;
    static String sql = "";

    static Connection con = (Connection) connection.getConnection();

    public static boolean createAcount(String name, int passCode) {

        Statement st = null;
        try {
            if (name == "" || passCode == NULL) {
                System.out.println("The user is incorrect, populate all the fields");
                return false;
            }
            st = con.createStatement();
            sql = "INSERT INTO customer(cname,balance,pass_code) values('"
                    + name + "',1000," + passCode + ")";
            if (st.executeUpdate(sql) == 1) {
                System.out.println(name
                        + ", Now You Login!");
                return true;
            }
        } catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("Username Not Available!");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;

    }

    public static boolean loginAccount(String name, int passCode) {

        try {
            if (name == "" || passCode == NULL) {
                System.out.println("The user is incorrect, populate all the fields");
                return false;
            }

            //query
            sql = "SELECT * FROM customer where cname='" + name + "' and pass_code=" + passCode;
            PreparedStatement st
                    = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            // Execution
            BufferedReader sc = new BufferedReader(
                    new InputStreamReader(System.in));
            if (rs.next()){
                
            }

        } catch (Exception e) {
            // TODO: handle exception
        }

        return false;

    }

}
