/*CREATE TABLE user_info( id INT(8) ZEROFILL AUTO_INCREMENT NOT NULL UNIQUE, fast_name VARCHAR(30), last_name VARCHAR(30) NOT NULL, phone VARCHAR(15) NOT NULL, email VARCHAR(200) NOT NULL, gender VARCHAR(10) NOT NULL, nid_birth_number INT(17) NOT NULL, date_of_birth DATE NOT NULL, istitute_office VARCHAR(300) NOT NULL, id_number VARCHAR(20), full_address VARCHAR(300) NOT NULL, pass VARCHAR(20) NOT NULL );*/
package jframe;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author romja
 */
public class DB_connection {
    static Connection con = null;
    public static Connection getConnection(){
        try {
             Class.forName("com.mysql.jdbc.Driver");
            // Connection and DriverManager must have to import fast
            // the two library won't show in gide you by (alt+enter).
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_ms","root", ""); 
        }catch (Exception e ){
            e.printStackTrace();
        }
        return con;
    }
}
 