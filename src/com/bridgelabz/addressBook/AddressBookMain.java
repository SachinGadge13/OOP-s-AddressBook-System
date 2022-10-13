package com.bridgelabz.addressBook;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book Program");
        AddressBookMain iterateObj = new AddressBookMain();
        iterateObj.iterateOps();
    }

    private void iterateOps() {
        AddressBook contactInfo = new AddressBook();
        contactInfo.setUpInfo();
        contactInfo.displayListItems();
        int i;
        int j = 0;
        for (i = 1; i > j; i++) {
            System.out.println("Press 1 to continue adding contacts/Press 2 to edit a contact/Press 3 to delete a contact/Press 0 to exit the program");
            Scanner in = new Scanner(System.in);
            int operation = in.nextInt();
            if (operation == 1) {
                contactInfo.setUpInfo();
                contactInfo.displayListItems();
            } else if (operation == 2) {
                contactInfo.editContact();
                contactInfo.displayListItems();
            } else if (operation == 0) {
                j = i + 2;
            } else if (operation == 3) {
                contactInfo.deleteContact();
            }
        }
    }
}