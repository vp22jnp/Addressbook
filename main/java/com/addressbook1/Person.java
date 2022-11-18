package com.addressbook1;

public class Person {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zip;
    private long phoneNumber;
    private String email;

    /**
     * Create a method For Person and passing the Parameters
     */

    Person(String firstName, String lastName, String address, String city, String state, int zip, long phoneNumber,
           String email) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        ;
        this.setAddress(address);
        this.setCity(city);
        this.setState(state);
        this.setZip(zip);
        this.setPhoneNumber(phoneNumber);
        this.setEmail(email);
    }

    /**
     * Create a getter and setter method firstName
     */

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Create a getter and setter method LastName
     */

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Create a getter and setter method Address
     */

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Create a getter and setter method City
     */

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Create a getter and setter method State
     */

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * Create a getter and setter method ZipCode
     */

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    /**
     * Create a getter and setter method PhoneNumber
     */

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Create a getter and setter method Email
     */

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    Person() {

    }

    /**
     * Create a Method for Person and passing Parameter of the person Details
     */
    public Person(String firstName2, String lastName2, String address2, String city2, String state2, String email2,
                  int zip2, long phoneNumber2) {
        this.firstName = firstName2;
        this.lastName = lastName2;
        this.address = address2;
        this.city = city2;
        this.state = state2;
        this.zip = zip2;
        this.phoneNumber = phoneNumber2;
        this.email = email2;

    }

    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
                + ", state=" + state + ", zip=" + zip + ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
    }
}

