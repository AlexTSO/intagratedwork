import java.sql.*;
/*Qais Al-Hatmi Sn:11848659
 * Nikolaos Alexandropoulos Sn:13830689
 * Alex Osbourne Sn:13815859
 */
 
public class Insert {

	public static void main(String[] args) throws SQLException {
	    
        Connection Connection = null;
	     Statement Statement = null;
 
        try {
            // get a connection 
        	Class.forName("com.mysql.jdbc.Driver");
        	Connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/calendar"/*url*/, "root"/*user*/,"Fifastreetv2"/*password*/);	
          //create a statement
        	Statement = Connection.createStatement();
 
            // execute queries
            //Staff Members
            String mysql = "insert into staffmembers "
                    + " (staff_id, staff_first_name, staff_last_name, staff_date_of_birth, staff_email_address, staff_phone_number, staff_address)"
                    + " values ('493', 'Humood', 'Ali','1983-12-01','humoodi@gmail.com','0742910502', '14 Coleman Street')";
            //Colleague List
            String mysql1 = "insert into `colleagueslist` "
                    + " (`Colleague_id`, `Colleague_first_name`, `Colleague_sur_name`, `Colleague_email_address`, `Colleague_date_of_birth`, `Colleague_Address`, `Staff_id`)"
                    + " values ('294', 'Humood', 'Ali', 'humoodi@gmail.com', '1983-12-01','14 Coleman Street','493')";
            //Appointment Details
            String mysql2= "insert into appointmentdetails "
                       + " (appointment_id, appointment_title, appointment_description)"
                      + " values ('319', 'Meeting With Course Leaders', 'final meeting for all course leaders')";
            //Appointment Area
            String mysql3 = "insert into appointmentarea "
                     + " (appointment_id, appointment_location, appointment_room)"
                     + " values ('319', 'Cockcroft', '515')";
            //Appointment Time
           String mysql4 = "insert into appointmenttime "
                    + " (appointment_id, appointment_date, appointment_start_time)"
                    + " values ('319', '2015-05-31', '16:30')";
          
           Statement.executeUpdate(mysql);
           Statement.executeUpdate(mysql1);
           Statement.executeUpdate(mysql2);
           Statement.executeUpdate(mysql3);
     Statement.executeUpdate(mysql4);
      
            System.out.println("Insert complete");
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


