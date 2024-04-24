/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jframe;

import jframe.modarator_file.modarator_portal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author romja
 */
public class modarator_login extends javax.swing.JFrame {
    int user_id;
    String passwd;

    public modarator_login() {
        initComponents();
    }
    public boolean valid(){
        boolean result = false;
        if(validity()){
        try{
        Connection con = DB_connection.getConnection();
        String sql = "select * from modarator_data where user_id =? and password = ? ";
        PreparedStatement pst = con.prepareStatement(sql);
        
        pst.setInt(1, user_id);
        pst.setString(2,passwd);
        
        ResultSet rs = pst.executeQuery();
        if(rs.next()){
            JOptionPane.showMessageDialog(this,"You have successfully Logined");
            result= true;
        }
        else{
            JOptionPane.showMessageDialog(this,"User not found!");
        }
        
        }catch (Exception e){
            e.printStackTrace();
        }
        }
        return result;
    }
    public boolean forgotten_pass(int id, String name){
        boolean result = false;
        try{
        Connection con = DB_connection.getConnection();
        String sql = "select * from modarator_data where user_id = ? and another_name = ?";
        
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(2,name);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
        if(rs.next()){
            result = true;
        }
        
        }catch (Exception e ){
            e.printStackTrace();
            
    }
        return result;
    }
    public void updatepass(int id, String newpass){
        if(newpass.equals("")){
            JOptionPane.showMessageDialog(this,"password forgotten failed!");
        }
        else{
            try{
            //method 1: 
            Connection con = DB_connection.getConnection();
            String sql = "update modarator_data set PASSWORD = ? where user_id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            
            pst.setString(1,newpass);
            pst.setInt(2,id);
            pst.executeUpdate();
            
            }catch (Exception e){
            JOptionPane.showMessageDialog(this, "server error");
            }
            JOptionPane.showMessageDialog(this,"password updated.");
        }
    }
    public boolean validity(){
        get_login_data();
        boolean result= true;
        if(user_id == 0 ){
            JOptionPane.showMessageDialog(this,"Enter user ID:");
            result = false;
        }   
        else if(passwd.equals("")){
            JOptionPane.showMessageDialog(this,"Enter Password");
            result = false;
        }
        return result;
    }
    
    public boolean get_login_data(){
    boolean result = true;
    try{
    user_id = Integer.parseInt(user_id_number.getText());
    char [] p = password.getPassword();
    passwd  = String.valueOf(p);
    }catch (Exception e ){
        JOptionPane.showMessageDialog(this, "Enter valid data!");
        result = false;
    }
        return result;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        user_id_number = new app.bolivia.swing.JCTextField();
        password = new rojerusan.RSPasswordTextPlaceHolder();
        login = new rojerusan.RSMaterialButtonCircle();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rSMaterialButtonCircle2 = new rojerusan.RSMaterialButtonCircle();
        forgotten = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Home_Page = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modarator Login Page");
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        user_id_number.setPlaceholder("Enter Your User ID");
        user_id_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_id_numberActionPerformed(evt);
            }
        });
        jPanel1.add(user_id_number, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 270, 40));

        password.setPhColor(new java.awt.Color(0, 0, 0));
        password.setPlaceholder("Enter Your Password");
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 270, 40));

        login.setText("login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 180, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Hay Modarator ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Login Fast");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 70, 20));

        rSMaterialButtonCircle2.setText("join as a new modarator");
        rSMaterialButtonCircle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle2ActionPerformed(evt);
            }
        });
        jPanel1.add(rSMaterialButtonCircle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 480, 60));

        forgotten.setText("recovar your password!");
        forgotten.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgottenMouseClicked(evt);
            }
        });
        jPanel1.add(forgotten, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/icons8_Secure_50px.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 224, -1, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/icons8_Account_50px.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 153, -1, 50));

        Home_Page.setBackground(new java.awt.Color(255, 204, 255));
        Home_Page.setForeground(new java.awt.Color(204, 0, 0));
        Home_Page.setText("Home Page");
        Home_Page.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Home_Page.setPreferredSize(new java.awt.Dimension(666, 18));
        Home_Page.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Home_PageActionPerformed(evt);
            }
        });
        jPanel1.add(Home_Page, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 25));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void user_id_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_id_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_id_numberActionPerformed

    private void Home_PageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Home_PageActionPerformed
        home_page hp = new home_page();
        hp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Home_PageActionPerformed

    private void forgottenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgottenMouseClicked
        // TODO add your handling code here:
        String i =JOptionPane.showInputDialog(this, "what is your user id?");
        String name = JOptionPane.showInputDialog(this, "What is your \"Anoter name\" name?");
        int id = Integer.valueOf(i);
        if(forgotten_pass(id,name)){
            String pass = JOptionPane.showInputDialog(this, "Enter new password:");
            updatepass(id, pass);
        }
        else{
            JOptionPane.showMessageDialog(this,"user not found!");
                    
        }
    }//GEN-LAST:event_forgottenMouseClicked

    private void rSMaterialButtonCircle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle2ActionPerformed
        // TODO add your handling code here:
        Help hp  = new Help();
        hp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_rSMaterialButtonCircle2ActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed

        if(validity()){        
            if(valid()){
                modarator_portal mp = new modarator_portal(user_id);
                mp.setVisible(true);
                this.dispose();
                }
        }
    }//GEN-LAST:event_loginActionPerformed

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
            java.util.logging.Logger.getLogger(modarator_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modarator_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modarator_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modarator_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modarator_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Home_Page;
    private javax.swing.JLabel forgotten;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private rojerusan.RSMaterialButtonCircle login;
    private rojerusan.RSPasswordTextPlaceHolder password;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle2;
    private app.bolivia.swing.JCTextField user_id_number;
    // End of variables declaration//GEN-END:variables
}
