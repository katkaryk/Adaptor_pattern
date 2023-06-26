package AdapterPattern;

import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData
{
    public static void insertData(Connection conn, String table_name, String name, String address, double salary)
    {
        Statement stmt;
        try
        {
            String query = String.format("Insert into %s (empname, empaddress, empsalary) values ('%s', '%s', '%.2f');", table_name, name, address,salary);
            stmt = conn.createStatement();
            stmt.executeUpdate(query);
            System.out.println("row inserted.");
        }
        catch (SQLException e)
        {
            System.out.println("Error: " + e);
        }
    }
}
