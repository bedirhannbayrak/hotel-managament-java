/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import hotel.management.system.Employer.ManageRoom;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author bedirhan
 */
public class QueryMethods {
    
    
    
    
    
    public void addCustomer(String name,String gender,String roomNo,String bed,String roomType,String price){
        
        SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        String today=(myFormat.format(cal.getTime()));
        
        String Query;
        Random random = new Random();
        
         Query="UPDATE ROOMS SET STATUS = 'Booked' WHERE roomNo='"+roomNo+"' " ;
                    InsertUpdateDelete.setData(Query, "");
                    Query="INSERT INTO CUSTOMER(id,name,mobileNumber,nationality,gender,email,idProof,address,checkIn,"
                            + "roomNo,bed,roomType,pricePerDay) "
                            + "values("+random.nextInt(100000)+", "
                            + "'"+name+"',"
                            + "'53"+(random.nextInt(99999999- 10000000) + 10000000)+"',"
                            + "'Turkey',"
                            + "'"+gender+"',"
                            + "'"+name.toLowerCase()+"@gmail.com',"
                            + "'"+(random.nextInt(999999999- 100000000) + 100000000)+"',"
                            + "'İstanbul',"
                            //+ "'"+today+"',"
                            + "'06/06/2021',"
                            + "'"+roomNo+"',"
                            + "'"+bed+"',"
                            + "'"+roomType+"',"
                            + "'"+price+"')";
                    InsertUpdateDelete.setData(Query, "Customer Check In successfully");
    }
    
    
    public void addRoom(String roomNo,String roomType,String bed,String price){
        
        try {
           Integer roomNoInt= Integer.parseInt(roomNo);
           Integer priceDouble = Integer.parseInt(price);
           
            if(roomNoInt < 0 || priceDouble <=0 ){
                JOptionPane.showMessageDialog(null, "Please enter positive number");
            }else{
                String Query = "INSERT INTO ROOMS VALUES ('"+roomNo+"','"+roomType+"','"+bed+"',"+price+", 'Not Booked')";
            InsertUpdateDelete.setData(Query, "Succsessfully Updated");
            }
   
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
          
    }
    
    
    public static void main(String[] args) {
        QueryMethods queryMethod = new QueryMethods();
        
        //queryMethod.addCustomer("Sena", "Female", "105", "Double", "Normal", "750");
        queryMethod.addRoom("300", "Normal","Single", "700");
    }
    
}
