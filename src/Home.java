/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author CodeGeass
 */
import java.text.DateFormat;
import java.util.Date;
import java.sql.*;
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jRadioButton2 = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox();
        jRadioButton4 = new javax.swing.JRadioButton();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        jComboBox6 = new javax.swing.JComboBox();
        jButton5 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jButton4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jCalendarButton3 = new net.sourceforge.jcalendarbutton.JCalendarButton();
        jCalendarButton1 = new net.sourceforge.jcalendarbutton.JCalendarButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRadioButton2.setText("One Way");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 90, 20));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Destination"}));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 150, 21));

        jRadioButton4.setText("Round Trip");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 90, 20));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Source"}));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 150, 21));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel3.setText("From");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 70, -1));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel4.setText("To");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 65, -1));

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel5.setText("    Book International and Domestic Flight Tickets");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 570, 60));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel6.setText("Children(2-12 yrs)");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 120, 20));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel7.setText("Adults(12+yrs)");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, 91, 20));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel8.setText("Infants(0-2 yrs)");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 91, 20));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel9.setText("Class");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 69, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Class", "Business", "Executive" ,"Economic" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 120, 21));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0","1", "2", "3", "4" }));
        getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 50, -1));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0","1", "2", "3", "4" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 50, -1));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0","1", "2", "3", "4","5","6" }));
        getContentPane().add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, 50, -1));

        jButton5.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jButton5.setText("Signup");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 160, 100, 40));

        jToggleButton1.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jToggleButton1.setText("International");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 110, 30));

        jToggleButton2.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jToggleButton2.setText("Domestic");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 110, 30));

        jButton4.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jButton4.setText("Login");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 100, 100, 40));

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel10.setText("Departure");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, 20));

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel11.setText("Return");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 49, 20));

        jTextField1.setText("Select Date");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 80, -1));

        jTextField2.setText("Select Date");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 80, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Search Flights");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 110, 40));

        jButton6.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jButton6.setText("Signup");
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 160, 100, 30));

        jCalendarButton3.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCalendarButton3PropertyChange(evt);
            }
        });
        getContentPane().add(jCalendarButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 30, -1));

        jCalendarButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCalendarButton1ActionPerformed(evt);
            }
        });
        jCalendarButton1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCalendarButton1PropertyChange(evt);
            }
        });
        getContentPane().add(jCalendarButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 30, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Untitled.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 60));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("KNIPPO AIRWAYS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 160, 20));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CD1886_Z.jpg"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents
int r;
    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jCalendarButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCalendarButton1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jCalendarButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jCalendarButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCalendarButton2ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jCalendarButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            try {
                 Class.forName("oracle.jdbc.driver.OracleDriver");
            } catch (ClassNotFoundException ex) {
                
            }
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","prathma");
           // System.out.println("shivam");
            Statement st = con.createStatement();
            String sfrom, sto, sclass, sdep, sret,sinf, schild, sadults;
            sfrom = (String)jComboBox2.getSelectedItem();
            sto = (String)jComboBox1.getSelectedItem();
            sclass = (String)jComboBox3.getSelectedItem();
            sdep = jTextField2.getText();
            sret = jTextField1.getText();
            sinf = (String)jComboBox4.getSelectedItem();
            schild = (String)jComboBox5.getSelectedItem();
            sadults = (String)jComboBox6.getSelectedItem();
            //String temp = "Select * from ADMIN_TABLE";
            /*ResultSet rs1 = st.executeQuery(temp);
            while (rs1.next()) {
                System.out.println(rs1.getString(1));
            }*/
            //FLIGHT_NAME, BUS_SEATS_AVL, EX_SEATS_AVL, ECO_SEATS_AVL from domestic_flights, international_flights, DATE_OF_JOURNEY, DEP_TIME, FROM Flight_timings
            
        
            if((!jRadioButton2.isSelected() && !jRadioButton4.isSelected())|| (schild.equals("0")&&sadults.equals("0")) || (sdep.equals("Select Date")) || (sfrom.equals("Source") || sto.equals("Destination"))||(sclass.equals("Select Class"))) {
                  AllfieldsEnterHome afr = new AllfieldsEnterHome();
                  afr.setVisible(true);
         
            }
            if(jRadioButton2.isSelected() && !sret.equals("Select Date") && sdep.equals("Select Date")) {
                AllfieldsEnterHome af = new AllfieldsEnterHome();
                af.setVisible(true);
            }
             if(jRadioButton4.isSelected() && sret.equals("Select Date") && sdep.equals("Select Date")) {
                AllfieldsEnterHome af = new AllfieldsEnterHome();
                af.setVisible(true);
            }
           if(jRadioButton2.isSelected()) {
             if(jToggleButton1.isSelected()) {
                 //System.out.println("ll");
                 String sq = "SELECT  INTERNATIONAL_FLIGHTS.FLIGHT_NO,  INTERNATIONAL_FLIGHTS.BUS_SEATS_AVL,  INTERNATIONAL_FLIGHTS.EX_SEATS_AVL,  INTERNATIONAL_FLIGHTS.ECO_SEATS_AVL, FLIGHT_TIMINGS.DATE_OF_JOURNEY, FLIGHT_TIMINGS.ARRIVAL_TIME, FLIGHT_TIMINGS.DEPARTURE_TIME FROM INTERNATIONAL_FLIGHTS INNER JOIN FLIGHT_TIMINGS ON   INTERNATIONAL_FLIGHTS.FLIGHT_NO = FLIGHT_TIMINGS.FLIGHT_NO WHERE INTERNATIONAL_FLIGHTS.ORIGIN = '"+sfrom+"' AND INTERNATIONAL_FLIGHTS.DESTINATION = '"+sto+"' AND DATE_OF_JOURNEY = '"+sdep+"'";
                 //String sq = "SELECT * ADMIN_TABLE";
                 ResultSet re = st.executeQuery(sq);
                 
                 SearchedFlightsfromHome sf = new SearchedFlightsfromHome();
                 while (re.next()) {
                     String ap[] = new String[100];
                     for (int i = 0; i < 7; i ++) {
                         ap[i] = re.getString(i+1);
                         System.out.println(re.getString(i+1));
                     }
                     sf.executequery(ap);
                   //  sf.callt(1);
                // System.out.println (re.getStri;ng(2));
                 }
            
                 sf.setVisible(true);
               //  sf.org (sfrom, sto);
               //  sf.executequery("yuy");
               
             } 
             if(jToggleButton2.isSelected()) {
                 String sq = "SELECT  DOMESTIC_FLIGHTS.FLIGHT_NO,  DOMESTIC_FLIGHTS.BUS_SEATS_AVL,  DOMESTIC_FLIGHTS.EX_SEATS_AVL,  DOMESTIC_FLIGHTS.ECO_SEATS_AVL, FLIGHT_TIMINGS.DATE_OF_JOURNEY, FLIGHT_TIMINGS.ARRIVAL_TIME, FLIGHT_TIMINGS.DEPARTURE_TIME FROM DOMESTIC_FLIGHTS INNER JOIN FLIGHT_TIMINGS ON   DOMESTIC_FLIGHTS.FLIGHT_NO = FLIGHT_TIMINGS.FLIGHT_NO WHERE DOMESTIC_FLIGHTS.ORIGIN = '"+sfrom+"' AND DOMESTIC_FLIGHTS.DESTINATION = '"+sto+"' AND DATE_OF_JOURNEY = '"+sdep+"'";
               
                 ResultSet re = st.executeQuery(sq);
                 SearchedFlightsfromHome sf = new SearchedFlightsfromHome();
                 //System.out.println ("Connect");
                 while (re.next()) {
                     String ap[] = new String[100];
                     for (int i = 0; i < 7; i ++) {
                         ap[i] = re.getString(i+1);
                         System.out.println(re.getString(i+1));
                     }
                     sf.executequery(ap);
                // System.out.println (re.getStri;ng(2));
                 }
                 sf.setVisible(true);
                 //sf.executequery(re);
                 //System.out.println ("Connect");
             }
           } else if(jRadioButton4.isSelected()) {
               if(jToggleButton1.isSelected()) {
                 String sq = "SELECT  INTERNATIONAL_FLIGHTS.FLIGHT_NO,  INTERNATIONAL_FLIGHTS.BUS_SEATS_AVL,  INTERNATIONAL_FLIGHTS.EX_SEATS_AVL,  INTERNATIONAL_FLIGHTS.ECO_SEATS_AVL, FLIGHT_TIMINGS.DATE_OF_JOURNEY, FLIGHT_TIMINGS.ARRIVAL_TIME, FLIGHT_TIMINGS.DEPARTURE_TIME FROM INTERNATIONAL_FLIGHTS INNER JOIN FLIGHT_TIMINGS ON   INTERNATIONAL_FLIGHTS.FLIGHT_NO = FLIGHT_TIMINGS.FLIGHT_NO WHERE INTERNATIONAL_FLIGHTS.ORIGIN = '"+sfrom+"' AND INTERNATIONAL_FLIGHTS.DESTINATION = '"+sto+"' AND DATE_OF_JOURNEY = '"+sdep+"' UNION SELECT  INTERNATIONAL_FLIGHTS.FLIGHT_NO,  INTERNATIONAL_FLIGHTS.BUS_SEATS_AVL,  INTERNATIONAL_FLIGHTS.EX_SEATS_AVL,  INTERNATIONAL_FLIGHTS.ECO_SEATS_AVL, FLIGHT_TIMINGS.DATE_OF_JOURNEY, FLIGHT_TIMINGS.ARRIVAL_TIME, FLIGHT_TIMINGS.DEPARTURE_TIME  FROM INTERNATIONAL_FLIGHTS INNER JOIN FLIGHT_TIMINGS ON   INTERNATIONAL_FLIGHTS.FLIGHT_NO = FLIGHT_TIMINGS.FLIGHT_NO WHERE INTERNATIONAL_FLIGHTS.ORIGIN = '"+sto+"' AND INTERNATIONAL_FLIGHTS.DESTINATION = '"+sfrom+"' AND DATE_OF_JOURNEY = '"+sret+"'";
                 
                 ResultSet re = st.executeQuery(sq);
                 
                 SearchedFlightsfromHome sf = new SearchedFlightsfromHome();
                 //System.out.println ("Connect");
                 while (re.next()) {
                     String ap[] = new String[100];
                     for (int i = 0; i < 7; i ++) {
                         ap[i] = re.getString(i+1);
                         System.out.println(re.getString(i+1));
                     }
                     sf.executequery(ap);
                // System.out.println (re.getStri;ng(2));
                 }
                 sf.setVisible(true);
                 
                 //ResultSet re1 = st.executeQuery(sq1);
                 //sf.executequery(re1);
               
             } 
             if(jToggleButton2.isSelected()) {
                 String sq = "SELECT  DOMESTIC_FLIGHTS.FLIGHT_NO,  DOMESTIC_FLIGHTS.BUS_SEATS_AVL,  DOMESTIC_FLIGHTS.EX_SEATS_AVL,  DOMESTIC_FLIGHTS.ECO_SEATS_AVL, FLIGHT_TIMINGS.DATE_OF_JOURNEY, FLIGHT_TIMINGS.ARRIVAL_TIME, FLIGHT_TIMINGS.DEPARTURE_TIME FROM DOMESTIC_FLIGHTS INNER JOIN FLIGHT_TIMINGS ON   DOMESTIC_FLIGHTS.FLIGHT_NO = FLIGHT_TIMINGS.FLIGHT_NO WHERE DOMESTIC_FLIGHTS.ORIGIN = '"+sfrom+"' AND DOMESTIC_FLIGHTS.DESTINATION = '"+sto+"' AND DATE_OF_JOURNEY = '"+sdep+"' UNION SELECT  DOMESTIC_FLIGHTS.FLIGHT_NO,  DOMESTIC_FLIGHTS.BUS_SEATS_AVL,  DOMESTIC_FLIGHTS.EX_SEATS_AVL,  DOMESTIC_FLIGHTS.ECO_SEATS_AVL, FLIGHT_TIMINGS.DATE_OF_JOURNEY, FLIGHT_TIMINGS.ARRIVAL_TIME, FLIGHT_TIMINGS.DEPARTURE_TIME FROM DOMESTIC_FLIGHTS INNER JOIN FLIGHT_TIMINGS ON  DOMESTIC_FLIGHTS.FLIGHT_NO = FLIGHT_TIMINGS.FLIGHT_NO WHERE DOMESTIC_FLIGHTS.ORIGIN = '"+sto+"' AND DOMESTIC_FLIGHTS.DESTINATION = '"+sfrom+"' AND DATE_OF_JOURNEY = '"+sret+"'";
                 ResultSet re = st.executeQuery(sq);
                // System.out.println(re.getString(7));
                 SearchedFlightsfromHome sf = new SearchedFlightsfromHome();
                 //System.out.println ("Connect");
                 while (re.next()) {
                     String ap[] = new String[100];
                     for (int i = 0; i < 7; i ++) {
                         ap[i] = re.getString(i+1);
                         System.out.println(re.getString(i+1));
                     }
                     sf.executequery(ap);
                // System.out.println (re.getStri;ng(2));
                 }
                 sf.setVisible(true);
                 //sf.executequery(re);
                
                 //System.out.println ("Connect");
                 //while(re.next()) {
                   //  System.out.println(re.getString(1));
                 //}
             } 
           }
        }   
          catch (SQLException se) {
         //    System.out.println("ri");
              NewRequestexception nr = new NewRequestexception();
              nr.setVisible(true);
              this.setVisible(false);
        }
        this.setVisible(false);
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
          if(jToggleButton1.isSelected() && !jToggleButton2.isSelected()){
            jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AUSTRALIA","BRAZIL","FRANCE","HONG KONG","INDIA"}));
            jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AUSTRALIA","BRAZIL","FRANCE","HONG KONG","INDIA"}));
     }
     if(jToggleButton2.isSelected()) {
            jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ANDAMAN AND NICOBAR ISLANDS", "UTTAR PRADESH", "DELHI", "GOA", "KERALA"}));
            jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ANDAMAN AND NICOBAR ISLANDS", "UTTAR PRADESH", "DELHI", "GOA", "KERALA"}));
         
    }
     if((!jToggleButton1.isSelected() && !jToggleButton2.isSelected()) || (jToggleButton1.isSelected() && jToggleButton2.isSelected())) {
                   jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Source"}));
                   jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Destination"}));
      }
       
    
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
           if(jToggleButton2.isSelected() && !jToggleButton1.isSelected()){
        
            jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ANDAMAN AND NICOBAR ISLANDS", "UTTAR PRADESH", "DELHI", "GOA", "KERALA"}));
            jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ANDAMAN AND NICOBAR ISLANDS", "UTTAR PRADESH", "DELHI", "GOA", "KERALA"}));
        }
    if(jToggleButton1.isSelected()){
                 jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AUSTRALIA","BRAZIL","FRANCE","HONG KONG","INDIA"}));
                 jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AUSTRALIA","BRAZIL","FRANCE","HONG KONG","INDIA"}));
        }
     if((!jToggleButton1.isSelected() && !jToggleButton2.isSelected()) || (jToggleButton1.isSelected() && jToggleButton2.isSelected())){
                jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Source"}));
                jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Destination"}));  
        }
         
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Select_login_type jb1 = new Select_login_type();
        jb1.setVisible(true);
        this.setVisible(false);
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        signup_page sg  = new signup_page();
        sg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jCalendarButton1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCalendarButton1PropertyChange
        // TODO add your handling code here:
       if(evt.getNewValue() instanceof Date) {
           setDate((Date)evt.getNewValue());
       }

    }//GEN-LAST:event_jCalendarButton1PropertyChange

    private void jCalendarButton3PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCalendarButton3PropertyChange
        // TODO add your handling code here:
        if(evt.getNewValue() instanceof Date) {
           setDate1((Date)evt.getNewValue());
       }
    }//GEN-LAST:event_jCalendarButton3PropertyChange

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
    public void setDate(String dateString)
    {
		Date date = null;
		try	{
            if ((dateString != null) && (dateString.length() > 0))
                date = dateFormat.parse(dateString);
		} catch (Exception e)	{
            date = null;
		}
        this.setDate(date);
    }
    public void setDate(Date date)
    {
        String dateString = "";
        if (date != null)
    		dateString = dateFormat.format(date);
        jTextField2.setText(dateString);
        jCalendarButton1.setTargetDate(date);
    }
    
    public void setDate1(String dateString1)
    {
		Date date = null;
		try	{
            if ((dateString1 != null) && (dateString1.length() > 0))
                date = dateFormat1.parse(dateString1);
		} catch (Exception e)	{
            date = null;
		}
        this.setDate(date);
    }
    public void setDate1(Date date)
    {
        String dateString1 = "";
        if (date != null)
    		dateString1 = dateFormat1.format(date);
        jTextField1.setText(dateString1);
        jCalendarButton3.setTargetDate(date);
    }
    

     public static DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM);
     public static DateFormat dateFormat1 = DateFormat.getDateInstance(DateFormat.MEDIUM);
    // public static DateFormat dateFormat1 = DateFormat.getDateInstance(DateFormat.MEDIUM);
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private net.sourceforge.jcalendarbutton.JCalendarButton jCalendarButton1;
    private net.sourceforge.jcalendarbutton.JCalendarButton jCalendarButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private transient javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables
}
