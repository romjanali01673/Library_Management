/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jframe.user_file;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jframe.method_romjanali01673.DB_connection;
import jframe.home_page;
import jframe.method_romjanali01673.notificationStore;


public class queue extends javax.swing.JFrame {
    int id;
    

    public queue(int id) {
        this.id = id;
        initComponents();
        set_profile();
        set_table1();
    }

    public void set_profile(){
        try{
            Connection con = DB_connection.getConnection();
            String sql = "select fast_name,last_name from user_info where id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                String a = rs.getString("fast_name");
                String b = rs.getString("last_name");
                
                name.setText(a+ " "+ b+ " - "+ id);                
            }
        }catch(Exception e ){
            e.printStackTrace();
        }
    }
   public void set_table1(){
       try{
            Connection con = DB_connection.getConnection();
            Statement st = con.createStatement();
            String sql = "select * from student_book inner join book_data on student_book.book_id=book_data.book_id where student_book.student_id = "+id+ " and T_status = \"ISSUE\"";
            ResultSet rs = st.executeQuery(sql);
            // the while loop will add a row by eatch 1 looping.
            while(rs.next()){
                
                String book_id = rs.getString("book_id");
                String book_name = rs.getString("book_name");
                String book_author = rs.getString("author");
                String book_type = rs.getString("book_type");
                String book_part = rs.getString("book_part");
                String date = rs.getString("T_date");
                String time = rs.getString("T_time");

                Object[] obj = {book_id,book_name,book_author,book_type,book_part,date,time};
                DefaultTableModel model = (DefaultTableModel) table_data.getModel();
                model.addRow(obj);
            }
       }catch(Exception E){
           E.printStackTrace();
       }
   }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MENU_BAR = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        WELCOME = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_data = new rojeru_san.complementos.RSTableMetro();
        jPanel2 = new javax.swing.JPanel();
        reading = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Retrun = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        retrurnded = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        book_issue = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        all_history = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        book_queue = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MENU_BAR.setBackground(new java.awt.Color(0, 204, 0));
        MENU_BAR.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        name.setText("User");
        name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameMouseClicked(evt);
            }
        });
        MENU_BAR.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 0, 280, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("User Portal");
        MENU_BAR.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 180, 50));

        home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/home_24px.png"))); // NOI18N
        home.setToolTipText("GO TO HOME");
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        MENU_BAR.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/icons8_Secured_Letter_50px.png"))); // NOI18N
        jLabel3.setText("NOTIFICATION");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        MENU_BAR.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 170, 50));

        getContentPane().add(MENU_BAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 50));

        WELCOME.setBackground(new java.awt.Color(204, 204, 255));
        WELCOME.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("You applied for The following book, please collect this book.");

        table_data.setBackground(new java.awt.Color(204, 255, 204));
        table_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Book Name", "Book Author", "Book Type", "Part", "Issue Date", "Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_data.setColorBackgoundHead(new java.awt.Color(255, 0, 0));
        table_data.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        table_data.setColorBordeHead(new java.awt.Color(0, 0, 255));
        table_data.setColorFilasBackgound1(new java.awt.Color(204, 204, 255));
        table_data.setColorFilasBackgound2(new java.awt.Color(153, 255, 153));
        table_data.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        table_data.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        table_data.setColorForegroundHead(new java.awt.Color(0, 0, 0));
        table_data.setColorSelForeground(new java.awt.Color(0, 0, 0));
        table_data.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        table_data.setFuenteFilas(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        table_data.setFuenteFilasSelect(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        table_data.setRowHeight(30);
        table_data.setShowHorizontalLines(true);
        table_data.setShowVerticalLines(true);
        jScrollPane3.setViewportView(table_data);
        if (table_data.getColumnModel().getColumnCount() > 0) {
            table_data.getColumnModel().getColumn(0).setMinWidth(90);
            table_data.getColumnModel().getColumn(0).setMaxWidth(90);
            table_data.getColumnModel().getColumn(4).setMinWidth(50);
            table_data.getColumnModel().getColumn(4).setMaxWidth(50);
            table_data.getColumnModel().getColumn(5).setMinWidth(120);
            table_data.getColumnModel().getColumn(5).setMaxWidth(120);
            table_data.getColumnModel().getColumn(6).setMinWidth(100);
            table_data.getColumnModel().getColumn(6).setMaxWidth(100);
        }

        javax.swing.GroupLayout WELCOMELayout = new javax.swing.GroupLayout(WELCOME);
        WELCOME.setLayout(WELCOMELayout);
        WELCOMELayout.setHorizontalGroup(
            WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WELCOMELayout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addComponent(jLabel1)
                .addContainerGap(323, Short.MAX_VALUE))
            .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(WELCOMELayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1098, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );
        WELCOMELayout.setVerticalGroup(
            WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WELCOMELayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(631, Short.MAX_VALUE))
            .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(WELCOMELayout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(19, Short.MAX_VALUE)))
        );

        getContentPane().add(WELCOME, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 1140, 670));

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jLabel5.setText("Reading... ");
        reading.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

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
        jLabel7.setText("Returne");
        Retrun.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel2.add(Retrun, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 200, 40));

        retrurnded.setBackground(new java.awt.Color(0, 0, 0));
        retrurnded.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                retrurndedMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                retrurndedMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                retrurndedMouseExited(evt);
            }
        });
        retrurnded.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Returnded");
        retrurnded.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel2.add(retrurnded, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 200, 40));

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
        jLabel8.setText("Book issue");
        book_issue.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel2.add(book_issue, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 200, 40));

        all_history.setBackground(new java.awt.Color(0, 0, 0));
        all_history.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                all_historyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                all_historyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                all_historyMouseExited(evt);
            }
        });
        all_history.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("All History");
        all_history.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel2.add(all_history, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 200, 40));

        book_queue.setBackground(new java.awt.Color(255, 0, 0));
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
        jLabel4.setText("Book Queue");
        book_queue.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel2.add(book_queue, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 200, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 220, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void book_queueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book_queueMouseEntered
        // TODO add your handling code here:
        Color mousein = new Color(51,51,51);
        book_queue.setBackground(mousein);
    }//GEN-LAST:event_book_queueMouseEntered

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void book_queueMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book_queueMouseExited
        // TODO add your handling code here:
        Color mousein = new Color(255,0,0);
        book_queue.setBackground(mousein);
    }//GEN-LAST:event_book_queueMouseExited

    private void book_queueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book_queueMouseClicked
