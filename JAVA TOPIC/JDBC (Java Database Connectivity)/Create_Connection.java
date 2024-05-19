import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Create_Connection {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbc_db";
        String username = "root";
        String password = "VivekKumar@#123";

    Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection(url, username, password);

    con.prepareStatement("insert into table_name values(----)");
        System.out.println("Connected to MySQL database!");

    }
}
