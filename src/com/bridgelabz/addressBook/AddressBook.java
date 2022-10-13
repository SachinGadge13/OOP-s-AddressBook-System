package com.bridgelabz.addressBook;

import java.util.*;

public class AddressBook {

    private final Map<String, List<Contacts>> map = new LinkedHashMap<>();
    private final Scanner in = new Scanner(System.in);

    public void setUpInfo() {

        System.out.println("How many Address Book you want to create");
        int bookCount = in.nextInt();
        for (int b = 1; b <= bookCount; b++) {
            System.out.println("Name an Address Book");
            String bookName = in.next();
            map.put(bookName, new LinkedList<>());
            System.out.println("How many contacts you want to create");
            int contactCount = in.nextInt();
            for (int i = 1; i <= contactCount; i++) {
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
                map.get(bookName).add(contact);
            }
        }
    }

    public void displayListItems() {
        int i = 0;
        for (String key : map.keySet()) {
            i++;
            System.out.println("Address Book #" + i + ": " + key);
            for (Contacts info : map.get(key)) {
                System.out.println(info.getFirstName() + info.getLastName() + "  " + info.getAddress() + "  " + info.getCity() + "  " + info.getState() + "  " + info.getZip() + "  " + info.getPhoneNo() + "  " + info.getEmail());
            }
            System.out.println();
        }
    }

    public void editContact() {
        int i = 0;
        while (i < 3) {
            boolean isPresent = false;
            System.out.println("Enter the name of the Address Book from which contact is to be edited");
            String name = in.next();
            if (map.containsKey(name)) {
                System.out.println("Enter the first name of the contact to be edited");
                String newName = in.next();
                for (Contacts info : map.get(name)) {
                    if (Objects.equals(info.getFirstName(), newName)) {
                        System.out.println(info.getFirstName() + info.getLastName() + "  " + info.getAddress() + "  " + info.getCity() + "  " + info.getState() + "  " + info.getZip() + "  " + info.getPhoneNo() + "  " + info.getEmail());
                        System.out.println("Enter the First Name:");
                        String firstname = in.next();
                        info.setFirstName(firstname);
                        System.out.println("Enter the Last Name:");
                        String lastname = in.next();
                        info.setLastName(lastname);
                        System.out.println("Enter the Address in words:");
                        String address = in.next();
                        info.setAddress(address);
                        System.out.println("Enter the City:");
                        String city = in.next();
                        info.setCity(city);
                        System.out.println("Enter the State Name:");
                        String state = in.next();
                        info.setState(state);
                        System.out.println("Enter the ZIP code:");
                        int zip = in.nextInt();
                        info.setZip(zip);
                        System.out.println("Enter the Phone No");
                        long phone = in.nextLong();
                        info.setPhoneNo(phone);
                        System.out.println("Enter email id:");
                        String email = in.next();
                        info.setEmail(email);
                        // list.set(index, new Contacts(firstname, lastname, address, city, state, zip, phone, email));
                        i = 3;
                        isPresent = true;
                        break;
                    }
                }
                if (!isPresent) {
                    System.out.println("No Such Name found, please re-enter the Name");
                    i++;
                }
            } else {
                System.out.println("No Such Address Book found");
                i++;
            }
        }
        displayListItems();
    }

    public void deleteContact() {
        int i = 0;
        while (i < 3) {
            boolean isPresent = false;
            System.out.println("Enter the name of the Address Book from which contact is to be deleted");
            String name = in.next();
            if (map.containsKey(name)) {
                System.out.println("Enter the first name of the contact to be edited");
                String newName = in.next();
                for (Contacts info : map.get(name)) {
                    if (Objects.equals(info.getFirstName(), newName)) {
                        System.out.println(info.getFirstName() + info.getLastName() + "  " + info.getAddress() + "  " + info.getCity() + "  " + info.getState() + "  " + info.getZip() + "  " + info.getPhoneNo() + "  " + info.getEmail());
                        map.get(name).remove(info);
                        isPresent = true;
                        i = 3;
                        break;
                    }
                }
                if (!isPresent) {
                    System.out.println("No Such value found");
                    i++;
                }
            } else {
                System.out.println("No Such Address Book");
                i++;
            }
        }
        displayListItems();
    }

    public void add() {
        int j = 0;
        while (j < 3) {
            boolean isPresent = false;
            System.out.println("Enter the AddressBook Name to which Contact is to be added");
            String accountName = in.next();
            if (map.containsKey(accountName)) {
                System.out.println("Enter the first name of the Contact to be added to AddressBook");
                String name = in.next();
                for (Contacts info : map.get(accountName)) {
                    if (Objects.equals(info.getFirstName(), name)) {
                        System.out.println();
                        System.out.println(info.getFirstName() + info.getLastName() + "  " + info.getAddress() + "  " + info.getCity() + "  " + info.getState() + "  " + info.getZip() + "  " + info.getPhoneNo() + "  " + info.getEmail());
                        System.out.println("Contact already exists in Account, please use option 2");
                        j = 3;
                        isPresent = true;
                        break;
                    }
                }
                if (!isPresent) {
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
                    Contacts contact = new Contacts(name, lastname, address, city, state, zip, phone, email);
                    map.get(accountName).add(contact);
                    j = 3;
                }
            } else {
                System.out.println();
                System.out.println("No Such Address Book");
            }
        }
        displayListItems();
    }

}