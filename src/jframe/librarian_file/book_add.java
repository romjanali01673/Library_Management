/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jframe.librarian_file;

import jframe.user_file.*;
import java.awt.Color;
import java.awt.Desktop;
import java.net.URI;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import jframe.method_romjanali01673.DB_connection;
import jframe.moderator_file.contact_employee;
import jframe.home_page;
import jframe.method_romjanali01673.necessaryMethod;
import jframe.moderator_file.modarator_portal;

public class book_add extends javax.swing.JFrame {
    necessaryMethod nm = new necessaryMethod();
    int id;
    
        int B_id = 0;
        String B_name = "";
        String B_type = "";
        String B_author = "";
        int B_part = 0;
        int B_price = 0;
        int B_quantity= 0;
        String B_source = "";
        String B_comment = "";  
        String status = "REGULER";

    public book_add(int id) {
        this.id = id;
        initComponents();
        set_profile();
        
    }
//insart book data in data base.
    public void add_book(int book_id){
        try{
        Connection con= DB_connection.getConnection();
        String sql = "insert into book_data(book_id,book_name,author,book_part,book_type,price,few_i_line,quantity,book_source,status              ) values(?,?,?,?,?,?,?,?,?,?);";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, B_id);
        pst.setString(2,B_name);
        pst.setString(3,B_author);
        pst.setInt(4,B_part);
        pst.setString(5,B_type);
        pst.setInt(6,B_price);
        pst.setString(7,B_comment);
        pst.setInt(8,B_quantity);
        pst.setString(9,B_source);
        pst.setString(10,status);
        
        int rs = pst.executeUpdate();
        if (rs>0){
            JOptionPane.showMessageDialog(this, "New Book Added!");
        }            
        }catch(Exception e ){
            JOptionPane.showMessageDialog(this, "New Book Addation Faild!");
            e.printStackTrace();
        }
    }
    public boolean take_book_data(){
        boolean res = true;
        try{
         B_id = Integer.valueOf(remove_white_space(book_id.getText()));
         B_name = remove_white_space(book_name.getText()).toUpperCase();
         B_type = remove_white_space(book_type.getText()).toUpperCase();
         B_author = remove_white_space(book_author.getText()).toUpperCase();
         B_part = Integer.valueOf(remove_white_space(book_part.getText()));
         B_price = Integer.valueOf(remove_white_space(book_price.getText()));
         B_quantity= Integer.valueOf(remove_white_space(quantity.getText()));
         B_source = remove_white_space(book_source.getText()).toUpperCase();
         B_comment = remove_white_space(book_comment.getText()).toUpperCase();    
         if(REGULER1.isSelected()){
             status = "REGULER";
         }
         else if(SUSPENDED1.isSelected()){
             status = "SUSPENDED";
         }
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,"Enter valid input!");
            res = false;
        }
        return res;
    }
    public boolean book_exist(int book_id){
        boolean res = true;
        try{
        Connection con = DB_connection.getConnection();
        String sql = "select * from book_data where book_id = ?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, book_id);
        ResultSet rs = pst.executeQuery();
        
        if (rs.next()){
            JOptionPane.showMessageDialog(this, "The Book Already Exist.");
        }
        else{
            res = false;
        }
        }catch(Exception e){
            e.printStackTrace();
            res = false;
        }
        return res;
    }
    public boolean checked_input_validity(){
        boolean res = true;
        
        if(nm.stringToint(book_id.getText())==0||nm.stringToint(book_id.getText())==999999){
            res = false;
            JOptionPane.showMessageDialog(this, "Enter Book ID!");
        }
        else if(nm.remove_white_space(book_name.getText()).equals("")){
            res = false;
            JOptionPane.showMessageDialog(this, "Enter Book Name!");
        }
        else if(nm.remove_white_space(book_type.getText()).equals("")){
            res = false;
            JOptionPane.showMessageDialog(this, "Enter Book Type!");
        }
        else if(nm.remove_white_space(book_author.getText()).equals("")){
            res = false;
            JOptionPane.showMessageDialog(this, "Enter Book Author Name!");
        }
        else if(nm.stringToint(book_part.getText())==0){
            res = false;
            JOptionPane.showMessageDialog(this, "Enter Book Part!");
        }
        else if(nm.stringToint(book_price.getText())==0){
            res = false;
            JOptionPane.showMessageDialog(this, "Enter Book Price!");
        }
        else if(nm.stringToint(quantity.getText())==0){
            res = false;
            JOptionPane.showMessageDialog(this, "Enter Book Quantity!");
        }
        else if(nm.remove_white_space(book_source.getText()).equals("")){
            res = false;
            JOptionPane.showMessageDialog(this, "Enter Book Source!");
        }
        else if(nm.remove_white_space(book_comment.getText()).equals("")){
            res = false;
            JOptionPane.showMessageDialog(this, "Write Few Intrasting Line About The Book!");
        }
        
        return res;
    }    
    public void set_profile(){
        try{
            Connection con = DB_connection.getConnection();
            String sql = "select fast_name, last_name from user_info where id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                String a = rs.getString("fast_name");
                String b = rs.getString("last_name");
                name.setText(a+" "+b+ " - "+ id);
                
            }
        }catch(Exception e ){
            e.printStackTrace();
        }
    }
    public static String remove_white_space(String str){
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
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
        jLabel9 = new javax.swing.JLabel();
        Retrun2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        WELCOME = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        book_type = new app.bolivia.swing.JCTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        book_author = new app.bolivia.swing.JCTextField();
        jLabel11 = new javax.swing.JLabel();
        book_id = new app.bolivia.swing.JCTextField();
        jLabel12 = new javax.swing.JLabel();
        book_name = new app.bolivia.swing.JCTextField();
        book_part = new app.bolivia.swing.JCTextField();
        jLabel13 = new javax.swing.JLabel();
        confirm_book_request = new rojerusan.RSMaterialButtonCircle();
        quantity = new app.bolivia.swing.JCTextField();
        book_source = new app.bolivia.swing.JCTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        book_price = new app.bolivia.swing.JCTextField();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        book_comment = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        REGULER1 = new javax.swing.JRadioButton();
        SUSPENDED1 = new javax.swing.JRadioButton();
        jLabel38 = new javax.swing.JLabel();
        MENU_BAR = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

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

        book_issue.setBackground(new java.awt.Color(255, 0, 0));
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

        contact_employee.setBackground(new java.awt.Color(0, 0, 0));
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

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Contact with Employee");
        contact_employee.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

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

        WELCOME.setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(0, 204, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Check the book is available or not!");

        book_type.setBackground(new java.awt.Color(204, 255, 204));
        book_type.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        book_type.setPlaceholder("So far, you have not searched any books. ");
        book_type.setSelectionColor(new java.awt.Color(102, 102, 255));
        book_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_typeActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 204, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(513, 8));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 513, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Book Type");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Book Author");

        book_author.setBackground(new java.awt.Color(204, 255, 204));
        book_author.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        book_author.setPlaceholder("So far, you have not searched any books. ");
        book_author.setSelectionColor(new java.awt.Color(102, 102, 255));
        book_author.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_authorActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Book ID");

        book_id.setBackground(new java.awt.Color(204, 255, 204));
        book_id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        book_id.setPlaceholder("So far, you have not searched any books. ");
        book_id.setSelectionColor(new java.awt.Color(102, 102, 255));
        book_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_idActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Book Name");

        book_name.setBackground(new java.awt.Color(204, 255, 204));
        book_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        book_name.setPlaceholder("So far, you have not searched any books. ");
        book_name.setSelectionColor(new java.awt.Color(102, 102, 255));
        book_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_nameActionPerformed(evt);
            }
        });

        book_part.setBackground(new java.awt.Color(204, 255, 204));
        book_part.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        book_part.setPlaceholder("So far, you have not searched any books. ");
        book_part.setSelectionColor(new java.awt.Color(102, 102, 255));
        book_part.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_partActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Book Part");

        confirm_book_request.setText("Confirm new book addition");
        confirm_book_request.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirm_book_requestMouseClicked(evt);
            }
        });
        confirm_book_request.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirm_book_requestActionPerformed(evt);
            }
        });

        quantity.setBackground(new java.awt.Color(204, 255, 204));
        quantity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        quantity.setPlaceholder("So far, you did not search any student. ");
        quantity.setSelectionColor(new java.awt.Color(102, 102, 255));
        quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityActionPerformed(evt);
            }
        });

        book_source.setBackground(new java.awt.Color(204, 255, 204));
        book_source.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        book_source.setPlaceholder("So far, you did not search any student. ");
        book_source.setSelectionColor(new java.awt.Color(102, 102, 255));
        book_source.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_sourceActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel14.setText("Book Source");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel16.setText("Book Quantity");

        book_price.setBackground(new java.awt.Color(204, 255, 204));
        book_price.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        book_price.setPlaceholder("So far, you have not searched any books. ");
        book_price.setSelectionColor(new java.awt.Color(102, 102, 255));
        book_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_priceActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("Book Price");

        book_comment.setColumns(20);
        book_comment.setRows(5);
        jScrollPane1.setViewportView(book_comment);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel20.setText("Few Intrasting Line About The Book ");

        buttonGroup1.add(REGULER1);
        REGULER1.setSelected(true);
        REGULER1.setText("Reguler");

        buttonGroup1.add(SUSPENDED1);
        SUSPENDED1.setText("Suspended");

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel38.setText("Book Status");

        javax.swing.GroupLayout WELCOMELayout = new javax.swing.GroupLayout(WELCOME);
        WELCOME.setLayout(WELCOMELayout);
        WELCOMELayout.setHorizontalGroup(
            WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WELCOMELayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WELCOMELayout.createSequentialGroup()
                        .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, WELCOMELayout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(book_price, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, WELCOMELayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(68, 68, 68)
                                .addComponent(book_type, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(WELCOMELayout.createSequentialGroup()
                                .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(49, 49, 49)
                                .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(book_author, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                                    .addComponent(book_part, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, WELCOMELayout.createSequentialGroup()
                                .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                                .addGap(50, 50, 50)
                                .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(WELCOMELayout.createSequentialGroup()
                                        .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel38)
                                            .addGroup(WELCOMELayout.createSequentialGroup()
                                                .addComponent(REGULER1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(SUSPENDED1)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(book_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(book_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(43, 43, 43))
                    .addGroup(WELCOMELayout.createSequentialGroup()
                        .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(WELCOMELayout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WELCOMELayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WELCOMELayout.createSequentialGroup()
                                .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(quantity, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                                    .addComponent(book_source, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(90, 90, 90))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WELCOMELayout.createSequentialGroup()
                                .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1)
                                    .addComponent(confirm_book_request, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34))))
                    .addGroup(WELCOMELayout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel20)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        WELCOMELayout.setVerticalGroup(
            WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(WELCOMELayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(70, 70, 70)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(REGULER1)
                    .addComponent(SUSPENDED1))
                .addGap(46, 46, 46)
                .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(book_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(book_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(book_type, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(book_author, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(book_part, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(book_price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55))
            .addGroup(WELCOMELayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(WELCOMELayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)))
                .addGroup(WELCOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WELCOMELayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(book_source, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(WELCOMELayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14)))
                .addGap(82, 82, 82)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirm_book_request, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        getContentPane().add(WELCOME, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 1140, 670));

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closeMouseClicked

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

    private void confirm_book_requestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirm_book_requestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirm_book_requestActionPerformed

    private void book_partActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_partActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_book_partActionPerformed

    private void book_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_book_nameActionPerformed

    private void book_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_book_idActionPerformed

    private void book_authorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_authorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_book_authorActionPerformed

    private void book_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_book_typeActionPerformed

    private void quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityActionPerformed

    private void book_sourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_sourceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_book_sourceActionPerformed

    private void book_issueMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book_issueMouseExited
        Color mouseout = new Color(0,0,0);
        book_issue.setBackground(mouseout);
    }//GEN-LAST:event_book_issueMouseExited

    private void book_issueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book_issueMouseEntered
        Color mousein = new Color(51,51,51);
        book_issue.setBackground(mousein);
    }//GEN-LAST:event_book_issueMouseEntered

    private void book_issueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book_issueMouseClicked
        modarator_portal mp = new modarator_portal(id );
        mp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_book_issueMouseClicked

    private void RetrunMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RetrunMouseExited
        // TODO add your handling code here:
        Color mouseout = new Color(0,0,0);
        Retrun.setBackground(mouseout);
    }//GEN-LAST:event_RetrunMouseExited

    private void RetrunMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RetrunMouseEntered
        // TODO add your handling code here:
        Color mousein = new Color(51,51,51);
        Retrun.setBackground(mousein);
    }//GEN-LAST:event_RetrunMouseEntered

    private void RetrunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RetrunMouseClicked
        Return cws = new Return(id);
        cws.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RetrunMouseClicked

    private void readingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_readingMouseExited
        // TODO add your handling code here:
        Color mousein = new Color(251,0,0);
        reading.setBackground(mousein);
    }//GEN-LAST:event_readingMouseExited

    private void readingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_readingMouseEntered
        // TODO add your handling code here:
        Color mousein = new Color(251,0,0);
        reading.setBackground(mousein);
    }//GEN-LAST:event_readingMouseEntered

    private void readingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_readingMouseClicked
        book_add ac = new book_add(id);
        ac.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_readingMouseClicked

    private void book_queueMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book_queueMouseExited
        // TODO add your handling code here:
        Color mousein = new Color(0,0,0);
        book_queue.setBackground(mousein);
    }//GEN-LAST:event_book_queueMouseExited

    private void book_queueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book_queueMouseEntered
        // TODO add your handling code here:
        Color mousein = new Color(51,51,51);
        book_queue.setBackground(mousein);
    }//GEN-LAST:event_book_queueMouseEntered

    private void book_queueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book_queueMouseClicked
        queue as = new queue(id);
        as.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_book_queueMouseClicked

    private void book_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_book_priceActionPerformed

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
        notification n = new notification(id);
        n.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel17MouseClicked

    private void contact_employeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contact_employeeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_contact_employeeMouseClicked

    private void contact_employeeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contact_employeeMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_contact_employeeMouseEntered

    private void contact_employeeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contact_employeeMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_contact_employeeMouseExited

    private void confirm_book_requestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirm_book_requestMouseClicked
        if(checked_input_validity()){
            if(take_book_data()){
                if(!book_exist(B_id)){
                    add_book(B_id);
                }
            }
        }
    }//GEN-LAST:event_confirm_book_requestMouseClicked

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
        book_add ba = new book_add(123);
        ba.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MENU_BAR;
    private javax.swing.JRadioButton REGULER1;
    private javax.swing.JPanel Retrun;
    private javax.swing.JPanel Retrun2;
    private javax.swing.JRadioButton SUSPENDED1;
    private javax.swing.JPanel WELCOME;
    private app.bolivia.swing.JCTextField book_author;
    private javax.swing.JTextArea book_comment;
    private app.bolivia.swing.JCTextField book_id;
    private javax.swing.JPanel book_issue;
    private app.bolivia.swing.JCTextField book_name;
    private app.bolivia.swing.JCTextField book_part;
    private app.bolivia.swing.JCTextField book_price;
    private javax.swing.JPanel book_queue;
    private app.bolivia.swing.JCTextField book_source;
    private app.bolivia.swing.JCTextField book_type;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel close;
    private rojerusan.RSMaterialButtonCircle confirm_book_request;
    private javax.swing.JPanel contact_employee;
    private javax.swing.JLabel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel name;
    private app.bolivia.swing.JCTextField quantity;
    private javax.swing.JPanel reading;
    // End of variables declaration//GEN-END:variables
}
