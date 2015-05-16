import java.sql.*;

public class Driver {

	public static void main(String[] args) throws SQLException {
		
		Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;
        
	try{
		//get connection
		Class.forName("com.mysql.jdbc.Driver");
		myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/calendar"/*url*/, "root"/*user*/,"Fifastreetv2"/*password*/);
		
		//get statement
		 myStmt = myConn.createStatement();
		//execute queries
		  myRs = myStmt.executeQuery("select * from staffmembers");   
		  myRs= myStmt.executeQuery("select * from colleaguelist");
		  myRs= myStmt.executeQuery("select * from appointmentdetails");
		  myRs= myStmt.executeQuery("select * from appointmenttime");
		  myRs= myStmt.executeQuery("select * from appointmenarea");
		//process result set
		while (myRs.next()) {
			System.out.println(myRs.getString("staff_last_name") + ", " + myRs.getString("staff_first_name"));
		}
			
	}
	catch (Exception ecx){  
		ecx.printStackTrace();
	}
	finally {					
        if (myRs != null) {
            myRs.close();
        }

        if (myStmt != null) {
            myStmt.close();
        }

        if (myConn != null) {
            myConn.close();
        }
    }
}
}
	



