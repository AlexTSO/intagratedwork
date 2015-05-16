import java.sql.*;
/*Qais Al-Hatmi Sn:11848659
 * Nikolaos Alexandropoulos Sn:13830689
 * Alex Osbourne Sn:13815859
 */
 
public class update {

	public static void main(String[] args) throws SQLException {{
        
        Connection Connection = null;
	    Statement Statement = null;

	     try {
	            // Get a connection 
	    	 	Class.forName("com.mysql.jdbc.Driver");
	    	 	Connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/calendar"/*url*/, "root"/*user*/,"Fifastreetv2"/*password*/);
	 
	            //  create a statement
	    	 	Statement = Connection.createStatement();
	 
	            //  execute queries
	            String mysql = "update AppointmentArea set Appointment_room='520' where Appointment_id=201";

	 
	            int rowsAffected = Statement.executeUpdate(mysql);
	 
	            System.out.println(rowsAffected + " row has been affected ");
	            System.out.println("Update complete.");

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




