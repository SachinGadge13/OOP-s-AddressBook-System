package com.bridgelabz.addressBook;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

    List<Contacts> list = new ArrayList<>();

    public void setUpInfo() {
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        System.out.println("How many contacts you want to create");
        int contactcount = in.nextInt();
        for (int i = 1; i <= contactcount; i++) {
            System.out.println("Enter the First Name:");
            String firstname = in.next();
            System.out.println("Enter the Last Name:");
            String lastname = in.next();
            System.out.println("Enter the Address in words:");
            String address = in.next();
            System.out.println("Enter the City:");
            String city = in.next();
            System.out.println("Enter the State Name:");
            String state = in.next();
            System.out.println("Enter the ZIP code:");
            int zip = in.nextInt();
            System.out.println("Enter the Phone No");
            long phone = in.nextLong();
            System.out.println("Enter email id:");
            String email = in.next();
            Contacts contact = new Contacts(firstname, lastname, address, city, state, zip, phone, email);
            list.add(contact);
        }
    }

    public void displayListItems() {
        for (Contacts someinfo : list) {
            System.out.println(someinfo.getFirstName() + "  " + someinfo.getLastName() + "  " + someinfo.getAddress() + "  " + someinfo.getCity() + "  " + someinfo.getState() + "  " + someinfo.getZip() + "  " + someinfo.getPhoneNo() + "  " + someinfo.getEmail());
        }

    }
}