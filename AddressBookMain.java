package com.bridgelabz.addressbook;

import java.util.Scanner;

/*
 * Author: Prasad
 * Ability to delete a person using persons name
 */
public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		
		//object
		AddressBook addressBook = new AddressBook();
		//calling add contact method
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
		
		System.out.println("Do you want to delete contacts");
		System.out.println("Enter yes to delete");
		input = sc.next();
		
		if(input.equals("yes") || input.equals("Yes")) {
			//calling delete contact method
			addressBook.deleteContact();
			addressBook.display();
		}
		else {
			System.out.println("Thank You");
		}
	}
}
