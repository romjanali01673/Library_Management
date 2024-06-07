/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jframe.librarian_file;

import jframe.moderator_file.*;
import jframe.moderator_file.contact_with_student;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import jframe.method_romjanali01673.DB_connection;
import jframe.home_page;
import jframe.method_romjanali01673.necessaryMethod;

public class contact_employee extends javax.swing.JFrame {
        necessaryMethod nm = new necessaryMethod();

    int id ;
    
    public contact_employee(int id){
        initComponents();
        this.id = id;
    }

    public boolean valid(){
        boolean res = true;
        if(nm.remove_white_space(subject.getText()).equals("")){
            JOptionPane.showMessageDialog(this, "Write subject");
            return false;
        }
        else if(nm.remove_white_space(message.getText()).equals("")){
            JOptionPane.showMessageDialog(this, "Write message");
            return false;
        }
        else if(nm.remove_white_space(description.getText()).equals("")){
            JOptionPane.showMessageDialog(this, "Write description");
            return false;
        }
        else if(nm.stringToint(employee_id.getText())==0){
            JOptionPane.showMessageDialog(this, "Write student ID");
            return false;
        }
        return res;
    }
    public void send(){
    try{
        Connection con = DB_connection.getConnection();
        String str = "insert into notification(subject,employee_id,From_who,T_time,T_date,message,description) values(?,?,?,?,?,?,?)";
        PreparedStatement pst = con.prepareStatement(str);    
        pst.setString(1, nm.remove_white_space(subject.getText()));
        pst.setInt(2, nm.stringToint(employee_id.getText()));
        pst.setInt(3,id);
        pst.setTime(4, nm.getNowTime());
        pst.setDate(5, nm.getTodayDate());
        pst.setString(6, nm.remove_white_space(message.getText()));
        pst.setString(7, nm.remove_white_space(description.getText()));
        
        int rs = pst.executeUpdate();
        if(rs>0){
            JOptionPane.showMessageDialog(this, "message send!");

        }
        else{
            JOptionPane.showMessageDialog(this, "Student Dose Not Exist!");
                    
        }
    }catch(Exception e){
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Server Error!");
    
    }
    }
    public void getData(){
    try{
        Connection con = DB_connection.getConnection();
        String str = "select * from employee_data where user_id=?";
        PreparedStatement pst = con.prepareStatement(str);    
        pst.setInt(1, nm.stringToint(employee_id.getText()));
        ResultSet rs = pst.executeQuery();
        if(rs.next()){
            String phone= rs.getString("phone");
            String f_name= rs.getString("fast_name");
            String l_name= rs.getString("last_name");
            
            this.phone.setText(phone);
            this.fname.setText(f_name+" "+l_name);
        }
        else{
            JOptionPane.showMessageDialog(this, "Student Dose Not Exist!");
                    
        }
    }catch(Exception e){
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Server Error!");
    
    }
    }
    public void set_profile(){
        try{
            Connection con = DB_connection.getConnection();
            String sql = "select full_name from modarator_data where user_id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                String a = rs.getString("full_name");
                name.setText(a);
                
            }
        }catch(Exception e ){
            e.printStackTrace();
            
        }

    }


        

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MENU_BAR = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Notification = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        subject = new app.bolivia.swing.JCTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        message = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        submit = new rojerusan.RSMaterialButtonCircle();
        fname = new app.bolivia.swing.JCTextField();
        phone = new app.bolivia.swing.JCTextField();
        employee_id = new app.bolivia.swing.JCTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        book_queue = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        reading = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Retrun = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        book_issue = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        contact_employee = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        Retrun2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MENU_BAR.setBackground(new java.awt.Color(0, 204, 0));
        MENU_BAR.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        name.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        name.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/male_user_50px.png"))); // NOI18N
        name.setText("Modarator");
        MENU_BAR.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 0, 240, -1));

        home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/home_24px.png"))); // NOI18N
        home.setToolTipText("GO TO HOME");
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        MENU_BAR.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Modarator Portal");
        MENU_BAR.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 180, 50));

        close.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("X");
        close.setToolTipText("Click For Exit ");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        MENU_BAR.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 0, 40, 40));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/icons8_Secured_Letter_50px.png"))); // NOI18N
        jLabel17.setText("NOTIFICATION");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        MENU_BAR.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, 170, 50));

        getContentPane().add(MENU_BAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 50));

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Notification.setBackground(new java.awt.Color(0, 0, 0));
        Notification.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NotificationMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NotificationMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NotificationMouseExited(evt);
            }
        });
        Notification.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Send Notifocation.");
        Notification.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel3.add(Notification, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 40));
        jPanel3.add(subject, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("Description");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setText("Subject");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        description.setColumns(20);
        description.setRows(5);
        jScrollPane1.setViewportView(description);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 750, 440));

        message.setColumns(20);
        message.setRows(5);
        jScrollPane2.setViewportView(message);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 280, 260));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel13.setText("Message");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        submit.setText("send");
        submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitMouseClicked(evt);
            }
        });
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel3.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 550, 220, 80));

        fname.setEditable(false);
        fname.setPlaceholder("Full Name :   auto insart.");
        jPanel3.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, 390, -1));

        phone.setEditable(false);
        phone.setPlaceholder("Phone number");
        jPanel3.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 630, 250, -1));

        employee_id.setPlaceholder("Find by Employee ID :");
        jPanel3.add(employee_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, -1, -1));

        jButton1.setText("Find");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 540, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Employee Full Name  - ");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Employee Phone Number  -  ");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 600, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 1140, 670));

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        book_queue.setBackground(new java.awt.Color(0, 0, 0));
        book_queue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                book_queueMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                book_queueMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                book_queueMouseExited(evt);
            }
        });
        book_queue.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Add New Book");
        book_queue.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel2.add(book_queue, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 200, 40));

        reading.setBackground(new java.awt.Color(0, 0, 0));
        reading.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                readingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                readingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                readingMouseExited(evt);
            }
        });
        reading.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Book Receive(Returned)");
        reading.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel2.add(reading, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 200, 40));

        Retrun.setBackground(new java.awt.Color(0, 0, 0));
        Retrun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RetrunMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RetrunMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RetrunMouseExited(evt);
            }
        });
        Retrun.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Update Book");
        Retrun.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel2.add(Retrun, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 200, 40));

        book_issue.setBackground(new java.awt.Color(0, 0, 0));
        book_issue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                book_issueMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                book_issueMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                book_issueMouseExited(evt);
            }
        });
        book_issue.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Confirm Book Request");
        book_issue.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, -1));

        jPanel2.add(book_issue, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 200, 40));

        contact_employee.setBackground(new java.awt.Color(255, 0, 0));
        contact_employee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contact_employeeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                contact_employeeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                contact_employeeMouseExited(evt);
            }
        });
        contact_employee.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Contact with Employee");
        contact_employee.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jPanel2.add(contact_employee, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 200, 40));

        Retrun2.setBackground(new java.awt.Color(0, 0, 0));
        Retrun2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Retrun2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Retrun2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Retrun2MouseExited(evt);
            }
        });
        Retrun2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Contact With Student");
        Retrun2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel2.add(Retrun2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 200, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 220, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        home_page hp = new home_page();
        hp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
        notification n = new notification(id);
        n.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel17MouseClicked

    private void NotificationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NotificationMouseClicked
        modarator_portal mp = new modarator_portal(id );
        mp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_NotificationMouseClicked

    private void NotificationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NotificationMouseEntered
        Color mousein = new Color(51,51,51);
        Notification.setBackground(mousein);
    }//GEN-LAST:event_NotificationMouseEntered

    private void NotificationMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NotificationMouseExited
        Color mouseout = new Color(0,0,0);
        Notification.setBackground(mouseout);
    }//GEN-LAST:event_NotificationMouseExited

    private void submitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMouseClicked
        if(valid()){
            send();
        }
    }//GEN-LAST:event_submitMouseClicked

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submitActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if(nm.stringToint(employee_id.getText())!=0)  {
            getData();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void book_queueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book_queueMouseClicked
        queue as = new queue(id);
        as.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_book_queueMouseClicked

    private void book_queueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book_queueMouseEntered
        // TODO add your handling code here:
        Color mousein = new Color(51,51,51);
        book_queue.setBackground(mousein);
    }//GEN-LAST:event_book_queueMouseEntered

    private void book_queueMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book_queueMouseExited
        // TODO add your handling code here:
        Color mousein = new Color(0,0,0);
        book_queue.setBackground(mousein);
    }//GEN-LAST:event_book_queueMouseExited

    private void readingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_readingMouseClicked
        book_add ac = new book_add(id);
        ac.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_readingMouseClicked

    private void readingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_readingMouseEntered
        // TODO add your handling code here:
        Color mousein = new Color(251,0,0);
        reading.setBackground(mousein);
    }//GEN-LAST:event_readingMouseEntered

    private void readingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_readingMouseExited
        // TODO add your handling code here:
        Color mousein = new Color(251,0,0);
        reading.setBackground(mousein);
    }//GEN-LAST:event_readingMouseExited

    private void RetrunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RetrunMouseClicked
        Return cws = new Return(id);
        cws.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RetrunMouseClicked

    private void RetrunMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RetrunMouseEntered
        // TODO add your handling code here:
        Color mousein = new Color(51,51,51);
        Retrun.setBackground(mousein);
    }//GEN-LAST:event_RetrunMouseEntered

    private void RetrunMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RetrunMouseExited
        // TODO add your handling code here:
        Color mouseout = new Color(0,0,0);
        Retrun.setBackground(mouseout);
    }//GEN-LAST:event_RetrunMouseExited

    private void book_issueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book_issueMouseClicked
        modarator_portal mp = new modarator_portal(id );
        mp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_book_issueMouseClicked

    private void book_issueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book_issueMouseEntered
        Color mousein = new Color(51,51,51);
        book_issue.setBackground(mousein);
    }//GEN-LAST:event_book_issueMouseEntered

    private void book_issueMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book_issueMouseExited
        Color mouseout = new Color(0,0,0);
        book_issue.setBackground(mouseout);
    }//GEN-LAST:event_book_issueMouseExited

    private void contact_employeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contact_employeeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_contact_employeeMouseClicked

    private void contact_employeeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contact_employeeMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_contact_employeeMouseEntered

    private void contact_employeeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contact_employeeMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_contact_employeeMouseExited

    private void Retrun2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Retrun2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Retrun2MouseClicked

    private void Retrun2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Retrun2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Retrun2MouseEntered

    private void Retrun2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Retrun2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Retrun2MouseExited

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
            java.util.logging.Logger.getLogger(contact_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(contact_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(contact_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(contact_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MENU_BAR;
    private javax.swing.JPanel Notification;
    private javax.swing.JPanel Retrun;
    private javax.swing.JPanel Retrun2;
    private javax.swing.JPanel book_issue;
    private javax.swing.JPanel book_queue;
    private javax.swing.JLabel close;
    private javax.swing.JPanel contact_employee;
    private javax.swing.JTextArea description;
    private app.bolivia.swing.JCTextField employee_id;
    private app.bolivia.swing.JCTextField fname;
    private javax.swing.JLabel home;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea message;
    private javax.swing.JLabel name;
    private app.bolivia.swing.JCTextField phone;
    private javax.swing.JPanel reading;
    private app.bolivia.swing.JCTextField subject;
    private rojerusan.RSMaterialButtonCircle submit;
    // End of variables declaration//GEN-END:variables
}
