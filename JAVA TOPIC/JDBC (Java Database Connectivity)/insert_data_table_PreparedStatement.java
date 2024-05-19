import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insert_data_table_PreparedStatement {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
           String name= "Vivek";
            String email="Vivek@.com";
            String password= "Vivek62016";
            String gender= "male";
            String city= "Bhopal";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ myData","root","VivekKumar@#123");

//	PreparedStatement ps=con.prepareStatement("Insert student values('"+name+"', '"+email+"', '"+password+"', '"+gender+"', '"+city+"')");

            PreparedStatement ps=con.prepareStatement("Insert student values(?,?,?,?,?)"); // positional parameter

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, password);
            ps.setString(4, gender);
            ps.setString(5, city);

            int i= ps.executeUpdate();
            if(i>0) {
                System.out.println("ok done");
            }
            else {
                System.out.println("failed");
            }


        }


    }

