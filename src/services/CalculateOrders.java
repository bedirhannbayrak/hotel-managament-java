/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entitites.OrderByCustomerId;
import java.sql.ResultSet;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import project.Select;

/**
 *
 * @author bedirhan
 */
public class CalculateOrders {
    
    String Query;
    LinkedList<OrderByCustomerId> ll;
    public LinkedList<OrderByCustomerId> getBuysById(int id) {
        ll= new LinkedList<OrderByCustomerId>();
        Query = "SELECT hotel.orders.customer_id,hotel.orders.order_number,"
                + " hotel.products.Name, hotel.products.price\n"
                + "from hotel.orders \n"
                +"inner join hotel.products on "
                + "hotel.orders.product_id = hotel.products.productID"
                + " where customer_id="+id;
        ResultSet rs = Select.getData(Query);
        try {
            while(rs.next()){
                
                OrderByCustomerId order = new OrderByCustomerId();
                
                order.setCustomer_id(rs.getInt(1));
                order.setOrder_number(rs.getInt(2));
                order.setName(rs.getString(3));
                order.setPrice(rs.getDouble(4));
                
                ll.add(order);
                
            }
            rs.close();
            return ll;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
//    public static void main(String[] args) {
//        CalculateOrders orderss = new CalculateOrders();
//        LinkedList<OrderByCustomerId> ll = orderss.getBuysById(1);
//        for(OrderByCustomerId l : ll){
//            System.out.println(l);
//        }
//        
//    }
    
}
