import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class mysql {
    public static void main(String[] args) throws Exception {
        String username = "root";
        String password = "admin";
        String url = "jdbc:mysql:///Clinic";
        String sql = "INSERT INTO employee(name,position,email,mobilephonenumber) VALUES ('zhao long','牙医','gao@123.com','15055631901')";
        String sql1="select * from employee";
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement=connection.createStatement();
//        statement.executeUpdate(sql);
        ResultSet rs= statement.executeQuery(sql1);
        while (rs.next()){
            System.out.println(rs.getString("name"));
        }

    }
}

