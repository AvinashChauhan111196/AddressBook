package com.address;

public class Address {

    String firstName;
    String lastName;
    String city;
    String address;
    String email;
    String mobile;
    int zip;
    Address(String firstName, String lastName, String city, String address, String email, String mobile, int zip)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.city=city;
        this.address=address;
        this.email=email;
        this.mobile=mobile;
        this.zip=zip;
    }
    public void setFirstName(String  firstName)
    {
        this.firstName=firstName;
    }
    public void setLastName(String  lastName)
    {
        this.lastName=lastName;
    }
    public void setAddress(String address)
    {
        this.address=address;
    }
    public void setCity(String city)
    {
        this.city=city;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
    public  void  setMobile(String mobile)
    {
        this.mobile=mobile;
    }
    public void  setZip(int zip)
    {
        this.zip=zip;
    }
}
