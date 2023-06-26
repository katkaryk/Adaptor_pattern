package AdapterPattern;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Update
{
    public static void alterTable(Connection conn, String query)
    {
        Statement stmt;
        try
        {
            stmt = conn.createStatement();
            stmt.executeUpdate(query);
            System.out.println("Table altered.");
        }
        catch (SQLException e)
        {
            System.out.println("Error: " + e);
        }
    }
}
