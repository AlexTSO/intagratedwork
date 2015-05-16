import java.sql.*;
/*Qais Al-Hatmi Sn:11848659
 * Nikolaos Alexandropoulos Sn:13830689
 * Alex Osbourne Sn:13815859
 */
 

public class AppointmentAreaRetrieve {

	
		public static void main(String[] args) throws SQLException {
			
			Connection Connection = null;
			PreparedStatement  Statement = null;
	        ResultSet Result = null;
	        
	        try {
	        	 // get a connection 
	        	Class.forName("com.mysql.jdbc.Driver");
	        	Connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/calendar"/*url*/, "root"/*user*/,"Fifastreetv2"/*password*/);	
	          //prepare statement
	        	Statement = Connection.prepareStatement("select * from appointmentarea where appointment_id > ? and Appointment_location = ? ");
				
				// 3. Set the parameters
	        	 Statement.setDouble(1, 200);
	        	 Statement.setString(2, "Cockcroft");
				
				// 4. Execute SQL query
				Result = Statement.executeQuery();
				
				// 5. Display the result set
				display(Result);
				
			//New prepare statement
				System.out.println("\nRedo of the prepared statement\n");
				
				// 6. Set the parameters
				Statement.setDouble(1, 300);
				Statement.setString(2, "Watts");
				
				// 7. Execute SQL query
	           Result = Statement.executeQuery();
				
				// 8. Display the result set
				display(Result);
			}
				
		
		catch (Exception ecx){  
			ecx.printStackTrace();
		}
		finally {					
	        if (Result != null) {
	            Result.close();
	        }

	        if (Statement != null) {
	            Statement.close();
	        }

	        if (Connection != null) {
	        	Connection.close();
	        }
	    }
	}
		private static void display(ResultSet Result) throws SQLException {
			while (Result.next()) {
				String Appointment_id = Result.getString("Appointment_id");
				String Appointment_location = Result.getString("Appointment_location");
				String Appointment_room = Result.getString("Appointment_room");
				
				
				System.out.printf("%s, %s\n", Appointment_id, Appointment_location );
			}
		}
		}

	