/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jframe.user_file;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import jframe.DB_connection;
import jframe.approve_student;
import jframe.contact_with_boss;
import jframe.contact_with_student;
import jframe.home_page;
import jframe.modarator_portal;

public class get_book_details extends javax.swing.JFrame {
    int id;

    public get_book_details(int id) {
        this.id = id;
        initComponents();
        set_profile();
        
    }
    public void set_profile(){
        try{
            Connection con = DB_connection.getConnection();
            String sql = "select fast_name from modarator_data where user_id = ?";
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
        book_queue = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        reading = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Retrun = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        retrurnded = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        book_issue = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        get_book_details = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        all_history1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        MENU_BAR = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        WELCOME = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        rSTableMetro2 = new rojeru_san.complementos.RSTableMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jLabel4.setText("Book Queue");
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

        retrurnded.setBackground(new java.awt.Color(255, 0, 0));
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
        jLabel6.setText("Returned");
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

        get_book_details.setBackground(new java.awt.Color(0, 0, 0));
        get_book_details.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                get_book_detailsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                get_book_detailsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                get_book_detailsMouseExited(evt);
            }
        });
        get_book_details.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Get Book Details");
        get_book_details.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel2.add(get_book_details, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 200, 40));

        all_history1.setBackground(new java.awt.Color(0, 0, 0));
        all_history1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                all_history1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                all_history1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                all_history1MouseExited(evt);
            }
        });
        all_history1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("All History");
        all_history1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel2.add(all_history1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 200, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 220, 670));

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

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/icons8_Secured_Letter_50px.png"))); // NOI18N
        jLabel17.setText("NOTIFICATION");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        MENU_BAR.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, 140, 50));

        getContentPane().add(MENU_BAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 50));

        WELCOME.setBackground(new java.awt.Color(204, 204, 255));
        WELCOME.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("your read book and returned books.");

        jScrollPane2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("You have taken these books. \nYou must have to returned the book.\nso take care these book like you self.\n\nplease visit our library continue \nand take book,return book, explore the author mind.\n\nif yor feel any problem and harasmend by us,\nfeel free to contact with us.\n");
        jScrollPane2.setViewportView(jTextArea1);

        rSTableMetro2.setBackground(new java.awt.Color(204, 255, 204));
        rSTableMetro2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "dfasd", "dfdfsd", null, "dfdsf"},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Book ID", "Book Name", "Book Author", "Book Part", "Returned Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        rSTableMetro2.setColorBackgoundHead(new java.awt.Color(255, 0, 0));
        rSTableMetro2.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        rSTableMetro2.setColorBordeHead(new java.awt.Color(0, 0, 255));
        rSTableMetro2.setColorFilasBackgound1(new java.awt.Color(204, 204, 255));
        rSTableMetro2.setColorFilasBackgound2(new java.awt.Color(153, 255, 153));
        rSTableMetro2.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        rSTableMetro2.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        rSTableMetro2.setColorForegroundHead(new java.awt.Color(0, 0, 0));
        rSTableMetro2.setColorSelForeground(new java.awt.Color(0, 0, 0));
        rSTableMetro2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rSTableMetro2.setFuenteFilas(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rSTableMetro2.setFuenteFilasSelect(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rSTableMetro2.setRowHeight(30);
        jScrollPane3.setViewportView(rSTableMetro2);

        javax.swing.GroupLayout WELCOMELayout = new javax.swing.GroupLayout(WELCOME);
        WELCOME.setLayout(WELCOMELayout);
        WELCOMELayout.setHorizontalGroup(
            WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WELCOMELayout.createSequentialGroup()
                .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WELCOMELayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(WELCOMELayout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        WELCOMELayout.setVerticalGroup(
            WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WELCOMELayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WELCOMELayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(WELCOME, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 1140, 670));

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
        Color mousein = new Color(0,0,0);
        book_queue.setBackground(mousein);
    }//GEN-LAST:event_book_queueMouseExited

    private void book_queueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book_queueMouseClicked
           approve_student as = new approve_student(id);
           as.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_book_queueMouseClicked

    private void readingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_readingMouseClicked
            get_book_details ac = new get_book_details(id);
            ac.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_readingMouseClicked

    private void readingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_readingMouseEntered
        // TODO add your handling code here:
        Color mousein = new Color(51,51,51);
        reading.setBackground(mousein);
    }//GEN-LAST:event_readingMouseEntered

    private void readingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_readingMouseExited
        // TODO add your handling code here:
        Color mousein = new Color(251,0,0);
        reading.setBackground(mousein);
    }//GEN-LAST:event_readingMouseExited

    private void retrurndedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retrurndedMouseClicked
        contact_with_boss cwb =  new contact_with_boss(id);
        cwb.setVisible(true);
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

    private void RetrunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RetrunMouseClicked
        contact_with_student cws = new contact_with_student(id);
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

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        home_page hp = new home_page();
        hp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeMouseClicked

    private void get_book_detailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_get_book_detailsMouseClicked
        // TODO add your handling code here:
        get_book_details gbd = newe get_book_details(id);
        gbd.setVisible(true);
    }//GEN-LAST:event_get_book_detailsMouseClicked

    private void get_book_detailsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_get_book_detailsMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_get_book_detailsMouseEntered

    private void get_book_detailsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_get_book_detailsMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_get_book_detailsMouseExited

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

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
        notification n = new notification(id);
        n.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel17MouseClicked

    private void all_history1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_all_history1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_all_history1MouseClicked

    private void all_history1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_all_history1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_all_history1MouseEntered

    private void all_history1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_all_history1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_all_history1MouseExited

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
            java.util.logging.Logger.getLogger(get_book_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(get_book_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(get_book_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(get_book_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MENU_BAR;
    private javax.swing.JPanel Retrun;
    private javax.swing.JPanel WELCOME;
    private javax.swing.JPanel all_history1;
    private javax.swing.JPanel book_issue;
    private javax.swing.JPanel book_queue;
    private javax.swing.JLabel close;
    private javax.swing.JPanel get_book_details;
    private javax.swing.JLabel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel name;
    private rojeru_san.complementos.RSTableMetro rSTableMetro2;
    private javax.swing.JPanel reading;
    private javax.swing.JPanel retrurnded;
    // End of variables declaration//GEN-END:variables
}
