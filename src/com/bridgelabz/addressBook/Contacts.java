package com.bridgelabz.addressBook;

import java.util.Comparator;

public class Contacts {

    public static Comparator<Contacts> ConNameComparator = (s1, s2) -> {
        String ContactName1 = s1.getFirstName().toUpperCase();
        String ContactName2 = s2.getFirstName().toUpperCase();
        return ContactName1.compareTo(ContactName2);
    };

    private final String firstName;
    private final String lastName;
    private final String address;
    private final String city;
    private final String state;
    private final int zip;
    private final long phoneNo;
    private final String email;

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