package com.bridgelabz.addressBook;


import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book Program");
        Scanner in = new Scanner(System.in);
        AddressBook contactInfo = new AddressBook();
        contactInfo.setUpInfo();
        contactInfo.displayListItems();
        int i;
        int j = 0;
        for (i = 1; i > j; i++) {
            System.out.println("Press 1 to continue creating Address Book/Press 2 to edit a contact in an Address Book/Press 3 to delete a contact from an Address Book/Press 4 to Add a New Contact to an Address Book/Press 0 to exit the program");
            int operation = in.nextInt();
            if (operation == 1) {
                contactInfo.setUpInfo();
                contactInfo.displayListItems();
            } else if (operation == 2) {
                contactInfo.editContact();

            } else if (operation == 0) {
                j = i + 2;
            } else if (operation == 3) {
                contactInfo.deleteContact();
            } else if (operation == 4) {
                contactInfo.add();
            }
        }
    }
}