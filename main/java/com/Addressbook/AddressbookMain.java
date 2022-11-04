package com.Addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public  class AddressbookMain {
    static Scanner scanner = new Scanner(System.in);
    ArrayList<Contact> person;

    // constructor
    public AddressbookMain() {
        person = new ArrayList<Contact>();
    }

    // add new person record to array list after taking input

    public void addPerson() {
        System.out.println("Enter the First Name");
        String firstname2 = scanner.next();
        System.out.println("Enter the Last Name");
        String lastname2 = scanner.next();
        System.out.println("Enter the Address");
        String address2 = scanner.next();
        System.out.println("Enter the City");
        String cityname2 = scanner.next();
        System.out.println("Enter the Zip");
        String zip2 = scanner.next();
        System.out.println("Enter the PhoneNumber");
        String phoneNumber2 = scanner.next();
        System.out.println("Enter the Email");
        String email2 = scanner.next();
        // creating constructor
        Contact contacts = new Contact();

        // add the above list to  Contacts array list
        //Person.add(contacts);

        // printing contacts object data inside
        System.out.println(contacts);

    }// end of add person method

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program in AddressBookMain class");

        AddressbookMain ab = new AddressbookMain();
        ab.addPerson();

    }
}