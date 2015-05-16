import java.sql.*;
/*Qais Al-Hatmi Sn:11848659
 * Nikolaos Alexandropoulos Sn:13830689
 * Alex Osbourne Sn:13815859
 */
 
public class delete {

	public static void main(String[] args)  throws SQLException {{

        Connection Connection = null;
	    Statement Statement = null;
	    
	    try {
            //get a connection
	    	Class.forName("com.mysql.jdbc.Driver");
	    	Connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/calendar"/*url*/, "root"/*user*/,"Fifastreetv2"/*password*/);	
 
            // Create a statement
	    	Statement = Connection.createStatement();
 
            // Execute query
            String mysql = "delete from staffmembers where staff_first_name='Jim'";
 
            int rowsAffected = Statement.executeUpdate(mysql);
 
            System.out.println(rowsAffected + " rows have been affected " );
            System.out.println("Delete complete.");

	}
    catch (Exception exc) {
        exc.printStackTrace();
    }
    finally {
        if (Statement != null) {
        	Statement.close();
        }

        if (Connection != null) {
        	Connection.close();
        }
    }
}
}
}
