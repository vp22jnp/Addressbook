package com.Addressbook;

public class AddressBook {
    public static void main(String[] args) {
        Contact c=new Contact();
        c.setFirstname("vaibhav");
        c.setLastname("pathak");
        c.setAddress("pune");
        c.setCityname("pune");
        c.setZip(222170);
        c.setPhonenumber(805243333);
        c.setEmail("vp22jnp@gmail.com");
        System.out.println("name="+c.getFirstname()+" "+"lastname="+c.getLastname()+" "+"address="+c.getAddress()+" "+"cityname="+c.getCityname()+" "+"phonenumber="+c.getPhonenumber()+
                "zip="+c.getZip()+" "+"email="+c.getEmail());
    }
}

