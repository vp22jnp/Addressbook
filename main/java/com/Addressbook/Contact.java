package com.Addressbook;

public class Contact {
    public String firstname;
    public String lastname;
    public String address;
    public String cityname;
    public double zip;
    public long phonenumber;
    public String email;



    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public double getZip() {
        return zip;
    }

    public void setZip(double zip) {
        this.zip = zip;
    }

    public double getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                ", cityname='" + cityname + '\'' +
                ", zip=" + zip +
                ", phonenumber=" + phonenumber +
                ", email='" + email + '\'' +
                '}';
    }

    public Contact (){
        this.firstname= this.firstname;
        this.lastname= this.lastname;
        this.address= this.address;
        this.cityname= this.cityname;
        this.zip= this.zip;
        this.phonenumber=phonenumber;
        this.email= this.email;
    }

}
