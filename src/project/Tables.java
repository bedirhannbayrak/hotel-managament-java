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
            //st.executeUpdate("CREATE TABLE USERS(name varchar(200) , email varchar(200), password varchar(50), status varchar(20))");
            //st.executeUpdate("CREATE TABLE ROOMS(roomNo varchar(10) , roomType varchar(200), bed varchar(200),price int , status varchar(20))");
            st.executeUpdate("CREATE TABLE customer(id int , name varchar(200), mobileNumber varchar(20),nationality varchar(200),gender varchar(200),idProof varchar(200),address varchar(500),checkIn varchar(50),roomNo varchar(10),bed varchar(200),roomType varchar(200),pricePerDay varchar(10),numberOfDaysStay int(10),totalAmount varchar(200), checkOut varchar(50))");
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
