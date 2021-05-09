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
public class Room {
    private int roomNo;
    private String roomType;
    private String bed;
    double price;
    String status;

    public Room() {
        
    }
    
    

    public Room(int roomNo, String roomType, String bed, double price, String status) {
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.bed = bed;
        this.price = price;
        this.status = status;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
            
    
}
