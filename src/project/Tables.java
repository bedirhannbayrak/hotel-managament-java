package project;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author bedirhan
 */
public class Tables {
    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        try {
            con = ConnectionProvider.getCon();
            st = con.createStatement();
            st.executeUpdate("CREATE TABLE USERS(name varchar(200) , email varchar(200), password varchar(50), status varchar(20))");
            JOptionPane.showMessageDialog(null, "Table created successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                con.close();
                st.close();
            } catch (Exception e) {
            }
        }
    }
}
