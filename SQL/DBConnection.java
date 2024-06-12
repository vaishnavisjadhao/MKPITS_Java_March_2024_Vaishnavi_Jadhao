import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//load and register driver
public class DBConnection {
    public static Connection dbConnect() {
        Connection connection = null;
        try {
            Class.forName(DBConfig.driver);
            System.out.println("Driver loaded...");
            connection = DriverManager.getConnection(DBConfig.url, DBConfig.username, DBConfig.password);
            System.out.println("Connection Establish");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return connection;
    }
}
