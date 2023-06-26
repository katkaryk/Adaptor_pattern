package AdapterPattern;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadData
{
    public static void readAllData(Connection conn, String table_name)
    {
        Statement stmt;
        ResultSet rs;
        try
        {
            stmt = conn.createStatement();
            String query = String.format("select * from %s", table_name);
            rs = stmt.executeQuery(query);
            while (rs.next())
            {
                System.out.printf("Id: %s | Name: %s | Address: %s | Salary: %s%n", rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
            }
        }
        catch (SQLException e)
        {
            System.out.println("Error: " + e);
        }
    }
}
