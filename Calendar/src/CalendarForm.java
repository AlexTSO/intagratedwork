 

import java.awt.Toolkit;

import java.awt.event.*;

import java.awt.*;

import java.awt.event.WindowEvent;

/*Qais Al-Hatmi Sn:11848659
 * Nikolaos Alexandropoulos Sn:13830689
 * Alex Osbourne Sn:13815859
 */
 

public class CalendarForm extends javax.swing.JFrame {

 

    

    public CalendarForm() {

        initComponents();

    }

 

    

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          

    private void initComponents() {

 

        jButton15 = new javax.swing.JButton();

        jLabel1 = new javax.swing.JLabel();

        jLabel2 = new javax.swing.JLabel();

        jLabel3 = new javax.swing.JLabel();

        jLabel4 = new javax.swing.JLabel();

        jLabel5 = new javax.swing.JLabel();

        jLabel6 = new javax.swing.JLabel();

        jLabel7 = new javax.swing.JLabel();

        jButton1 = new javax.swing.JButton();

        jButton2 = new javax.swing.JButton();

        jButton3 = new javax.swing.JButton();

        jButton4 = new javax.swing.JButton();

        jButton5 = new javax.swing.JButton();

        jButton6 = new javax.swing.JButton();

        jButton7 = new javax.swing.JButton();

        jButton8 = new javax.swing.JButton();

        jButton9 = new javax.swing.JButton();

        jButton10 = new javax.swing.JButton();

        jButton11 = new javax.swing.JButton();

        jButton12 = new javax.swing.JButton();

        jButton13 = new javax.swing.JButton();

        jButton14 = new javax.swing.JButton();

        jButton16 = new javax.swing.JButton();

        jButton17 = new javax.swing.JButton();

        jButton18 = new javax.swing.JButton();

        jButton19 = new javax.swing.JButton();

        jButton20 = new javax.swing.JButton();

        jButton21 = new javax.swing.JButton();

        jButton22 = new javax.swing.JButton();

        jButton23 = new javax.swing.JButton();

        jButton24 = new javax.swing.JButton();

        jButton25 = new javax.swing.JButton();

        jButton26 = new javax.swing.JButton();

        jButton27 = new javax.swing.JButton();

        jButton28 = new javax.swing.JButton();

        jButton29 = new javax.swing.JButton();

        jButton30 = new javax.swing.JButton();

        jButton31 = new javax.swing.JButton();

        jButton32 = new javax.swing.JButton();

        jButton33 = new javax.swing.JButton();

        jButton34 = new javax.swing.JButton();

        jButton35 = new javax.swing.JButton();

        jButton36 = new javax.swing.JButton();

 

        jButton15.setText("jButton1");

 

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

 

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        //
        CalendarForm cal = CalendarForm.getInstance();
        cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("dd:MM:YYYY");
        //

        jLabel1.setText("" + sdf.format(cal.getTime()));


        jLabel1.setText("Current Date");

 

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("Current Time");
        //
        Calendar cal2 = Calendar.getInstance();
        cal.getTime();
        SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
        //

       jLabel2.setText("" + sdf2.format(cal2.getTime()));


 

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setText("Upcomming Events");

        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

 

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel4.setText("Text");

        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

 

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setText("Frends");

 

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel6.setText("Txt");

        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);

 

