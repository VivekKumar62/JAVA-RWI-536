import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myData","root","VivekKumar@#123");
   PreparedStatement ps=con.prepareStatement("update student set city=? where email=?");
        String city = "Patna";
        String email = "vvk@.com";
        ps.setString(1, city );
        ps.setString(2, email);

        int count =ps.executeUpdate();
        if(count> 0) {
            System.out.println("update");
        }
        else {
            System.out.println("failed");
        }
    }
}
