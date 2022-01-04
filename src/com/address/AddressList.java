package com.address;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressList {

    public static void main(String args[]) {
        System.out.println("Welcome to Address Book");
        Scanner sc = new Scanner(System.in);
        ArrayList<Address> list = new ArrayList<>();
        String lastName, address, email, city, mobile, firstName, search;
        int zip;
        int choice = sc.nextInt();
        do {
            System.out.println(" 1 - Add Contacts");
            System.out.println(" 2 - Edit Contacts");
            System.out.println(" 3 - Delete");
            System.out.println(" 4 - Display");
            System.out.println(" 5 - Exit");
            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.println("Enter the FirstName");
                    firstName = sc.nextLine();
                    System.out.println("Enter the LastName");
                    lastName = sc.nextLine();
                    System.out.println("Enter the Address");
                    address = sc.nextLine();
                    System.out.println("Enter the City");
                    city = sc.nextLine();
                    System.out.println("Enter the Email");
                    email = sc.nextLine();
                    System.out.println("Enter the Mobile");
                    mobile = sc.nextLine();
                    System.out.println("Enter the Pincode");
                    zip = sc.nextInt();
                    Address a1 = new Address(firstName, lastName, city, address, email, mobile, zip);
                    list.add(a1);
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Enter field you want to edit");
                    search = sc.nextLine();
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).firstName.equals(search)) {
                            System.out.println("done");
                        }
                    }
                    break;
            }

        }while (choice != 5);

    }
}