queue ue = new queue(id);
ue.setVisible(true);
this.dispose();

    }//GEN-LAST:event_book_queueMouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        home_page hp = new home_page();
        hp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeMouseClicked

    private void nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameMouseClicked

        int s = JOptionPane.showConfirmDialog(null,"Do you want to change your info?","confirmation message", JOptionPane.YES_NO_CANCEL_OPTION);
        if ( s == JOptionPane.YES_OPTION){
            change_info ci = new change_info(id);
            ci.setVisible(true);
            this.dispose();
        }
        else {
            System.out.println("you have clicked CANCEL");
        }
    }//GEN-LAST:event_nameMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        notification n = new notification(id);
        n.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void readingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_readingMouseClicked
reading rd = new reading (id);
rd.setVisible(true);
this.dispose();
    }//GEN-LAST:event_readingMouseClicked

    private void readingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_readingMouseEntered
        // TODO add your handling code here:
        Color mousein = new Color(51,51,51);
        reading.setBackground(mousein);
    }//GEN-LAST:event_readingMouseEntered

    private void readingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_readingMouseExited
        // TODO add your handling code here:
        Color mousein = new Color(0,0,0);
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

    private void retrurndedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retrurndedMouseClicked
returned rd = new returned(id);
rd.setVisible(true);
this.dispose();

    }//GEN-LAST:event_retrurndedMouseClicked

    private void retrurndedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retrurndedMouseEntered
        // TODO add your handling code here:
        Color mousein = new Color(51,51,51);
        retrurnded.setBackground(mousein);
    }//GEN-LAST:event_retrurndedMouseEntered

    private void retrurndedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retrurndedMouseExited
        // TODO add your handling code here:
        Color mouseout = new Color(0,0,0);
        retrurnded.setBackground(mouseout);
    }//GEN-LAST:event_retrurndedMouseExited

    private void book_issueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book_issueMouseClicked
        book_issue bi = new book_issue (id );
        bi.setVisible(true);
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

    private void all_historyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_all_historyMouseClicked
all_history ah = new all_history(id);
ah.setVisible(true);
this.dispose();
    }//GEN-LAST:event_all_historyMouseClicked

    private void all_historyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_all_historyMouseEntered
        Color mousein = new Color(51,51,51);
        all_history.setBackground(mousein);
    }//GEN-LAST:event_all_historyMouseEntered

    private void all_historyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_all_historyMouseExited
        Color mousein = new Color(0,0,0);
        all_history.setBackground(mousein);
    }//GEN-LAST:event_all_historyMouseExited



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MENU_BAR;
    private javax.swing.JPanel Retrun;
    private javax.swing.JPanel WELCOME;
    private javax.swing.JPanel all_history;
    private javax.swing.JPanel book_issue;
    private javax.swing.JPanel book_queue;
    private javax.swing.JLabel close;
    private javax.swing.JLabel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel name;
    private javax.swing.JPanel reading;
    private javax.swing.JPanel retrurnded;
    private rojeru_san.complementos.RSTableMetro table_data;
    // End of variables declaration//GEN-END:variables
public static void main(String [] args){
    queue ue = new queue(87);
    ue.setVisible(true);
}}