        jLabel7.setText("Notes for the user to save maybe need button");

        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);

 

        jButton1.setText("day 1");

        jButton1.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton1ActionPerformed(evt);

            }

        });

 

        jButton2.setText("day 2");

        jButton2.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton2ActionPerformed(evt);

            }

        });

 

        jButton3.setText("day 3");

        jButton3.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton3ActionPerformed(evt);

            }

        });

 

        jButton4.setText("day 4");

        jButton4.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton4ActionPerformed(evt);

            }

        });

 

        jButton5.setText("day 5");

        jButton5.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton5ActionPerformed(evt);

            }

        });

 

        jButton6.setText("day 6");

        jButton6.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton6ActionPerformed(evt);

            }

        });

 

        jButton7.setText("day 7");

        jButton7.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton7ActionPerformed(evt);

            }

        });

 

        jButton8.setText("day 8");

        jButton8.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton8ActionPerformed(evt);

            }

        });

 

        jButton9.setText("day 9");

        jButton9.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton9ActionPerformed(evt);

            }

        });

 

        jButton10.setText("day 10");

        jButton10.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton10ActionPerformed(evt);

            }

        });

 

        jButton11.setText("dat 11");

        jButton11.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton11ActionPerformed(evt);

            }

        });

 

        jButton12.setText("day 12");

        jButton12.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton12ActionPerformed(evt);

            }

        });

 

        jButton13.setText("day 13");

        jButton13.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton13ActionPerformed(evt);

            }

        });

 

        jButton14.setText("day 14");

        jButton14.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton14ActionPerformed(evt);

            }

        });

 

        jButton16.setText("day 15");

        jButton16.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton16ActionPerformed(evt);

            }

        });

 

        jButton17.setText("day 16");

        jButton17.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton17ActionPerformed(evt);

            }

        });

 

        jButton18.setText("day 17");

        jButton18.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton18ActionPerformed(evt);

            }

        });

 

        jButton19.setText("day 18");

        jButton19.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton19ActionPerformed(evt);

            }

        });

 

        jButton20.setText("day 19");

        jButton20.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton20ActionPerformed(evt);

            }

        });

 

        jButton21.setText("day 20");

        jButton21.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton21ActionPerformed(evt);

            }

        });

 

        jButton22.setText("day 21");

        jButton22.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton22ActionPerformed(evt);

            }

        });

 

        jButton23.setText("day 22");

        jButton23.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton23ActionPerformed(evt);

            }

        });

 

        jButton24.setText("dat 23");

        jButton24.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton24ActionPerformed(evt);

            }

        });

 

        jButton25.setText("day 24");

        jButton25.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton25ActionPerformed(evt);

            }

        });

 

        jButton26.setText("day 25");

        jButton26.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton26ActionPerformed(evt);

            }

        });

 

        jButton27.setText("day 26");

        jButton27.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton27ActionPerformed(evt);

            }

        });

 

        jButton28.setText("day 27");

        jButton28.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton28ActionPerformed(evt);

            }

        });

 

        jButton29.setText("day 28");

        jButton29.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton29ActionPerformed(evt);

            }

        });

 

        jButton30.setText("day 29");

        jButton30.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton30ActionPerformed(evt);

            }

        });

 

        jButton31.setText("day 30");

        jButton31.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton31ActionPerformed(evt);

            }

        });

 

        jButton32.setText("day 31");

        jButton32.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton32ActionPerformed(evt);

            }

        });

 

        jButton33.setText("null");

 

        jButton34.setText("null");

 

        jButton35.setText("null");

 

        jButton36.setText("null");

 

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());

        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(

            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(layout.createSequentialGroup()

                .addContainerGap()

                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)

                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)

                    .addGroup(layout.createSequentialGroup()

                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addGap(18, 18, 18)

                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addGap(18, 18, 18)

                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addGap(18, 18, 18)

                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addGap(18, 18, 18)

                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addGap(18, 18, 18)

                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addGap(18, 18, 18)

                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))

                    .addGroup(layout.createSequentialGroup()

                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addGap(18, 18, 18)

                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addGap(18, 18, 18)

                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addGap(18, 18, 18)

                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addGap(18, 18, 18)

                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addGap(18, 18, 18)

                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addGap(18, 18, 18)

                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))

                    .addGroup(layout.createSequentialGroup()

                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addGap(18, 18, 18)

                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addGap(18, 18, 18)

                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addGap(18, 18, 18)

                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addGap(18, 18, 18)

                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addGap(18, 18, 18)

                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addGap(18, 18, 18)

                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))

                    .addGroup(layout.createSequentialGroup()

                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                            .addGroup(layout.createSequentialGroup()

                                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                                .addGap(18, 18, 18)

                                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                                .addGap(18, 18, 18)

                                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                                .addGap(18, 18, 18)

                                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                                .addGap(18, 18, 18)

                                .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))

                            .addGroup(layout.createSequentialGroup()

                                .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                                .addGap(18, 18, 18)

                                .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                                .addGap(18, 18, 18)

                                .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                                .addGap(18, 18, 18)

                                .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                                .addGap(18, 18, 18)

                                .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))

                        .addGap(18, 18, 18)

                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                            .addGroup(layout.createSequentialGroup()

                                .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                                .addGap(18, 18, 18)

                                .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))

                            .addGroup(layout.createSequentialGroup()

                                .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                                .addGap(18, 18, 18)

                                .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))

                .addGap(33, 33, 33)

                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)

                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))

                .addContainerGap())

        );

        layout.setVerticalGroup(

            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(layout.createSequentialGroup()

                .addContainerGap()

                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)

                    .addGroup(layout.createSequentialGroup()

                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)

                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)

                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))

                        .addGap(29, 29, 29)

                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)

                            .addGroup(layout.createSequentialGroup()

                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))

                                .addGap(18, 18, 18)

                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))

                                .addGap(18, 18, 18)

                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))

                                .addGap(18, 18, 18)

                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))

                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                                        .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                                        .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                                        .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                                        .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                                        .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))

                                    .addComponent(jButton30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addComponent(jButton31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))

                    .addGroup(layout.createSequentialGroup()

                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addGap(20, 20, 20)

                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addGap(18, 18, 18)

                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))

                .addContainerGap(24, Short.MAX_VALUE))

        );

 

        pack();

    }// </editor-fold>                        

    

    public void close(){

 

        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);

        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);

    }

    

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         

        close();

        eventpopup popup = new eventpopup();

        popup.setVisible(true);

    }                                        

 

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         

        close();

        eventpopup popup = new eventpopup();

        popup.setVisible(true);

    }                                        

 

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         

        close();

        eventpopup popup = new eventpopup();

        popup.setVisible(true);

    }                                        

 

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         

        close();

        eventpopup popup = new eventpopup();

        popup.setVisible(true);

    }                                        

 

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         

        close();

        eventpopup popup = new eventpopup();

        popup.setVisible(true);

    }                                        

 

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         

        close();

        eventpopup popup = new eventpopup();

        popup.setVisible(true);

    }                                        

 

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         

        close();

        eventpopup popup = new eventpopup();

        popup.setVisible(true);

    }                                        

 

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         

        close();

        eventpopup popup = new eventpopup();

        popup.setVisible(true);

    }                                        

 

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         

        close();

        eventpopup popup = new eventpopup();

        popup.setVisible(true);

    }                                        

 

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                          

        close();

        eventpopup popup = new eventpopup();

        popup.setVisible(true);

    }                                         

 

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {                                          

        close();

        eventpopup popup = new eventpopup();

        popup.setVisible(true);

    }                                         

 

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {                                          

        close();

        eventpopup popup = new eventpopup();

        popup.setVisible(true);

    }                                         

 

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {                                          

        close();

        eventpopup popup = new eventpopup();

        popup.setVisible(true);

    }                                         

 

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {                                          

        close();

        eventpopup popup = new eventpopup();

        popup.setVisible(true);

    }                                         

 

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {                                          

        close();

        eventpopup popup = new eventpopup();

        popup.setVisible(true);

    }                                         

 

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {                                          

        close();

        eventpopup popup = new eventpopup();

        popup.setVisible(true);

    }                                         

 

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {                                          

        close();

        eventpopup popup = new eventpopup();

        popup.setVisible(true);

    }                                         

 

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {                                          

        close();

        eventpopup popup = new eventpopup();

        popup.setVisible(true);

    }                                         

 

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {                                          

        close();

        eventpopup popup = new eventpopup();

        popup.setVisible(true);

    }                                         

 

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {                                          

        close();

        eventpopup popup = new eventpopup();

        popup.setVisible(true);

    }                                         

 

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {                                          

        close();

        eventpopup popup = new eventpopup();

        popup.setVisible(true);

    }                                         

 

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {                                          

        close();

        eventpopup popup = new eventpopup();

        popup.setVisible(true);

    }                                         

 

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {                                          

        close();

        eventpopup popup = new eventpopup();

        popup.setVisible(true);

    }                                         

 

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {                                          

        close();

        eventpopup popup = new eventpopup();

        popup.setVisible(true);

    }                                         

 

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {                                          

        close();

        eventpopup popup = new eventpopup();

        popup.setVisible(true);

    }                                         

 

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {                                          

        close();

        eventpopup popup = new eventpopup();

        popup.setVisible(true);

    }                                         

 

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {                                          

        close();

        eventpopup popup = new eventpopup();

        popup.setVisible(true);

    }                                         

 

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {                                          

        close();

        eventpopup popup = new eventpopup();

        popup.setVisible(true);

    }                                         

 

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {                                          

        close();

        eventpopup popup = new eventpopup();

        popup.setVisible(true);

    }                                         

 

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {                                          

        close();

        eventpopup popup = new eventpopup();

        popup.setVisible(true);

    }                                         

 

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {                                          

        close();

        eventpopup popup = new eventpopup();

        popup.setVisible(true);

    }                                         

 

    /**

     * @param args the command line arguments

     */

    public static void main(String args[]) {

        /* Set the Nimbus look and feel */

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">

        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.

         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 

         */

        try {

            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {

                if ("Nimbus".equals(info.getName())) {

                    javax.swing.UIManager.setLookAndFeel(info.getClassName());

                    break;

                }

            }

        } catch (ClassNotFoundException ex) {

            java.util.logging.Logger.getLogger(CalendarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {

            java.util.logging.Logger.getLogger(CalendarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {

            java.util.logging.Logger.getLogger(CalendarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {

            java.util.logging.Logger.getLogger(CalendarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }

        //</editor-fold>

 

        /* Create and display the form */

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                new CalendarForm().setVisible(true);

            }

        });

    }

 

    // Variables declaration - do not modify                     

    private javax.swing.JButton jButton1;

    private javax.swing.JButton jButton10;

    private javax.swing.JButton jButton11;

    private javax.swing.JButton jButton12;

    private javax.swing.JButton jButton13;

    private javax.swing.JButton jButton14;

    private javax.swing.JButton jButton15;

    private javax.swing.JButton jButton16;

    private javax.swing.JButton jButton17;

    private javax.swing.JButton jButton18;

    private javax.swing.JButton jButton19;

    private javax.swing.JButton jButton2;

    private javax.swing.JButton jButton20;

    private javax.swing.JButton jButton21;

    private javax.swing.JButton jButton22;

    private javax.swing.JButton jButton23;

    private javax.swing.JButton jButton24;

    private javax.swing.JButton jButton25;

    private javax.swing.JButton jButton26;

    private javax.swing.JButton jButton27;

    private javax.swing.JButton jButton28;

    private javax.swing.JButton jButton29;

    private javax.swing.JButton jButton3;

    private javax.swing.JButton jButton30;

    private javax.swing.JButton jButton31;

    private javax.swing.JButton jButton32;

    private javax.swing.JButton jButton33;

    private javax.swing.JButton jButton34;

    private javax.swing.JButton jButton35;

    private javax.swing.JButton jButton36;

    private javax.swing.JButton jButton4;

    private javax.swing.JButton jButton5;

    private javax.swing.JButton jButton6;

    private javax.swing.JButton jButton7;

    private javax.swing.JButton jButton8;

    private javax.swing.JButton jButton9;

    private javax.swing.JLabel jLabel1;

    private javax.swing.JLabel jLabel2;

    private javax.swing.JLabel jLabel3;

    private javax.swing.JLabel jLabel4;

    private javax.swing.JLabel jLabel5;

    private javax.swing.JLabel jLabel6;

    private javax.swing.JLabel jLabel7;

    // End of variables declaration                   

}

 
