
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;

public class BankManagement {

    static Connection con;

    public BankManagement() {
        try {
            con = DataBase.connect();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static boolean createAccount(String name, int passCode) {

        try {
            if ("".equals(name) || passCode == 0) {
                System.out.println("All Field Required!");
                return false;
            }
            Statement st = con.createStatement();
            String query = "INSERT INTO customer(cname,balance,pass_code) values ('"
                    + name + "', 1000 ," + passCode + ")";
            if (st.executeUpdate(query) == 1) {
                System.err.println(name + " Congratulations you are registered");
                return true;
            }
        } catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("Username Not Available!");
        } catch (Exception e) {
        }
        return false;
    }

        public static boolean loginUser(String name, int passCode) {

        try {
            if ("".equals(name) || passCode == 0) {
                System.out.println("All Field Required!");
                return false;
            }
            Statement st = con.createStatement();
            String query = "SELECT * FROM customer WHERE cname='" + name + "' AND pass_code=" + passCode ;
            ResultSet result = st.executeQuery(query);
            if ( result.next()) {
                System.err.println(" Congratulations you are logged");
                return true;
            }
        } catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("The credentials were not correct!");
        } catch (Exception e) {
        }
        return false;
    }

}
