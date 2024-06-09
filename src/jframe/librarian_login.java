
package jframe;
import jframe.method_romjanali01673.DB_connection;
import jframe.librarian_file.book_give;
import java.sql.Connection;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class librarian_login extends javax.swing.JFrame {
    

    int user_id;
    String passwd;
    String newpass = "";
    String position=  "LIBRARIAN";

    public librarian_login() {
        initComponents();
    }
    public void updatepass(int id, String newpass){
        if(newpass.equals("")){
            JOptionPane.showMessageDialog(this,"password forgotten failed!");
        }
        else{
            Connection con = DB_connection.getConnection();
            try{
            //method 1: 
            String sql = "update employee_data set pass = ? where user_id = ? and position = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            
            pst.setString(1,newpass);
            pst.setInt(2,id);
            pst.setString(3,position);
            
            pst.executeUpdate();
            
            //method 2:
            //Connection con = DB_connection.getConnection();
            //String sql  = "UPDATE user_info SET pass = \""+newpass+"\" WHERE id = " +id;         
            //System.out.print(sql);
            //Statement statement = con.createStatement(); 
            //statement.executeUpdate(sql);
                        pst.close();
            
            }catch (Exception e){
            JOptionPane.showMessageDialog(this, "server error");
            }finally{
            try{
                con.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
            JOptionPane.showMessageDialog(this,"password updated.");
        }
    }
    
    public boolean valid(){
        boolean result = false;
        if(validity()){
        Connection con = DB_connection.getConnection();
        try{
        String sql = "select * from employee_data where user_id =? and pass = ? and position = ? ";
        PreparedStatement pst = con.prepareStatement(sql);
        
        pst.setInt(1, user_id);
        pst.setString(2,passwd);
        pst.setString(3,position);
        
        ResultSet rs = pst.executeQuery();
        if(rs.next()){
            JOptionPane.showMessageDialog(this,"You have successfully Logined");
            result = true;
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(this,"User not found!");
        }
                    pst.close();
            rs.close();
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            try{
                con.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        }
        return result;
    }
    public boolean forgotten_pass(int id, String name){
        boolean result = false;
        Connection con = DB_connection.getConnection();
        try{
        String sql = "select * from employee_data where user_id = ? and last_name = ? and position = ?";
        
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(2,name);
        pst.setInt(1, id);
        pst.setString(3,position);
        
        ResultSet rs = pst.executeQuery();
        if(rs.next()){
            result = true;
        }
                    pst.close();
            rs.close();
        }catch (Exception e ){
            e.printStackTrace();
            
    }finally{
            try{
                con.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return result;
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
        public String remove_white_space(String str){
        // Remove leading whitespaces
        int start = 0;
        while (start < str.length() && Character.isWhitespace(str.charAt(start))) {
            start++;
        }

        // Remove trailing whitespaces
        int end = str.length() - 1;
        while (end >= 0 && Character.isWhitespace(str.charAt(end))) {
            end--;
        }
        String sub_string = str.substring(start, end+1);

        // Return the substring without leading and trailing whitespaces
        return sub_string;
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        user_id_number = new app.bolivia.swing.JCTextField();
        login = new rojerusan.RSMaterialButtonCircle();
        signup = new rojerusan.RSMaterialButtonCircle();
        password = new rojerusan.RSPasswordTextPlaceHolder();
        forgot = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Home_Page = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setName(""); // NOI18N
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        user_id_number.setPlaceholder("User ID");
        user_id_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_id_numberActionPerformed(evt);
            }
        });

        login.setText("login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        signup.setText("create new account");
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });

        password.setPhColor(new java.awt.Color(0, 0, 0));
        password.setPlaceholder("Password ");
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        forgot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forgot.setText("Forgotten password?");
        forgot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Welcome To Login Page");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/icons8_Account_50px.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/icons8_Secure_50px.png"))); // NOI18N

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

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Libraryn Login");

        minimize.setBackground(new java.awt.Color(255, 255, 255));
        minimize.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setText("-");
        minimize.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeMouseExited(evt);
            }
        });

        close.setBackground(new java.awt.Color(255, 255, 255));
        close.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("X");
        close.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(user_id_number, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(forgot, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(113, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Home_Page, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Home_Page, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(user_id_number, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)))
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(forgot, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(signup, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void user_id_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_id_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_id_numberActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed

            if(valid()){
                book_give up = new book_give(user_id);
                up.setVisible(true);
            }
    }//GEN-LAST:event_loginActionPerformed

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
        JOptionPane.showMessageDialog(this,"if you want to create a new account, you have to visit our Library!");
    }//GEN-LAST:event_signupActionPerformed

    private void forgotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotMouseClicked
        // TODO add your handling code here:
        String i =JOptionPane.showInputDialog(this, "what is your user id?");
        i = remove_white_space(i);
        String name = JOptionPane.showInputDialog(this, "What is your \"Last Name\" name?");
        name = remove_white_space(name);
        int id = Integer.valueOf(i);
        if(forgotten_pass(id,name)){
            String pass = JOptionPane.showInputDialog(this, "Enter new password:");
            updatepass(id, pass);
        }
        else{
            JOptionPane.showMessageDialog(this,"user not found!");
                    
        }
    }//GEN-LAST:event_forgotMouseClicked

    private void Home_PageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Home_PageActionPerformed
        home_page hp = new home_page();
        hp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Home_PageActionPerformed

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setState(this.ICONIFIED);        // TODO add your handling code here:
    }//GEN-LAST:event_minimizeMouseClicked

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
        Color mouseout = new Color(255,0,0);
        minimize.setBackground(mouseout);        // TODO add your handling code here:
    }//GEN-LAST:event_minimizeMouseEntered

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited
        Color mouseout = new Color(255,255,255);
        minimize.setBackground(mouseout); // TODO add your handling code here:
    }//GEN-LAST:event_minimizeMouseExited

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        Color mouseout = new Color(255,0,0);
        close.setBackground(mouseout);       // TODO add your handling code here:
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        Color mouseout = new Color(255,255,255);
        close.setBackground(mouseout);           // TODO add your handling code here:
    }//GEN-LAST:event_closeMouseExited

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
            java.util.logging.Logger.getLogger(librarian_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(librarian_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(librarian_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(librarian_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new librarian_login().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Home_Page;
    private javax.swing.JLabel close;
    private javax.swing.JLabel forgot;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private rojerusan.RSMaterialButtonCircle login;
    private javax.swing.JLabel minimize;
    private rojerusan.RSPasswordTextPlaceHolder password;
    private rojerusan.RSMaterialButtonCircle signup;
    private app.bolivia.swing.JCTextField user_id_number;
    // End of variables declaration//GEN-END:variables
}
