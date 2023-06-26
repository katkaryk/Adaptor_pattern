package AdapterPattern;

import java.sql.Connection;

public class Main
{
    public static void main(String[] args)
    {
        Connection conn = Connect.connectDB("jdbc:postgresql://localhost:5432/postgres", "postgres", "yash@123");
      //CreateTable.createTable(conn, "employee");
       // DropTable.dropTable(conn,"drop table employee;");
      //InsertData.insertData(conn, "employee", "vaishnavi batho", "Dubai" ,1000.0f );
     // Update.alterTable(conn, "alter table employee add primary key (empid);");
     // ReadData.readAllData(conn, "employee");
    // DeleteData.deleteData(conn, "employee", 1);

    }
}
