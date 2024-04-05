/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jframe;

import java.awt.Desktop;
import java.net.URI;
import javax.swing.JOptionPane;

public class Help extends javax.swing.JFrame {

    /**
     * Creates new form Help
     */
    public Help() {
        initComponents();
    }
    public void execute(){
        try{
            int a = option.getSelectedIndex();// index started from 0;
            
        URI email  = new URI("https://mailto:romajnali01673@gmail.com");
        URI facebook  = new URI("https://www.facebook.com/romjanali01673");
        URI whatsapp  = new URI("https://wa.me/+8801779852361");
        //URI contact  = new URI("https://tel:+8801779852361");
        
        if(a == 0 ){
         Desktop.getDesktop().browse(whatsapp);   
        }
        else if(a == 1){
         JOptionPane.showMessageDialog(this,"Our Contact Number is : +8801779852361");
        }        
        else if(a == 2){
         Desktop.getDesktop().browse(email);         
        }       
        else if(a == 3){
         Desktop.getDesktop().browse(facebook);          
        }

        }catch(Exception e ){
              JOptionPane.showMessageDialog(this, e);
        }
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        option = new javax.swing.JComboBox<>();
        contact = new rojerusan.RSMaterialButtonCircle();
        Home_Page = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Help and Contact Page");
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("If you need any help about applocation and any type of colsole, consalt Etc.");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 470, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("contact with us by ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 150, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText(" feel free to contact with us.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 170, 30));

        option.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "WhatsApp", "Contact ", "Email", "Facebook" }));
        option.setToolTipText("");
        option.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionActionPerformed(evt);
            }
        });
        jPanel1.add(option, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        contact.setText("contact");
        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 120, 60));

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void optionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optionActionPerformed

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        execute();
    }//GEN-LAST:event_contactActionPerformed

    private void Home_PageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Home_PageActionPerformed
        home_page hp = new home_page();
        hp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Home_PageActionPerformed

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
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Help().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Home_Page;
    private rojerusan.RSMaterialButtonCircle contact;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> option;
    // End of variables declaration//GEN-END:variables


}
