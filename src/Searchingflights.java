
import java.text.DateFormat;
import java.util.Date;
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prathma
 */
public class Searchingflights extends javax.swing.JFrame {

    /**
     * Creates new form Searchingflights
     */
    public Searchingflights() {
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

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jCalendarButton1 = new net.sourceforge.jcalendarbutton.JCalendarButton();
        jComboBox3 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextField2 = new javax.swing.JTextField();
        jCalendarButton2 = new net.sourceforge.jcalendarbutton.JCalendarButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jButton1.setForeground(new java.awt.Color(153, 0, 0));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SEARCH FLIGHT AND BOOK TICKETS");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Class :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 150, -1, 24));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Source"}));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 140, 30));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Destination" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 151, 30));

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
        getContentPane().add(jCalendarButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, -1, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Class", "Business", "Executive", "Economic" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 190, 107, -1));

        jTextField1.setText("Select Date");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 102, -1));

        jToggleButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(153, 0, 0));
        jToggleButton1.setText("International");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jToggleButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jToggleButton2.setForeground(new java.awt.Color(153, 0, 0));
        jToggleButton2.setText("Domestic");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 113, -1));

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("One way");
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jRadioButton2.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Round Trip");
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        jTextField2.setText("Select Date");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 102, -1));

        jCalendarButton2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCalendarButton2PropertyChange(evt);
            }
        });
        getContentPane().add(jCalendarButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 190, -1, -1));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 216, 23));

        jLabel7.setFont(new java.awt.Font("Bodoni MT", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Origin :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 71, 24));

        jLabel8.setFont(new java.awt.Font("Bodoni MT", 0, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Destination :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 71, 24));

        jLabel9.setFont(new java.awt.Font("Bodoni MT", 0, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Date of journey :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, 24));

        jLabel10.setFont(new java.awt.Font("Bodoni MT", 0, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Return Date :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, -1, 24));

        jButton2.setText("SEARCH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sky2.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCalendarButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCalendarButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCalendarButton1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
    if(jToggleButton1.isSelected() && !jToggleButton2.isSelected()){
            jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AUSTRALIA","BRAZIL","FRANCE","HONG KONG","INDIA"}));
            jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AUSTRALIA","BRAZIL","FRANCE","HONG KONG","INDIA"}));
     }
     if(jToggleButton2.isSelected()) {
            jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"ANDAMAN AND NICOBAR ISLANDS", "UTTAR PRADESH", "DELHI", "GOA", "KERALA"}));
            jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ANDAMAN AND NICOBAR ISLANDS", "UTTAR PRADESH", "DELHI", "GOA", "KERALA"}));
         
    }
     if((!jToggleButton1.isSelected() && !jToggleButton2.isSelected()) || (jToggleButton1.isSelected() && jToggleButton2.isSelected())) {
                   jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Source"}));
                   jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Destination"}));
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
                jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Source"}));
                jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Destination"}));  
        }
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jCalendarButton1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCalendarButton1PropertyChange
        // TODO add your handling code here:
         if(evt.getNewValue() instanceof Date) {
           setDate((Date)evt.getNewValue());
       }
    }//GEN-LAST:event_jCalendarButton1PropertyChange

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         try {
            try {
                 Class.forName("oracle.jdbc.driver.OracleDriver");
            } catch (ClassNotFoundException ex) {
                
            }
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","prathma");
            Statement st = con.createStatement();
            String sfrom, sto, sclass, sdep, sret;
            sfrom = (String)jComboBox1.getSelectedItem();
            sto = (String)jComboBox2.getSelectedItem();
            sclass = (String)jComboBox3.getSelectedItem();
            sdep = jTextField1.getText();
            sret = jTextField2.getText();
            int f=0;
              if((!jRadioButton1.isSelected() && !jRadioButton2.isSelected()) || (sdep.equals("Select Date")) || (sfrom.equals("Source") || sto.equals("Destination"))||(sclass.equals("Select Class"))) {
                  AllfieldsEnterHome afr = new AllfieldsEnterHome();
                  afr.setVisible(true);
                 f=1;
         
            }
            if(jRadioButton2.isSelected() && !sret.equals("Select Date") && sdep.equals("Select Date")) {
                f=1;
            }
             if(jRadioButton1.isSelected() && sret.equals("Select Date") && sdep.equals("Select Date")) {
                  f=1;
             }
             if(f==1) {
                 jLabel5.setText("*All fields mandatory");
             }
             
           if(jRadioButton1.isSelected()) {
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
                // System.out.println (re.getStri;ng(2));
                 }
            
                 sf.setVisible(true);
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
           } 
            else if(jRadioButton2.isSelected()) {
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
        }    catch (SQLException se) {
         //    System.out.println("ri");
            NewRequestexception nr = new NewRequestexception();
              nr.setVisible(true);
              this.setVisible(false);
            
        }   
         this.setVisible(false);
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCalendarButton2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCalendarButton2PropertyChange
        // TODO add your handling code here:
        if(evt.getNewValue() instanceof Date) {
           setDate1((Date)evt.getNewValue());
       }
    }//GEN-LAST:event_jCalendarButton2PropertyChange

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
         try {
            try {
                 Class.forName("oracle.jdbc.driver.OracleDriver");
            } catch (ClassNotFoundException ex) {
                
            }
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","prathma");
            Statement st = con.createStatement();
            String sfrom, sto, sclass, sdep, sret;
            sfrom = (String)jComboBox1.getSelectedItem();
            sto = (String)jComboBox2.getSelectedItem();
            sclass = (String)jComboBox3.getSelectedItem();
            sdep = jTextField1.getText();
            sret = jTextField2.getText();
            int f=0;
              if((!jRadioButton1.isSelected() && !jRadioButton2.isSelected()) || (sdep.equals("Select Date")) || (sfrom.equals("Source") || sto.equals("Destination"))||(sclass.equals("Select Class"))) {
               //   AllfieldsEnterHome afr = new AllfieldsEnterHome();
                 // afr.setVisible(true);
                 f=1;
         
            }
            if(jRadioButton2.isSelected() && !sret.equals("Select Date") && sdep.equals("Select Date")) {
                f=1;
            }
             if(jRadioButton1.isSelected() && sret.equals("Select Date") && sdep.equals("Select Date")) {
                  f=1;
             }
             if(f==1) {
                 jLabel5.setText("*All fields mandatory");
             }
             
           if(jRadioButton1.isSelected()) {
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
                // System.out.println (re.getStri;ng(2));
                 }
            
                 sf.setVisible(true);
                 this.setVisible(false);
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
this.setVisible(false);                 
//sf.executequery(re);
                 //System.out.println ("Connect");
             }
           } 
            else if(jRadioButton2.isSelected()) {
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
                 this.setVisible(false);
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
                 this.setVisible(false);
                 //sf.executequery(re);
                
                 //System.out.println ("Connect");
                 //while(re.next()) {
                   //  System.out.println(re.getString(1));
                 //}
             } 
           }
        }    catch (SQLException se) {
         //    System.out.println("ri");
            NewRequestexception nr = new NewRequestexception();
              nr.setVisible(true);
              this.setVisible(false);
            
        }   
         
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Searchingflights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Searchingflights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Searchingflights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Searchingflights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Searchingflights().setVisible(true);
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
        jTextField1.setText(dateString);
        jCalendarButton1.setTargetDate(date);
    }
    public void setDate1(String dateString)
    {
		Date date = null;
		try	{
            if ((dateString != null) && (dateString.length() > 0))
                date = dateFormat1.parse(dateString);
		} catch (Exception e)	{
            date = null;
		}
        this.setDate1(date);
    }
    public void setDate1(Date date)
    {
        String dateString = "";
        if (date != null)
    		dateString = dateFormat1.format(date);
        jTextField2.setText(dateString);
        jCalendarButton2.setTargetDate(date);
    }
    public static DateFormat dateFormat1 = DateFormat.getDateInstance(DateFormat.MEDIUM);
        public static DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM);
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private net.sourceforge.jcalendarbutton.JCalendarButton jCalendarButton1;
    private net.sourceforge.jcalendarbutton.JCalendarButton jCalendarButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables
}
