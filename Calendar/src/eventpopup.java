import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;
import javax.swing.*;
 
/*Qais Al-Hatmi Sn:11848659
 * Nikolaos Alexandropoulos Sn:13830689
 * Alex Osbourne Sn:13815859
 */
 

public class eventpopup extends javax.swing.JFrame {

 

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public eventpopup() {

        initComponents();

    }

 

    @SuppressWarnings("unchecked")

    // <editor-fold default state="collapsed" description="Generated Code">                          

    private void initComponents() {

 

        jTextField2 = new javax.swing.JTextField();

        jTextField4 = new javax.swing.JTextField();

        jButton1 = new javax.swing.JButton();

        jLabel1 = new javax.swing.JLabel();

        jTextField1 = new javax.swing.JTextField();

        jLabel2 = new javax.swing.JLabel();

        jTextField3 = new javax.swing.JTextField();

        jLabel3 = new javax.swing.JLabel();

        jTextField5 = new javax.swing.JTextField();

        jTextField6 = new javax.swing.JTextField();

        jLabel4 = new javax.swing.JLabel();

        jLabel5 = new javax.swing.JLabel();

        jTextField7 = new javax.swing.JTextField();

        jLabel6 = new javax.swing.JLabel();

 

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

 

        jButton1.setText("Save and CLose");

        jButton1.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton1ActionPerformed(evt);

            }
           

        });

 

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setText("Name of Event");

 

        jTextField1.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jTextField1ActionPerformed(evt);

            }

        });

 

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setText("Event Location");

 

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setText("Time");

 

        jTextField6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

 

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setText("From:");

 

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setText("Untill:");

 

        jTextField7.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

 

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setText("Notes");

 

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());

        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(

            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(layout.createSequentialGroup()

                .addContainerGap()

                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()

                        .addGap(0, 0, Short.MAX_VALUE)

                        .addComponent(jButton1))

                    .addGroup(layout.createSequentialGroup()

                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)

                            .addGroup(layout.createSequentialGroup()

                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)

                                .addGap(18, 18, 18)

                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))

                            .addGroup(layout.createSequentialGroup()

                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)

                                .addGap(18, 18, 18)

                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addGroup(layout.createSequentialGroup()

                                        .addGap(220, 220, 220)

                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)

                                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))))

                            .addGroup(layout.createSequentialGroup()

                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))

                                .addGap(18, 18, 18)

                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                                    .addComponent(jTextField7)

                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))

                        .addGap(0, 12, Short.MAX_VALUE)))

                .addContainerGap())

        );

        layout.setVerticalGroup(

            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()

                .addGap(23, 23, 23)

                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)

                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addGap(18, 18, 18)

                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)

                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addGap(18, 18, 18)

                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)

                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)

                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addGap(12, 12, 12)

                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)

                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addGap(18, 18, 18)

                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addComponent(jTextField7)

                    .addGroup(layout.createSequentialGroup()

                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addGap(0, 39, Short.MAX_VALUE)))

                .addGap(18, 18, 18)

                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)

                .addContainerGap())

        );

 

        pack();

    }// </editor-fold>                        

        

    public void close(){

 

        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);

        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);

    }

    

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         

        

        

        

        close();

        CalendarForm popup = new CalendarForm();

        popup.setVisible(true);

    }                                        
    


    	//}//end JDBCExamplevoid JButton1saveActionPerformed(java.awt.event.ActionEvent evt) {
    //
    	//try{	String sql ="insert into appointmentdetails (Appointment_id) value (?) ";
    	
    	/*pst=conn.prepareStatment(sql);
    	pst.setString(1, txt_Emplyeeid.getText());
    	
    	
    	
    	
    	
    	pst.exacute();
    	
    }
    catch (Exception e)
    {
    
		JOptionPane.showMessageDialog(null, e);
    }
    }*/
    
    
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            

        // TODO add your handling code here:

    }                                           

 

    public static void eventpopup(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">

        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.

         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 

         */
//    	 private void Cmd_saveActionPerformed(java.awt.event.ActionEvent evt)

        try {

            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {

                if ("Nimbus".equals(info.getName())) {

                    javax.swing.UIManager.setLookAndFeel(info.getClassName());

                    break;

                }

            }

        } catch (ClassNotFoundException ex) {

            java.util.logging.Logger.getLogger(eventpopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {

            java.util.logging.Logger.getLogger(eventpopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {

            java.util.logging.Logger.getLogger(eventpopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {

            java.util.logging.Logger.getLogger(eventpopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }

        //</editor-fold>

 

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                new eventpopup().setVisible(true);

            }

        });

    }

 

    // Variables declaration - do not modify                     

    private javax.swing.JButton jButton1;

    private javax.swing.JLabel jLabel1;

    private javax.swing.JLabel jLabel2;

    private javax.swing.JLabel jLabel3;

    private javax.swing.JLabel jLabel4;

    private javax.swing.JLabel jLabel5;

    private javax.swing.JLabel jLabel6;

    private javax.swing.JTextField jTextField1;
   
    private javax.swing.JTextField jTextField2;

    private javax.swing.JTextField jTextField3;

    private javax.swing.JTextField jTextField4;

    private javax.swing.JTextField jTextField5;

    private javax.swing.JTextField jTextField6;

    private javax.swing.JTextField jTextField7;
    
    /*Connection connection = null;
    String query = "INSERT INTO Appointments" + " (Appointment_title, Appointment_location, Appointment_start_time, Appointment_end_time, Appointment_description) VALUES"+"(?,?,?,?,?)";
    PreparedStatement pst = connection.prepareStatement(query);

    pst.setString(1, jTextField1);
    pst.setString(2, jTextField3);
    pst.setString(3, jTextField5);
    pst.setString(4, jTextField6);       //this code is one of the many attempt we used to try to get the eventpopup to save the credentials
    pst.setString(5,  jTextField);			//however unfortunately we were unsuccessful 
    pst.executeUpdate(),
    pst.close();
catch (Exception e){
   JOptionPane.showMessageDialog (null, e);
}
*/
    // End of variables declaration                   

}
