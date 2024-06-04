/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jframe.moderator_file;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import jframe.DB_connection;
import jframe.home_page;

public class contact_with_student extends javax.swing.JFrame {
    int id ;
    
    
    contact_with_student(int id){
        this.id = id;
        initComponents();
        set_profile();
        
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
    public void show_panel(int panel){
        switch (panel) {
            /*case 0:
                approve_student_panel.setVisible(true);//---
                approve_changes_panel.setVisible(false);
                contact_with_student_panel.setVisible(false);
                contact_with_boss_panel.setVisible(false);
                welcome_panel.setVisible(false);
                break;
            case 1:
                approve_student_panel.setVisible(false);
                approve_changes_panel.setVisible(true);//---
                contact_with_student_panel.setVisible(false);
                contact_with_boss_panel.setVisible(false);
                welcome_panel.setVisible(false);
                break;
            case 2:
                approve_student_panel.setVisible(false);
                approve_changes_panel.setVisible(false);
                contact_with_student_panel.setVisible(true);//--
                contact_with_boss_panel.setVisible(false);
                welcome_panel.setVisible(false);
                break;
            case 3:
                approve_student_panel.setVisible(false);
                approve_changes_panel.setVisible(false);
                contact_with_student_panel.setVisible(false);
                contact_with_boss_panel.setVisible(true);//---
                welcome_panel.setVisible(false);
                break;
            case 4:
                approve_student_panel.setVisible(false);
                approve_changes_panel.setVisible(false);
                contact_with_student_panel.setVisible(false);
                contact_with_boss_panel.setVisible(false);
                welcome_panel.setVisible(true); //----
                break;*/
            default:
                break;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        approve_student = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        approve_changes = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        contact_with_student = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        contact_with_boss = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        welcome = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        MENU_BAR = new javax.swing.JPanel();
        home = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Notification = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jCTextField2 = new app.bolivia.swing.JCTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        rSMaterialButtonCircle1 = new rojerusan.RSMaterialButtonCircle();
        jCTextField3 = new app.bolivia.swing.JCTextField();
        jCTextField5 = new app.bolivia.swing.JCTextField();
        jCTextField6 = new app.bolivia.swing.JCTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        approve_student.setBackground(new java.awt.Color(0, 0, 0));
        approve_student.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                approve_studentMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                approve_studentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                approve_studentMouseExited(evt);
            }
        });
        approve_student.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Approve Student");
        approve_student.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel2.add(approve_student, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 200, 40));

        approve_changes.setBackground(new java.awt.Color(0, 0, 0));
        approve_changes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                approve_changesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                approve_changesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                approve_changesMouseExited(evt);
            }
        });
        approve_changes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Approve Changes");
        approve_changes.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel2.add(approve_changes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 200, 40));

        contact_with_student.setBackground(new java.awt.Color(251, 0, 0));
        contact_with_student.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contact_with_studentMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                contact_with_studentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                contact_with_studentMouseExited(evt);
            }
        });
        contact_with_student.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Notify Student");
        contact_with_student.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel2.add(contact_with_student, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 200, 40));

        contact_with_boss.setBackground(new java.awt.Color(0, 0, 0));
        contact_with_boss.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contact_with_bossMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                contact_with_bossMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                contact_with_bossMouseExited(evt);
            }
        });
        contact_with_boss.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Notify Boss ");
        contact_with_boss.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel2.add(contact_with_boss, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 200, 40));

        welcome.setBackground(new java.awt.Color(0, 0, 0));
        welcome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                welcomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                welcomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                welcomeMouseExited(evt);
            }
        });
        welcome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("welcome");
        welcome.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel2.add(welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 200, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 220, 670));

        MENU_BAR.setBackground(new java.awt.Color(0, 204, 0));
        MENU_BAR.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        name.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        name.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/male_user_50px.png"))); // NOI18N
        name.setText("Modarator");
        MENU_BAR.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 0, 280, -1));

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
        jPanel3.add(jCTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("Description");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setText("Subject");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 750, 440));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 280, 260));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel13.setText("Message");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        rSMaterialButtonCircle1.setText("send");
        rSMaterialButtonCircle1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSMaterialButtonCircle1MouseClicked(evt);
            }
        });
        rSMaterialButtonCircle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle1ActionPerformed(evt);
            }
        });
        jPanel3.add(rSMaterialButtonCircle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 550, 220, 80));

        jCTextField3.setPlaceholder("Full Name :   auto insart.");
        jPanel3.add(jCTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, 390, -1));

        jCTextField5.setPlaceholder("NID/Birth NO : auto insart.");
        jPanel3.add(jCTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 630, 250, -1));

        jCTextField6.setPlaceholder("Find Student by  User ID");
        jPanel3.add(jCTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, -1, -1));

        jButton1.setText("Find");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 540, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 1140, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void approve_studentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approve_studentMouseEntered
        // TODO add your handling code here:
        Color mousein = new Color(51,51,51);
        approve_student.setBackground(mousein);
    }//GEN-LAST:event_approve_studentMouseEntered

    private void approve_studentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approve_studentMouseExited
        // TODO add your handling code here:
        Color mousein = new Color(0,0,0);
        approve_student.setBackground(mousein);
    }//GEN-LAST:event_approve_studentMouseExited

    private void approve_studentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approve_studentMouseClicked
           approve_student as = new approve_student(id);
           as.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_approve_studentMouseClicked

    private void approve_changesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approve_changesMouseClicked
                approve_changes ac = new approve_changes(id);
                ac.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_approve_changesMouseClicked

    private void approve_changesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approve_changesMouseEntered
        // TODO add your handling code here:
        Color mousein = new Color(51,51,51);
        approve_changes.setBackground(mousein);
    }//GEN-LAST:event_approve_changesMouseEntered

    private void approve_changesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approve_changesMouseExited
        // TODO add your handling code here:
        Color mousein = new Color(0,0,0);
        approve_changes.setBackground(mousein);
    }//GEN-LAST:event_approve_changesMouseExited

    private void contact_with_bossMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contact_with_bossMouseClicked
        contact_with_boss cwb= new contact_with_boss(id);
        cwb.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_contact_with_bossMouseClicked

    private void contact_with_bossMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contact_with_bossMouseEntered
        // TODO add your handling code here:
        Color mousein = new Color(51,51,51);
        contact_with_boss.setBackground(mousein);
    }//GEN-LAST:event_contact_with_bossMouseEntered

    private void contact_with_bossMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contact_with_bossMouseExited
        // TODO add your handling code here:
        Color mouseout = new Color(0,0,0);
        contact_with_boss.setBackground(mouseout);
    }//GEN-LAST:event_contact_with_bossMouseExited

    private void contact_with_studentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contact_with_studentMouseClicked
        contact_with_student cws = new contact_with_student(id);
        cws.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_contact_with_studentMouseClicked

    private void contact_with_studentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contact_with_studentMouseEntered
        // TODO add your handling code here:
        Color mousein = new Color(51,51,51);
        contact_with_student.setBackground(mousein);
    }//GEN-LAST:event_contact_with_studentMouseEntered

    private void contact_with_studentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contact_with_studentMouseExited
        // TODO add your handling code here:
        Color mouseout = new Color(251,0,0);
        contact_with_student.setBackground(mouseout);
    }//GEN-LAST:event_contact_with_studentMouseExited

    private void welcomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_welcomeMouseClicked
          modarator_portal mp = new modarator_portal(id);
          mp.setVisible(true);
          this.dispose();
          
    }//GEN-LAST:event_welcomeMouseClicked

    private void welcomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_welcomeMouseEntered
        Color mousein = new Color(51,51,51);
        welcome.setBackground(mousein);
    }//GEN-LAST:event_welcomeMouseEntered

    private void welcomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_welcomeMouseExited
        Color mouseout = new Color(0,0,0);
        welcome.setBackground(mouseout);
    }//GEN-LAST:event_welcomeMouseExited

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

    private void rSMaterialButtonCircle1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle1MouseClicked
        // TODO add your handling code here:
        Help hp = new Help();
        hp.setVisible(true);

    }//GEN-LAST:event_rSMaterialButtonCircle1MouseClicked

    private void rSMaterialButtonCircle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSMaterialButtonCircle1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(contact_with_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(contact_with_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(contact_with_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(contact_with_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MENU_BAR;
    private javax.swing.JPanel Notification;
    private javax.swing.JPanel approve_changes;
    private javax.swing.JPanel approve_student;
    private javax.swing.JLabel close;
    private javax.swing.JPanel contact_with_boss;
    private javax.swing.JPanel contact_with_student;
    private javax.swing.JLabel home;
    private javax.swing.JButton jButton1;
    private app.bolivia.swing.JCTextField jCTextField2;
    private app.bolivia.swing.JCTextField jCTextField3;
    private app.bolivia.swing.JCTextField jCTextField5;
    private app.bolivia.swing.JCTextField jCTextField6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel name;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle1;
    private javax.swing.JPanel welcome;
    // End of variables declaration//GEN-END:variables
}
