package com.addressbook;

import com.payroll.EmployeePayrollSData;
import com.payroll.EmployeePayrollService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Addressbook {
private List<AddressBookSystem> addressbooklist;
//public void AddressBook(){}
    public Addressbook(List<AddressBookSystem>addressbooklist) {
        this.addressbooklist = addressbooklist;
    }
    private void writeAddressbookdata(){
        System.out.println("\nWriting address book data console\n"+addressbooklist);
    }
    private void readAddressbookdata(Scanner consoleInputReader) {
        System.out.println("enter first name");
        String firstname=consoleInputReader.next();
        System.out.println("enter last name");
        String lastname=consoleInputReader.next();
        System.out.println("enter address");
        String address=consoleInputReader.next();
        System.out.println("enter city name");
        String cityname=consoleInputReader.next();
        System.out.println("enter zipcode");
        double zip=consoleInputReader.nextDouble();
        System.out.println("enter phone number");
        double phonenumber=consoleInputReader.nextDouble();
        System.out.println("enter Email");
        String email=consoleInputReader.next();
        addressbooklist.add(new AddressBookSystem(firstname,lastname,address,cityname,zip,phonenumber,email));

    }
    public static void main(String[] args) {
        ArrayList<AddressBookSystem> addressbooklist=new ArrayList<>();
        Addressbook addressbook=new Addressbook( addressbooklist);
        Scanner consoleInputReader=new Scanner(System.in);
        addressbook.readAddressbookdata(consoleInputReader);
        addressbook. writeAddressbookdata();
    }

    }





