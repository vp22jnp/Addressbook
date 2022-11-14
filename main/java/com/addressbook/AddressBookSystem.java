package com.addressbook;

public class AddressBookSystem {
    public String firstname;
    public String lastname;
    public String address;
    public String cityname;
    public double zip;
    public double phonenumber;
    public String email;

    @Override
    public String toString() {
        return "AddressBookSystem{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                ", cityname='" + cityname + '\'' +
                ", zip=" + zip +
                ", phonenumber=" + phonenumber +
                ", email='" + email + '\'' +
                '}';
    }

    public AddressBookSystem(String firstname, String lastname, String address, String cityname, double zip, double phonenumber, String email){
        this.firstname=firstname;
        this.lastname=lastname;
        this.address=address;
        this.cityname=cityname;
        this.zip=zip;
        this.phonenumber=phonenumber;
        this.email=email;
    }

    }

