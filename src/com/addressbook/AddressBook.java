package com.addressbook;

import java.util.Scanner;

public class AddressBook {


    public static void main(String[] args) {
        System.out.println("Welcome too Address Book");

        ContactDetails person = new ContactDetails();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the First Name");
        person.setFirstName(input.nextLine());
        System.out.println("Enter the Last Name");
        person.setLastName(input.nextLine());
        System.out.println("Enter the Address");
        person.setAddress(input.nextLine());
        System.out.println("Enter the City");
        person.setCity(input.nextLine());
        System.out.println("Enter the State");
        person.setState(input.nextLine());
        System.out.println("Enter the Zip Code");
        person.setZipCode(input.nextLine());
        System.out.println("Enter the Phone Number");
        person.setPhoneNumber(input.nextLine());
        System.out.println("Enter the Email");
        person.setEmail(input.nextLine());

        System.out.println(person.toString());
    }
}
