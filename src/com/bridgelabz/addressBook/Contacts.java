package com.bridgelabz.addressBook;


public class Contacts {


    private  String firstName;
    private  String lastName;
    private  String address;
    private  String city;
    private  String state;
    private  int zip;
    private  long phoneNo;
    private  String email;

    public Contacts(String myFirstName, String myLastName, String myAddress, String myCity, String myState, int myZip, long myPhoneNo, String myEmail) {
        firstName = myFirstName;
        lastName = myLastName;
        address = myAddress;
        city = myCity;
        state = myState;
        zip = myZip;
        phoneNo = myPhoneNo;
        email = myEmail;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZip() {
        return zip;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public String getEmail() {
        return email;
    }
}