package AdapterPattern;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DropTable
{
    public static void dropTable(Connection conn, String query)
    {
        Statement stmt;
        try
        {
            stmt = conn.createStatement();
            stmt.executeUpdate(query);
            System.out.println("table Dropped succesfully");
        }
        catch (SQLException e)
        {
            System.out.println("Error" + e);
        }
    }
}
