/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jframe;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class signup extends javax.swing.JFrame {

    public String Gender = "Male";
    public boolean bod_date_valid = false;
    String passwd ;
    int ids = 00;
    
    public long get_nid_or_birth_number(){
        
        long NID_B_Number = 0L;
        String NID_B_number = nid_birth_number.getText();
        try{
            NID_B_Number = Long.parseLong(NID_B_number);
            if(NID_B_number.length()>17){
            JOptionPane.showMessageDialog(this,"you have insert more then 17 digit");
            NID_B_Number = 0L;
                }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this,"Enter valid NID/Birth number:");
        }
        
        return NID_B_Number;
    }
    
    public java.sql.Date get_Birth_Date(){
        bod_date_valid = false;// ai method er " bod_date_valid"  er value akbar change hoila joto e event hok na kano er default value asbe na. last changes e takba.
        
        java.sql.Date DATE_OF_BIRTH = new java.sql.Date(2004-02-01);
        try{
        // we will get the util-date from the compunents and we have to use the method getDatoFecha()
        // to save the date in database we have to convart in sql-date
        //the process is util-long-sql
        Date DOB = date_of_birth.getDatoFecha();//util date
        Long dateofbirth = DOB.getTime();//long date
        DATE_OF_BIRTH = new java.sql.Date(dateofbirth);//sql date 
        System.out.println("ha ha ");
        }catch (Exception e ){
            JOptionPane.showMessageDialog(this,"Enter your Date of Birth!");
            bod_date_valid = true;
        }
            return DATE_OF_BIRTH ;
    }
    
    public String pass(){
        
        char[] Password = password.getPassword();
        char[] C_Password = confirm_password.getPassword();
        String Pass1 = String.valueOf(Password);//fast way
        String Pass2 = String.valueOf(C_Password);
        //System.out.println(Password);
        if (Pass1.equals(Pass2)){
           passwd =Pass2; 
           
        }
        else{
            JOptionPane.showMessageDialog(this, "Confirm password doesn't matched");

        }
        return passwd;
    }
    
        
    public signup() {
        initComponents();

    }
    public boolean  necessary_data_insarted(){
        
        boolean res = true;
        get_Birth_Date();
        
        String F_name  = fast_name.getText();
        String L_name = last_name.getText();
        String Phone = phone.getText();
        String Email = email.getText();
        String Institute_Office = institute_office.getText();
        String ID_Of_Institute_Office = id_of_institute_office.getText();
        String F_address  = full_address.getText();
        
        
        if (F_name.equals("")){
            JOptionPane.showMessageDialog(this,  "Enter your Fast Namae: ");
     
            res =  false;
        }
        
        else if (L_name.equals("")){
            JOptionPane.showMessageDialog(this,  "Enter your Last Namae: ");
           
            res =  false;
        }
        else if (Phone.equals("")){
            JOptionPane.showMessageDialog(this,  "Enter your phone number: ");
           
            res =  false;
        }
        else if (Email.equals("")){
            JOptionPane.showMessageDialog(this,  "Enter your Email Address: ");
           
            res =  false;
        }
        else if(get_nid_or_birth_number()==0L){
            res =  false;
        }
        else if(bod_date_valid){
            res =  false;
        }       
        else if (Institute_Office.equals("") ){
            JOptionPane.showMessageDialog(this,  "Enter Institute of Office Name: ");

            res =  false;
        }
        else if (ID_Of_Institute_Office.equals("")){
            JOptionPane.showMessageDialog(this,  "Enter your ID number of \"institute or Office:\" ");

            res =  false;
        }
        else if (F_address.equals("")){
            JOptionPane.showMessageDialog(this,  "Enter your Full Address: ");

            res =  false;
        }
        else if(pass().equals("")){
            JOptionPane.showMessageDialog(this, "Enter password");

            res = false;
        }
        return res ;
    }
    
    // creating a mehod for gender 
    public void getGender(String gender){
        Gender = gender;
    }
    
    // method insart values into user table 
    public void insartSignUpDetails(){
        
        String F_name  = fast_name.getText().toUpperCase();
        String L_name = last_name.getText().toUpperCase();
        String Phone = phone.getText().toUpperCase();
        String Email = email.getText().toUpperCase();
        String Institute_Office = institute_office.getText().toUpperCase();
        String ID_Of_Institute_Office = id_of_institute_office.getText().toUpperCase();
        String F_address  = full_address.getText().toUpperCase();

        
        
        try {
            Connection con = DB_connection.getConnection();
            String sql =  "insert into user_info(fast_name, last_name, phone, email, gender, nid_birth_number, date_of_birth, institute_office, id_number, full_address,pass) values(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            
            pst.setString(1, F_name);
            pst.setString(2, L_name);
            pst.setString(3, Phone);
            pst.setString(4, Email);
            pst.setString(5, Gender);
            pst.setLong(6, get_nid_or_birth_number());
            pst.setDate(7, get_Birth_Date());
            pst.setString(8, Institute_Office);
            pst.setString(9, ID_Of_Institute_Office);
            pst.setString(10, F_address);
            pst.setString(11, passwd);
            
            int updatedRowCount = pst.executeUpdate();
       
           
            if ( updatedRowCount > 0){
               JOptionPane.showMessageDialog(this, "Accout Created Successfully!");
               JOptionPane.showMessageDialog(this, "wait for approved your accout.");
               
               login l = new login();
               get_id();
               l.setVisible(true);
               this.dispose();
           }
           else{
               JOptionPane.showMessageDialog(this, "record Insarte faled!"); 
           }   
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"the user already exist");
            e.printStackTrace();
       
        }
    }
    public void get_id(){
        try{
            String sql = "select id from user_info where nid_birth_number = ?";
            Connection con = DB_connection.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setLong(1, get_nid_or_birth_number());
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                ids = rs.getInt("id");
                System.out.println(ids);
            }
        }catch(Exception  e ){
            System.out.println("get id");
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(this, "note your user_id:-  " +ids );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gender = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        fast_name = new app.bolivia.swing.JCTextField();
        last_name = new app.bolivia.swing.JCTextField();
        phone = new app.bolivia.swing.JCTextField();
        email = new app.bolivia.swing.JCTextField();
        id_of_institute_office = new app.bolivia.swing.JCTextField();
        nid_birth_number = new app.bolivia.swing.JCTextField();
        jLabel1 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        custom = new javax.swing.JRadioButton();
        institute_office = new app.bolivia.swing.JCTextField();
        submit = new rojerusan.RSMaterialButtonCircle();
        full_address = new app.bolivia.swing.JCTextField();
        date_of_birth = new rojeru_san.componentes.RSDateChooser();
        jLabel2 = new javax.swing.JLabel();
        confirm_password = new rojerusan.RSPasswordTextPlaceHolder();
        password = new rojerusan.RSPasswordTextPlaceHolder();
        agreement = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jMenuBar1 = new javax.swing.JMenuBar();
        home = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        help = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Signup Page");
        setAlwaysOnTop(true);
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fast_name.setToolTipText("");
        fast_name.setPlaceholder("Fast Name");
        fast_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fast_nameActionPerformed(evt);
            }
        });
        jPanel1.add(fast_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        last_name.setPlaceholder("Last Name");
        jPanel1.add(last_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        phone.setToolTipText("Enter your Phone Number with Country code.");
        phone.setPlaceholder("phone");
        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        jPanel1.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        email.setPlaceholder("Email Address");
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, -1));

        id_of_institute_office.setPlaceholder("ID number of institute/office");
        jPanel1.add(id_of_institute_office, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, -1));

        nid_birth_number.setToolTipText("nid -10,13,17 digit and birth 16,17 digit");
        nid_birth_number.setPlaceholder("NID/Birth number ");
        nid_birth_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nid_birth_numberActionPerformed(evt);
            }
        });
        jPanel1.add(nid_birth_number, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 230, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("welcome to registation ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 280, 30));

        gender.add(male);
        male.setSelected(true);
        male.setText("male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        jPanel1.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, 20));

        gender.add(female);
        female.setText("female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        jPanel1.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, 20));

        gender.add(custom);
        custom.setText("custom");
        custom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customActionPerformed(evt);
            }
        });
        jPanel1.add(custom, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, 20));

        institute_office.setPlaceholder("Institute/ Office Name");
        jPanel1.add(institute_office, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        submit.setText("submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel1.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 240, 60));

        full_address.setPlaceholder("Full Address");
        jPanel1.add(full_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 430, -1));

        date_of_birth.setColorBackground(new java.awt.Color(255, 0, 0));
        date_of_birth.setColorButtonHover(new java.awt.Color(255, 51, 51));
        date_of_birth.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        date_of_birth.setFormatoFecha("dd/MM/yyyy\n");
        date_of_birth.setName(""); // NOI18N
        date_of_birth.setOpaque(true);
        date_of_birth.setPlaceholder("Date of Birth");
        jPanel1.add(date_of_birth, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 230, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Select Your Gender-");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 140, 30));

        confirm_password.setPlaceholder("Confirm Password");
        jPanel1.add(confirm_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, -1, -1));

        password.setPlaceholder("Password");
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        agreement.setText("I agree to these terms and conditions.");
        agreement.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(agreement, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 240, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("view");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 50, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 530));
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenuBar1.setBackground(new java.awt.Color(0, 255, 0));
        jMenuBar1.setBorder(null);
        jMenuBar1.setForeground(new java.awt.Color(255, 0, 0));
        jMenuBar1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        home.setBackground(new java.awt.Color(204, 0, 0));
        home.setText("Home");
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        jMenuBar1.add(home);

        jMenu2.setText("Login");

        jMenuItem1.setBackground(new java.awt.Color(204, 255, 204));
        jMenuItem1.setForeground(new java.awt.Color(0, 0, 255));
        jMenuItem1.setText("Student Login");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setForeground(new java.awt.Color(0, 0, 255));
        jMenuItem2.setText("Modarator Login");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setForeground(new java.awt.Color(0, 0, 255));
        jMenuItem3.setText("Admin Login");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        help.setText("Help");
        help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helpMouseClicked(evt);
            }
        });
        jMenuBar1.add(help);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nid_birth_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nid_birth_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nid_birth_numberActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void fast_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fast_nameActionPerformed
        
    }//GEN-LAST:event_fast_nameActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        //insartSignUpDetails();
        if(agreement.isSelected()){
            if (necessary_data_insarted()){
            insartSignUpDetails();
            }
        }
        else{
            JOptionPane.showMessageDialog(this,"Check the trams and condition.");
        }
    }//GEN-LAST:event_submitActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
         getGender("Female");
    }//GEN-LAST:event_femaleActionPerformed

    private void customActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customActionPerformed
         getGender("Custom");
    }//GEN-LAST:event_customActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
         getGender("Male");
    }//GEN-LAST:event_maleActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        login l = new login();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed

    }//GEN-LAST:event_homeActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        modarator_login ml = new modarator_login();
        ml.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        admin_login al = new admin_login();
        al.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        // TODO add your handling code here:
        home_page p = new home_page();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeMouseClicked

    private void helpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMouseClicked
        // TODO add your handling code here:
        Help hp = new Help();
        hp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_helpMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        try {
            URI condition  = new URI("https://docs.google.com/document/d/1JZcUPBCoDkCpqa7lu0yaVy0PyEK05KHIEoyry6jD7iA/edit?usp=sharing");
            Desktop.getDesktop().browse(condition);        
        } catch (URISyntaxException ex) {
            Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
        }catch(Exception e ){
            e.printStackTrace();
        }

        
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox agreement;
    private javax.swing.ButtonGroup buttonGroup1;
    private rojerusan.RSPasswordTextPlaceHolder confirm_password;
    private javax.swing.JRadioButton custom;
    private rojeru_san.componentes.RSDateChooser date_of_birth;
    private app.bolivia.swing.JCTextField email;
    private app.bolivia.swing.JCTextField fast_name;
    private javax.swing.JRadioButton female;
    private app.bolivia.swing.JCTextField full_address;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JMenu help;
    private javax.swing.JMenu home;
    private app.bolivia.swing.JCTextField id_of_institute_office;
    private app.bolivia.swing.JCTextField institute_office;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private app.bolivia.swing.JCTextField last_name;
    private javax.swing.JRadioButton male;
    private app.bolivia.swing.JCTextField nid_birth_number;
    private rojerusan.RSPasswordTextPlaceHolder password;
    private app.bolivia.swing.JCTextField phone;
    private rojerusan.RSMaterialButtonCircle submit;
    // End of variables declaration//GEN-END:variables

    
   
}
