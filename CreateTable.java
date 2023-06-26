package AdapterPattern;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable
{
    public static void createTable(Connection conn, String table_name)
    {
        Statement stmt;
        try
        {
            String query = String.format("create table %s (empid SERIAL, empname varchar, empaddress varchar, empsalary varchar )", table_name);
            stmt = conn.createStatement();
            stmt.executeUpdate(query);
            System.out.println("Table created.");
        }
        catch (SQLException e)
        {
            System.out.println("Error: " + e);
        }
    }
}
