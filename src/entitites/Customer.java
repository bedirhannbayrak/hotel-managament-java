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
public class Customer {
    private String id;


    private String name;
    private String mobileNumber;
    private String nationality;
    private String NationalID;
    private String address;
    private String checkInDate;
    private String reserveDate;
    private String gender;
    private String email;
    private String roomNo;
    private String roomType;
    private String bedType;
    private String roomPrice;

    public String getRoomType() {
        return roomType;
    }

    public String getBedType() {
        return bedType;
    }

    public String getRoomPrice() {
        return roomPrice;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public void setRoomPrice(String roomPrice) {
        this.roomPrice = roomPrice;
    }

  

    public Customer() {
    }

    public Customer(String name, String mobileNumber, String nationality, String NationalID, String address, String checkInDate, String reserveDate, String gender, String email) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.nationality = nationality;
        this.NationalID = NationalID;
        this.address = address;
        this.checkInDate = checkInDate;
        this.reserveDate = reserveDate;
        this.gender = gender;
        this.email = email;
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    
    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNationalID() {
        return NationalID;
    }

    public void setNationalID(String NationalID) {
        this.NationalID = NationalID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getReserveDate() {
        return reserveDate;
    }

    public void setReserveDate(String reserveDate) {
        this.reserveDate = reserveDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", mobileNumber=" + mobileNumber + ", nationality=" + nationality + ", NationalID=" + NationalID + ", address=" + address + ", checkInDate=" + checkInDate + ", reserveDate=" + reserveDate + ", gender=" + gender + ", email=" + email + '}';
    }
    
    
}
