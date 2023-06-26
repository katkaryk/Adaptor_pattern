package AdapterPattern;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteData {
    public static void deleteData(Connection conn, String table_name, Integer id) {
        Statement stmt;
        try {
            stmt = conn.createStatement();
            String query = String.format("DELETE FROM %s WHERE empid = %d", table_name, id);
            System.out.println("Row deleted.");
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }
}
