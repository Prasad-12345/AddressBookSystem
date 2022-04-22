package com.bridgelabz.addressbook;

import java.util.Scanner;

/*
 * Author: Prasad
 * Ability to edit existing contact person using their name 
 */

public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		
		//object
		AddressBook addressBook = new AddressBook();
		//calling addContact method
		addressBook.addContact(addressBook.contact);
		//calling display method
		addressBook.display(); 
		
		System.out.println("Do you want to edit contacts");
		System.out.println("Enter yes to edit");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		if(input.equals("yes") || input.equals("Yes")) {
			//calling edit contact method
			addressBook.editContact();
			addressBook.display();
		}
		else {
			System.out.println("Thank You");
		}
	}
}
