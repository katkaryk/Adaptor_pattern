package AdapterPattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect
{
    public static Connection connectDB(String url, String name, String pass)
    {
        Connection conn = null;
        try
        {
            conn = DriverManager.getConnection(url, name, pass);
            if (conn != null)
            {
                System.out.println("Connected");
            }
            else
            {
                System.out.println("Failed");
            }
        }
        catch (SQLException e)
        {
            System.out.println("Error: " + e);
        }
        return conn;
    }
}
