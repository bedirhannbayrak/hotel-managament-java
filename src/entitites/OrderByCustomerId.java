/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitites;

/**
 *
 * @author bedirhan
 */
public class OrderByCustomerId {
    
    private int customer_id;
    private int order_number;
    private String name;
    private double price;

    public OrderByCustomerId() {
    }

    public OrderByCustomerId(int customer_id, int order_number, String name, double price) {
        this.customer_id = customer_id;
        this.order_number = order_number;
        this.name = name;
        this.price = price;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getOrder_number() {
        return order_number;
    }

    public void setOrder_number(int order_number) {
        this.order_number = order_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    
}
