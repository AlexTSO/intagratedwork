import java.sql.*;

public class StaffMembersRetrieve {

	public static void main(String[] args) throws SQLException {
		
		Connection Connection = null;
		PreparedStatement  Statement = null;
        ResultSet Result = null;
        
        try {
        	 // get a connection 
        	Class.forName("com.mysql.jdbc.Driver");
        	Connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/calendar"/*url*/, "root"/*user*/,"Fifastreetv2"/*password*/);	
          //prepare statement
        	Statement = Connection.prepareStatement("select * from staffmembers where staff_date_of_birth > ? and staff_last_name = ? ");
			
			// 3. Set the parameters
        	 Statement.setDouble(1, 1980-01-01);
        	 Statement.setString(2, "Ali");
			
			// 4. Execute SQL query
			Result = Statement.executeQuery();
			
			// 5. Display the result set
			display(Result);
			
		//New prepare statement
			System.out.println("\nRedo of the prepared statement\n");
			
			// 6. Set the parameters
			Statement.setDouble(1, 1990-01-01);
			Statement.setString(2, "Daniels");
			
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
		String staff_id = Result.getString("staff_id");
		String staff_first_name = Result.getString("staff_first_name");
		String staff_last_name = Result.getString("staff_last_name");
		Date staff_date_of_birth = Result.getDate("staff_date_of_birth");
		String staff_email_address = Result.getString("staff_email_address");
		String staff_phone_number = Result.getString("staff_phone_number");
		String staff_address = Result.getString("staff_address");
		
		System.out.printf("%s, %s, %s\n", staff_last_name, staff_first_name, staff_date_of_birth);
	}
}
}

