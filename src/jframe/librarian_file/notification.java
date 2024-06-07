/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jframe.librarian_file;

import jframe.user_file.*;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jframe.method_romjanali01673.DB_connection;
import jframe.Help;
import jframe.home_page;
import jframe.method_romjanali01673.notificationStore;
import jframe.moderator_file.modarator_portal;

public class notification extends javax.swing.JFrame {
    int id;
    int row =0;
        String subject = "";
        String descreption = "";
        String message = "";
        String date = "";
        String time = "";    

    public notification(int id) {
        this.id = id;
        initComponents();
        set_profile();
        //get_row();
        //get_data();

        set_table();
    }
/*  note-----------------------------
        Person[] people = new Person[3];

        // Initialize the array with Person objects
        people[0] = new Person("Alice", 30);
        people[1] = new Person("Bob", 25);
        people[2] = new Person("Charlie", 35);

        // Access and modify elements in the array
        for (Person person : people) {
            System.out.println(person);
        }

        // Modify an element in the array
        people[1].setName("Robert");
        people[1].setAge(26);

        // Print the array again to see the changes
        System.out.println("After modification:");
        for (Person person : people) {
            System.out.println(person);
        }
    */
    

    public void set_table(){
       try{
            Connection con = DB_connection.getConnection();
            String sql = "select * from notification where student_id = "+id;
            PreparedStatement pst = con.prepareStatement(sql);
            //pst.setInt(1,id);            
            ResultSet rs = pst.executeQuery(sql);
            // the while loop will add a row by eatch 1 looping.
            while(rs.next()){
                 int student_id=rs.getInt("student_id");
                 int employee_id=rs.getInt("employee_id");
                 String subject=rs.getString("subject");
                 java.sql.Time T_time=rs.getTime("T_time");
                 java.sql.Date T_date=rs.getDate("T_date");
                 String message=rs.getString("message");
                 String description=rs.getString("description");

                //set data in table
                Object[] obj = {subject,T_time,T_date,message,description};
                DefaultTableModel model = (DefaultTableModel) table_data.getModel();
                model.addRow(obj);
            }
       }catch(Exception E){
           System.out.println("erroes");
           E.printStackTrace();
       }}
    
    public void get_book_id_from_table(){
        DefaultTableModel model = (DefaultTableModel)table_data.getModel();
        int row = table_data.getSelectedRow();
         subject = (String) model.getValueAt(row,0);
         descreption = (String) model.getValueAt(row,4);
         message = (String) model.getValueAt(row,3);
        java.sql.Date date = (java.sql.Date) model.getValueAt(row,1);
        java.sql.Time time = (java.sql.Time) model.getValueAt(row,2);
        this.date = String.valueOf(date);
        this.time = String.valueOf(time);
    }
    public void setValue(){
        a.setText(subject);
        b.setText(descreption);
        c.setText(message);
        d.setText(date);
        e.setText(time);
    }
    public void get_row() {
        try {
            // Establish a connection
            Connection con = DB_connection.getConnection();

            // Prepare the SQL query with COUNT
            String sql = "SELECT COUNT(*) FROM notification WHERE student_id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);

            // Execute the query
            ResultSet rd = pst.executeQuery();

            // Get the row count from the result set
            if (rd.next()) {
                row = rd.getInt(1);
               System.out.print(row);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

        
/*
        public void get_data(){
        notificationStore [] ns = new notificationStore[row];
        int i =0;
        try{
            Connection con = DB_connection.getConnection();
            String sql = "select *  from notification where student_id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                 int student_id=rs.getInt("student_id");
                 int employee_id=rs.getInt("employee_id");
                 String subject=rs.getString("subject");
                 java.sql.Time T_time=rs.getTime("T_time");
                 java.sql.Date T_date=rs.getDate("T_date");
                 String message=rs.getString("message");
                 String description=rs.getString("description");
                 ns[i]= new notificationStore(student_id, employee_id, subject, T_time, T_date, message, description);
                 i++;
            }
        }catch(Exception e ){
            JOptionPane.showMessageDialog(this, "Server Error!");
            e.printStackTrace();
        }

    }
    */
    public void set_profile(){
        try{

        }catch(Exception e ){
            JOptionPane.showMessageDialog(this, "Server Error!");
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Notification = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        d = new app.bolivia.swing.JCTextField();
        a = new app.bolivia.swing.JCTextField();
        e = new app.bolivia.swing.JCTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        b = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        c = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_data = new rojeru_san.complementos.RSTableMetro();
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

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Notification History");
        Notification.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel2.add(Notification, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 40));

        d.setEditable(false);
        jPanel2.add(d, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 260, -1));

        a.setEditable(false);
        jPanel2.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 260, -1));

        e.setEditable(false);
        jPanel2.add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 260, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Message Time");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Description");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 360, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Subject");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        b.setEditable(false);
        b.setColumns(20);
        b.setRows(5);
        b.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(b);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 1040, 230));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Message Date");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        c.setEditable(false);
        c.setColumns(20);
        c.setRows(5);
        jScrollPane2.setViewportView(c);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 270, 300));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("Message");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        table_data.setBackground(new java.awt.Color(204, 255, 204));
        table_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Subject", "description", "Message", "Date", "Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
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
        table_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_dataMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table_data);
        if (table_data.getColumnModel().getColumnCount() > 0) {
            table_data.getColumnModel().getColumn(0).setMaxWidth(200);
            table_data.getColumnModel().getColumn(1).setMaxWidth(430);
            table_data.getColumnModel().getColumn(2).setMaxWidth(200);
            table_data.getColumnModel().getColumn(3).setMaxWidth(120);
            table_data.getColumnModel().getColumn(4).setMaxWidth(90);
        }

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 1040, 340));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1360, 670));

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
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/icons8_Rewind_48px.png"))); // NOI18N
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
        MENU_BAR.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, 170, 50));

        getContentPane().add(MENU_BAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closeMouseClicked

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

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        book_add hp = new book_add(id);
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

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
        notification n = new notification(id);
        n.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel17MouseClicked

    private void table_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_dataMouseClicked
get_book_id_from_table();
setValue();
        
// TODO add your handling code here:
    }//GEN-LAST:event_table_dataMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        notification r = new notification(87);
        r.setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MENU_BAR;
    private javax.swing.JPanel Notification;
    private app.bolivia.swing.JCTextField a;
    private javax.swing.JTextArea b;
    private javax.swing.JTextArea c;
    private javax.swing.JLabel close;
    private app.bolivia.swing.JCTextField d;
    private app.bolivia.swing.JCTextField e;
    private javax.swing.JLabel home;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel name;
    private rojeru_san.complementos.RSTableMetro table_data;
    // End of variables declaration//GEN-END:variables
}
