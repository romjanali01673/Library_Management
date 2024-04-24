/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jframe.admin_file;  

import java.awt.BorderLayout;
import jframe.user_file.*;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import jframe.DB_connection;
import jframe.modarator_file.approve_student;
import jframe.modarator_file.contact_with_boss;
import jframe.modarator_file.contact_with_student;
import jframe.home_page;
import jframe.modarator_file.modarator_portal;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

public class Modarator_Management extends javax.swing.JFrame {
    int id;

    public Modarator_Management(int id) {
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
        all_history = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        book_issue1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        Retrun1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        book_queue1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        retrurnded1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        reading1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        MENU_BAR = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        WELCOME = new javax.swing.JPanel();
        fast_name = new app.bolivia.swing.JCTextField();
        phone = new app.bolivia.swing.JCTextField();
        last_name = new app.bolivia.swing.JCTextField();
        institute_office = new app.bolivia.swing.JCTextField();
        id_of_institute_office = new app.bolivia.swing.JCTextField();
        nid_birth_number = new app.bolivia.swing.JCTextField();
        email = new app.bolivia.swing.JCTextField();
        jLabel3 = new javax.swing.JLabel();
        full_address = new app.bolivia.swing.JCTextField();
        jPanel1 = new javax.swing.JPanel();
        institute_office1 = new app.bolivia.swing.JCTextField();
        id_of_institute_office1 = new app.bolivia.swing.JCTextField();
        full_address1 = new app.bolivia.swing.JCTextField();
        email1 = new app.bolivia.swing.JCTextField();
        nid_birth_number1 = new app.bolivia.swing.JCTextField();
        phone1 = new app.bolivia.swing.JCTextField();
        jLabel16 = new javax.swing.JLabel();
        last_name1 = new app.bolivia.swing.JCTextField();
        fast_name1 = new app.bolivia.swing.JCTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        student_id = new app.bolivia.swing.JCTextField();
        jButton1 = new javax.swing.JButton();
        dob = new app.bolivia.swing.JCTextField();
        dob1 = new app.bolivia.swing.JCTextField();
        jCTextField1 = new app.bolivia.swing.JCTextField();
        jCTextField2 = new app.bolivia.swing.JCTextField();
        APPROVE2 = new rojerusan.RSMaterialButtonCircle();
        APPROVE3 = new rojerusan.RSMaterialButtonCircle();
        APPROVE4 = new rojerusan.RSMaterialButtonCircle();
        APPROVE5 = new rojerusan.RSMaterialButtonCircle();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Library_26px_1.png"))); // NOI18N
        jLabel4.setText("LMS DESHBOARD");
        book_queue.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 6, -1, 30));

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
        jLabel5.setText("Manage Student");
        reading.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel2.add(reading, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 200, 40));

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
        jLabel7.setText("Manage Librarian");
        Retrun.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel2.add(Retrun, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 200, 40));

        retrurnded.setBackground(new java.awt.Color(0, 0, 255));
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
        jLabel6.setText("Mange Modarator");
        retrurnded.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel2.add(retrurnded, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 200, 40));

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
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/home_24px.png"))); // NOI18N
        jLabel8.setText("HOME PAGE");
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
        jLabel9.setText("Manage Admin");
        all_history.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel2.add(all_history, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 200, 40));

        book_issue1.setBackground(new java.awt.Color(0, 0, 0));
        book_issue1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                book_issue1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                book_issue1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                book_issue1MouseExited(evt);
            }
        });
        book_issue1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Book management");
        book_issue1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel2.add(book_issue1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 200, 40));

        Retrun1.setBackground(new java.awt.Color(0, 0, 0));
        Retrun1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Retrun1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Retrun1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Retrun1MouseExited(evt);
            }
        });
        Retrun1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("All History");
        Retrun1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 80, -1));

        jPanel2.add(Retrun1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 200, 40));

        book_queue1.setBackground(new java.awt.Color(0, 0, 0));
        book_queue1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                book_queue1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                book_queue1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                book_queue1MouseExited(evt);
            }
        });
        book_queue1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Custom Opration");
        book_queue1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jPanel2.add(book_queue1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 200, 40));

        retrurnded1.setBackground(new java.awt.Color(0, 0, 0));
        retrurnded1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                retrurnded1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                retrurnded1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                retrurnded1MouseExited(evt);
            }
        });
        retrurnded1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Exit_26px_1.png"))); // NOI18N
        jLabel15.setText("Logout");
        retrurnded1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel2.add(retrurnded1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 200, 40));

        reading1.setBackground(new java.awt.Color(0, 0, 0));
        reading1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reading1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reading1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reading1MouseExited(evt);
            }
        });
        reading1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Notify ");
        reading1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel2.add(reading1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 200, 40));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel32.setText("Features");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

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
        name.setText("ADMIN");
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

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/icons8_Secured_Letter_50px.png"))); // NOI18N
        jLabel10.setText("NOTIFICATION");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        MENU_BAR.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 140, 50));

        getContentPane().add(MENU_BAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 50));

        WELCOME.setBackground(new java.awt.Color(204, 204, 255));

        fast_name.setEditable(false);
        fast_name.setToolTipText("");
        fast_name.setPlaceholder("Fast Name");
        fast_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fast_nameActionPerformed(evt);
            }
        });

        phone.setEditable(false);
        phone.setToolTipText("Enter your Phone Number with Country code.");
        phone.setPlaceholder("phone");
        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });

        last_name.setEditable(false);
        last_name.setPlaceholder("Last Name");

        institute_office.setEditable(false);
        institute_office.setPlaceholder("Institute/ Office Name");
        institute_office.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                institute_officeActionPerformed(evt);
            }
        });

        id_of_institute_office.setEditable(false);
        id_of_institute_office.setPlaceholder("ID number of institute/office");

        nid_birth_number.setEditable(false);
        nid_birth_number.setToolTipText("nid -10,13,17 digit and birth 16,17 digit");
        nid_birth_number.setPlaceholder("NID/Birth number ");
        nid_birth_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nid_birth_numberActionPerformed(evt);
            }
        });

        email.setEditable(false);
        email.setPlaceholder("Email Address");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("hes/her Gender-");

        full_address.setEditable(false);
        full_address.setPlaceholder("Full Address");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        institute_office1.setEditable(false);
        institute_office1.setPlaceholder("Institute/ Office Name");
        institute_office1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                institute_office1ActionPerformed(evt);
            }
        });

        id_of_institute_office1.setEditable(false);
        id_of_institute_office1.setPlaceholder("ID number of institute/office");

        full_address1.setEditable(false);
        full_address1.setPlaceholder("Full Address");

        email1.setEditable(false);
        email1.setPlaceholder("Email Address");

        nid_birth_number1.setEditable(false);
        nid_birth_number1.setToolTipText("nid -10,13,17 digit and birth 16,17 digit");
        nid_birth_number1.setPlaceholder("NID/Birth number ");
        nid_birth_number1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nid_birth_number1ActionPerformed(evt);
            }
        });

        phone1.setEditable(false);
        phone1.setToolTipText("Enter your Phone Number with Country code.");
        phone1.setPlaceholder("phone");
        phone1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phone1ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("hes/her Gender-");

        last_name1.setEditable(false);
        last_name1.setPlaceholder("Last Name");

        fast_name1.setEditable(false);
        fast_name1.setToolTipText("");
        fast_name1.setPlaceholder("Fast Name");
        fast_name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fast_name1ActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel33.setText("FAST NAME");

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel34.setText("LAST NAME");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel35.setText("PHONE");

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel36.setText("FULL ADDRESS");

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel37.setText("FATHER'S NAME");

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel38.setText("FAST NAME");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("LAST NAME");

        jLabel18.setText("PHONE");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("EMAIL ADDRESS");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setText("FULL ADDRESS");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setText("FATHER'S NAME");

        jLabel22.setText("FATHER'S NID");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel23.setText("FATHER'S NID");

        jLabel24.setText("NID/BIRTH NUMBER");

        jLabel25.setText("DATE OF BIRTH");

        jLabel26.setText("DATE OF BIRTH");

        jLabel27.setText("EMAIL ADDRESS");

        jLabel28.setText("NID/BIRTH NUMBER");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel29.setText("Carrent Info ");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel30.setText("Wanted Info");

        student_id.setPlaceholder("Find by Student ID");
        student_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_idActionPerformed(evt);
            }
        });

        jButton1.setText("Find");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        dob.setPlaceholder("Date of birth (DD/MM/YYYY)");
        dob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobActionPerformed(evt);
            }
        });

        dob1.setPlaceholder("Date of birth");
        dob1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dob1ActionPerformed(evt);
            }
        });

        jCTextField1.setPlaceholder("Gender");

        jCTextField2.setPlaceholder("Gender");

        APPROVE2.setText("add");
        APPROVE2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                APPROVE2MouseClicked(evt);
            }
        });
        APPROVE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                APPROVE2ActionPerformed(evt);
            }
        });

        APPROVE3.setText("remove");
        APPROVE3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                APPROVE3MouseClicked(evt);
            }
        });
        APPROVE3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                APPROVE3ActionPerformed(evt);
            }
        });

        APPROVE4.setText("c a status");
        APPROVE4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                APPROVE4MouseClicked(evt);
            }
        });
        APPROVE4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                APPROVE4ActionPerformed(evt);
            }
        });

        APPROVE5.setText("update");
        APPROVE5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                APPROVE5MouseClicked(evt);
            }
        });
        APPROVE5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                APPROVE5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout WELCOMELayout = new javax.swing.GroupLayout(WELCOME);
        WELCOME.setLayout(WELCOMELayout);
        WELCOMELayout.setHorizontalGroup(
            WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WELCOMELayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WELCOMELayout.createSequentialGroup()
                        .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(WELCOMELayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jButton1))
                            .addComponent(student_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                        .addComponent(APPROVE2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WELCOMELayout.createSequentialGroup()
                            .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fast_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(last_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel33)
                                .addComponent(jLabel34)
                                .addComponent(jLabel35)
                                .addComponent(jLabel27))
                            .addGap(57, 57, 57)
                            .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nid_birth_number, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel24)
                                    .addComponent(dob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jCTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(full_address, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WELCOMELayout.createSequentialGroup()
                            .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel37)
                                .addComponent(institute_office, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(id_of_institute_office, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel22))))
                    .addComponent(jLabel36)
                    .addGroup(WELCOMELayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel29)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(WELCOMELayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WELCOMELayout.createSequentialGroup()
                                    .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(phone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(email1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fast_name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(last_name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel38)
                                        .addComponent(jLabel17)
                                        .addComponent(jLabel18)
                                        .addComponent(jLabel19))
                                    .addGap(59, 59, 59)
                                    .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dob1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(WELCOMELayout.createSequentialGroup()
                                            .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(nid_birth_number1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel26)
                                                .addComponent(jLabel28))
                                            .addGap(0, 0, Short.MAX_VALUE))))
                                .addComponent(full_address1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WELCOMELayout.createSequentialGroup()
                                    .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(WELCOMELayout.createSequentialGroup()
                                            .addComponent(institute_office1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(12, 12, 12))
                                        .addGroup(WELCOMELayout.createSequentialGroup()
                                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(197, 197, 197)))
                                    .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel23)
                                        .addComponent(id_of_institute_office1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WELCOMELayout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addGap(148, 148, 148))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WELCOMELayout.createSequentialGroup()
                        .addComponent(APPROVE5, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(APPROVE4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(APPROVE3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(WELCOMELayout.createSequentialGroup()
                    .addGap(850, 850, 850)
                    .addComponent(jCTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(58, 58, 58)))
        );
        WELCOMELayout.setVerticalGroup(
            WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WELCOMELayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WELCOMELayout.createSequentialGroup()
                        .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(WELCOMELayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel38))
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(WELCOMELayout.createSequentialGroup()
                                .addComponent(fast_name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(last_name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(WELCOMELayout.createSequentialGroup()
                                .addComponent(phone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(email1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(WELCOMELayout.createSequentialGroup()
                                .addComponent(dob1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nid_birth_number1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(full_address1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(institute_office1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id_of_institute_office1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(WELCOMELayout.createSequentialGroup()
                            .addComponent(jLabel29)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(WELCOMELayout.createSequentialGroup()
                                    .addComponent(jLabel33)
                                    .addGap(12, 12, 12)
                                    .addComponent(fast_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)
                                    .addComponent(jLabel34)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(last_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(44, 44, 44)
                                    .addComponent(jLabel35)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WELCOMELayout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jCTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(64, 64, 64)
                                    .addComponent(jLabel25)
                                    .addGap(9, 9, 9)))
                            .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(WELCOMELayout.createSequentialGroup()
                                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel27)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(WELCOMELayout.createSequentialGroup()
                                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel24)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(nid_birth_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(11, 11, 11)
                            .addComponent(jLabel36)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(full_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(21, 21, 21)
                            .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel37)
                                .addComponent(jLabel22))
                            .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(id_of_institute_office, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(institute_office, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WELCOMELayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(student_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(41, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WELCOMELayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(APPROVE3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(APPROVE4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(APPROVE5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(APPROVE2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))))
            .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(WELCOMELayout.createSequentialGroup()
                    .addGap(96, 96, 96)
                    .addComponent(jCTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(542, Short.MAX_VALUE)))
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

           this.dispose();
    }//GEN-LAST:event_book_queueMouseClicked

    private void readingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_readingMouseClicked
            Modarator_Management ac = new Modarator_Management(id);
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

    private void all_historyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_all_historyMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_all_historyMouseClicked

    private void all_historyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_all_historyMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_all_historyMouseEntered

    private void all_historyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_all_historyMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_all_historyMouseExited

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

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        notification n = new notification(id);
        n.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void book_issue1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book_issue1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_book_issue1MouseClicked

    private void book_issue1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book_issue1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_book_issue1MouseEntered

    private void book_issue1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book_issue1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_book_issue1MouseExited

    private void book_queue1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book_queue1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_book_queue1MouseClicked

    private void book_queue1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book_queue1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_book_queue1MouseEntered

    private void book_queue1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book_queue1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_book_queue1MouseExited

    private void reading1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reading1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_reading1MouseClicked

    private void reading1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reading1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_reading1MouseEntered

    private void reading1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reading1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_reading1MouseExited

    private void Retrun1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Retrun1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Retrun1MouseClicked

    private void Retrun1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Retrun1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Retrun1MouseEntered

    private void Retrun1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Retrun1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Retrun1MouseExited

    private void retrurnded1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retrurnded1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_retrurnded1MouseClicked

    private void retrurnded1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retrurnded1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_retrurnded1MouseEntered

    private void retrurnded1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retrurnded1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_retrurnded1MouseExited

    private void fast_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fast_nameActionPerformed

    }//GEN-LAST:event_fast_nameActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void institute_officeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_institute_officeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_institute_officeActionPerformed

    private void nid_birth_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nid_birth_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nid_birth_numberActionPerformed

    private void institute_office1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_institute_office1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_institute_office1ActionPerformed

    private void nid_birth_number1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nid_birth_number1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nid_birth_number1ActionPerformed

    private void phone1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phone1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phone1ActionPerformed

    private void fast_name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fast_name1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fast_name1ActionPerformed

    private void student_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_idActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        int s_id = Integer.parseInt(student_id.getText());

    }//GEN-LAST:event_jButton1MouseClicked

    private void dobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobActionPerformed

    private void dob1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dob1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dob1ActionPerformed

    private void APPROVE2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_APPROVE2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_APPROVE2MouseClicked

    private void APPROVE2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_APPROVE2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_APPROVE2ActionPerformed

    private void APPROVE3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_APPROVE3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_APPROVE3MouseClicked

    private void APPROVE3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_APPROVE3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_APPROVE3ActionPerformed

    private void APPROVE4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_APPROVE4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_APPROVE4MouseClicked

    private void APPROVE4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_APPROVE4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_APPROVE4ActionPerformed

    private void APPROVE5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_APPROVE5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_APPROVE5MouseClicked

    private void APPROVE5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_APPROVE5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_APPROVE5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonCircle APPROVE2;
    private rojerusan.RSMaterialButtonCircle APPROVE3;
    private rojerusan.RSMaterialButtonCircle APPROVE4;
    private rojerusan.RSMaterialButtonCircle APPROVE5;
    private javax.swing.JPanel MENU_BAR;
    private javax.swing.JPanel Retrun;
    private javax.swing.JPanel Retrun1;
    private javax.swing.JPanel WELCOME;
    private javax.swing.JPanel all_history;
    private javax.swing.JPanel book_issue;
    private javax.swing.JPanel book_issue1;
    private javax.swing.JPanel book_queue;
    private javax.swing.JPanel book_queue1;
    private javax.swing.JLabel close;
    private app.bolivia.swing.JCTextField dob;
    private app.bolivia.swing.JCTextField dob1;
    private app.bolivia.swing.JCTextField email;
    private app.bolivia.swing.JCTextField email1;
    private app.bolivia.swing.JCTextField fast_name;
    private app.bolivia.swing.JCTextField fast_name1;
    private app.bolivia.swing.JCTextField full_address;
    private app.bolivia.swing.JCTextField full_address1;
    private javax.swing.JLabel home;
    private app.bolivia.swing.JCTextField id_of_institute_office;
    private app.bolivia.swing.JCTextField id_of_institute_office1;
    private app.bolivia.swing.JCTextField institute_office;
    private app.bolivia.swing.JCTextField institute_office1;
    private javax.swing.JButton jButton1;
    private app.bolivia.swing.JCTextField jCTextField1;
    private app.bolivia.swing.JCTextField jCTextField2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private app.bolivia.swing.JCTextField last_name;
    private app.bolivia.swing.JCTextField last_name1;
    private javax.swing.JLabel name;
    private app.bolivia.swing.JCTextField nid_birth_number;
    private app.bolivia.swing.JCTextField nid_birth_number1;
    private app.bolivia.swing.JCTextField phone;
    private app.bolivia.swing.JCTextField phone1;
    private javax.swing.JPanel reading;
    private javax.swing.JPanel reading1;
    private javax.swing.JPanel retrurnded;
    private javax.swing.JPanel retrurnded1;
    private app.bolivia.swing.JCTextField student_id;
    // End of variables declaration//GEN-END:variables
public static void main(String [] args){
    Modarator_Management x = new Modarator_Management(345);
    x.setVisible(true);
}}
