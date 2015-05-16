import java.sql.*;


public class ColleagueListRetrieve {
	
	public static void main(String[] args) throws SQLException {
		
		Connection Connection = null;
		PreparedStatement  Statement = null;
        ResultSet Result = null;
        
        try {
        	 // get a connection 
        	Class.forName("com.mysql.jdbc.Driver");
        	Connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/calendar"/*url*/, "root"/*user*/,"Fifastreetv2"/*password*/);	
          //prepare statement
        	Statement = Connection.prepareStatement("select * from colleagueslist where colleague_date_of_birth > ? and colleague_first_name = ? ");
			
			// 3. Set the parameters
        	 Statement.setDouble(1, 1990-01-01);
        	 Statement.setString(2, "Humood");
			
			// 4. Execute SQL query
			Result = Statement.executeQuery();
			
			// 5. Display the result set
			display(Result);
			
		//New prepare statement
			System.out.println("\nRedo of the prepared statement\n");
			
			// 6. Set the parameters
			Statement.setDouble(1, 1990-01-01);
			Statement.setString(2, "Flint");
			
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
		String colleague_id = Result.getString("colleague_id");
		String colleague_first_name = Result.getString("colleague_first_name");
		String colleague_sur_name = Result.getString("colleague_sur_name");
		String colleague_email_address = Result.getString("colleague_email_address");
		Date colleague_date_of_birth = Result.getDate("colleague_date_of_birth");
		String colleague_address = Result.getString("colleague_address");
		String Staff_id = Result.getString("Staff_id");
		
		System.out.printf("%s, %s, %s\n", colleague_date_of_birth, colleague_first_name, colleague_sur_name);
	}
}
}
