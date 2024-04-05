/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jframe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class NewClass {
    public boolean asddfa(int id, String pass){
        System.out.println(id);

    return true;
    }
            public void updatepass(int id, String newpass){
            try{
            Connection con = DB_connection.getConnection();
            String sql = "update user_info set pass = ? where id = ?";
            PreparedStatement pst = con.prepareStatement("UPDATE user_info SET pass = 'new_password' WHERE id = ?");
            
            //pst.setString(1,"khjkjh");
            pst.setString(1,"44");
            
            }catch (Exception e){
                e.printStackTrace();
            JOptionPane.showMessageDialog(null, "server error");
            
            }     
            }
    public static void main(String [] args){
        NewClass s = new NewClass();
        s.updatepass(43, "rom");
        s.asddfa(76,"kdsfk");



}
}
