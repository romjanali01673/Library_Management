/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jframe;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author romja
 */
public class admin_login extends javax.swing.JFrame {
    String user_names;
    String passwd;
    
    public admin_login() {
        initComponents();
    }
    public void updatepass(String U_name, String newpass){
        if(newpass.equals("")){
            JOptionPane.showMessageDialog(this,"password forgotten failed!");
        }
        else{
            try{
            //method 1: 
            Connection con = DB_connection.getConnection();
            String sql = "update admin_data set PASSWORD = ? where user_name = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            
            pst.setString(1,newpass);
            pst.setString(2,U_name);
            pst.executeUpdate();
            
            }catch (Exception e){
            JOptionPane.showMessageDialog(this, "server error");
            }
            JOptionPane.showMessageDialog(this,"password updated.");
        }
    }
      public void valid(){
        if(validity()){
        try{
        Connection con = DB_connection.getConnection();
        String sql = "select * from modarator_data where user_id =? and password = ? ";
        PreparedStatement pst = con.prepareStatement(sql);
        
        pst.setString(1, user_names);
        pst.setString(2,passwd);
        
        ResultSet rs = pst.executeQuery();
        if(rs.next()){
            JOptionPane.showMessageDialog(this,"You have successfully Logined");
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(this,"User not found!");
        }
        
        }catch (Exception e){
            e.printStackTrace();
        }
        }
    }
    public boolean forgotten_pass(String user_name, String name){
        boolean result = false;
        try{
        Connection con = DB_connection.getConnection();
        String sql = "select * from admin_data where user_name = ? and another_name = ?";
        
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(2,name);
        pst.setString(1, user_name);
        ResultSet rs = pst.executeQuery();
        if(rs.next()){
            result = true;
        }
        
        }catch (Exception e ){
            e.printStackTrace();
            
    }
        return result;
    }
    public boolean validity(){
        get_login_data();
        boolean result= true;
        if(user_names.equals("")){
            JOptionPane.showMessageDialog(this,"Enter username:");
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
    user_names = user_name.getText();
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
        user_name = new app.bolivia.swing.JCTextField();
        password = new rojerusan.RSPasswordTextPlaceHolder();
        login = new rojerusan.RSMaterialButtonCircle();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Home_Page = new javax.swing.JButton();
        forgot = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        user_name.setPlaceholder("Enter Your Username: ");
        user_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_nameActionPerformed(evt);
            }
        });
        jPanel1.add(user_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 270, 40));

        password.setPhColor(new java.awt.Color(0, 0, 0));
        password.setPlaceholder("Enter Your Password");
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 270, 40));

        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 500, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Login Fast");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/icons8_Secure_50px.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 245, 50, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Hay Admin");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/icons8_Account_50px.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 174, 50, 50));

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

        forgot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forgot.setText("Forgotten password?");
        forgot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotMouseClicked(evt);
            }
        });
        jPanel1.add(forgot, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 170, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void user_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_nameActionPerformed

    private void Home_PageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Home_PageActionPerformed
        home_page hp = new home_page();
        hp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Home_PageActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        valid();
    }//GEN-LAST:event_loginActionPerformed

    private void forgotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotMouseClicked
        // TODO add your handling code here:
        String U_name =JOptionPane.showInputDialog(this, "what is user_name?");
        String A_name = JOptionPane.showInputDialog(this, "What is your \"Another name\" name?");
        if(forgotten_pass(U_name,A_name)){
            String pass = JOptionPane.showInputDialog(this, "Enter new password:");
            updatepass(U_name, pass);
        }
        else{
            JOptionPane.showMessageDialog(this,"user not found!");
                    
        }
    }//GEN-LAST:event_forgotMouseClicked

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
            java.util.logging.Logger.getLogger(admin_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Home_Page;
    private javax.swing.JLabel forgot;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private rojerusan.RSMaterialButtonCircle login;
    private rojerusan.RSPasswordTextPlaceHolder password;
    private app.bolivia.swing.JCTextField user_name;
    // End of variables declaration//GEN-END:variables
}
