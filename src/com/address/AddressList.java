package com.address;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class AddressList {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        Scanner sc=new Scanner(System.in);
        ArrayList<Address> list=new ArrayList<>();
        int choice,zip,editField;
        int status;
        String lastName,address,email,city,mobile,firstName,search,fullName;
        do {
            System.out.println(" 1 - Add Contacts");
            System.out.println(" 2 - Edit Contacts");
            System.out.println(" 3 - Delete");
            System.out.println(" 4 - Exit");
            choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                    sc.nextLine();
                    System.out.println("Enter the FirstName");
                    firstName=sc.nextLine();
                    System.out.println("Enter the LastName");
                    lastName=sc.nextLine();
                    System.out.println("Enter the Address");
                    address=sc.nextLine();
                    System.out.println("Enter the City");
                    city=sc.nextLine();
                    System.out.println("Enter the Email");
                    email=sc.nextLine();
                    System.out.println("Enter the Mobile");
                    mobile=sc.nextLine();
                    System.out.println("Enter the Zip");
                    zip=sc.nextInt();
                    Address a1=new Address(firstName,lastName,city,address,email,mobile,zip);
                    list.add(a1);
                    System.out.println(" List size "+list.size());
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Enter first name to edit");
                    search=sc.nextLine();
                    for(int i=0;i< list.size();i++)
                    {
                        if (list.get(i).firstName.equals(search))
                        {
                            System.out.println(" Which fields want to be edit ");
                            System.out.println("1 First Name");
                            System.out.println("2 Last Name");
                            System.out.println("3 Address");
                            System.out.println("4 City");
                            System.out.println("5 Email");
                            System.out.println("6 Mobile");
                            System.out.println("7 Zip");
                            editField=sc.nextInt();
                            switch (editField)
                            {
                                case 1:
                                    sc.nextLine();
                                    System.out.println("Enter the FirstName");
                                    firstName=sc.nextLine();
                                    list.get(i).setFirstName(firstName);
                                    System.out.println("Updated first name "+firstName);
                                    break;

                                case 2:
                                    sc.nextLine();
                                    System.out.println("Enter the lastName");
                                    lastName=sc.nextLine();
                                    list.get(i).setLastName(lastName);
                                    System.out.println("Updated last name "+lastName);
                                    break;
                                case 3:
                                    sc.nextLine();
                                    System.out.println("Enter the Address");
                                    address=sc.nextLine();
                                    list.get(i).setAddress(address);
                                    System.out.println("Updated address "+address);
                                    break;
                                case 4:
                                    sc.nextLine();
                                    System.out.println("Enter the City");
                                    city=sc.nextLine();
                                    list.get(i).setCity(city);
                                    System.out.println("Updated city "+city);
                                    break;
                                case 5:
                                    sc.nextLine();
                                    System.out.println("Enter the Email");
                                    email=sc.nextLine();
                                    list.get(i).setEmail(email);
                                    System.out.println("Updated email "+email);
                                    break;
                                case 6:
                                    sc.nextLine();
                                    System.out.println("Enter the Mobile");
                                    mobile=sc.nextLine();
                                    list.get(i).setMobile(mobile);
                                    System.out.println("Updated mobile "+mobile);
                                    break;
                                case 7:
                                    sc.nextLine();
                                    System.out.println("Enter the zip");
                                    zip=sc.nextInt();
                                    list.get(i).setZip(zip);
                                    System.out.println("Update zip "+zip);
                            }
                        }
                    }
                    break;
                case 3:
                    status=0;
                    sc.nextLine();
                    System.out.println("Enter name to be deleted ");
                    search=sc.nextLine();
                    for(int i=0;i< list.size();i++)
                    {

                        firstName=list.get(i).firstName;
                        if(Objects.equals(firstName, search))
                        {
                            status=1;
                            list.remove(i);

                        }
                    }
                    if(status==0)
                    {
                        System.out.println("Not found ");
                    }
                    break;

                case 4:
                    for(int i=0;i<list.size();i++)
                    {
                        System.out.println("First Name " + list.get(i).firstName);
                        System.out.println("Last Name " + list.get(i).lastName);
                        System.out.println("Address " + list.get(i).address);
                        System.out.println("City " + list.get(i).city);
                        System.out.println("Email " + list.get(i).email);
                        System.out.println("Mobile " + list.get(i).mobile);
                        System.out.println("Zip " + list.get(i).zip);
                    }
                    if(list.isEmpty())
                    {
                        System.out.println("The list is empty ");
                    }
                    break;

            }
        }while(choice!=4);
    }
}
