import java.sql.*;

public class fetch_data_from_MySQL_Database {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/ myData","root","VivekKumar@#123");

        PreparedStatement ps= con.prepareStatement("select * from student");
        ResultSet RS=ps.executeQuery();
        while (RS.next()){
//            String name=RS.getString("name");
//            System.out.println(name);

            // another method
//            System.out.println(RS.getString("name"));

            String name= RS.getString("name");
            System.out.println("Name:-" +name);

            String email= RS.getString("email");
            System.out.println("Email:-" +email);

            String password= RS.getString("password");
            System.out.println("Password:-" +password);

            String gender= RS.getString("gender");
            System.out.println("Gender:-" +gender);

            String city= RS.getString("city");
            System.out.println("City:-" +city);


        }

    }
}
