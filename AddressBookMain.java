package com.bridgelabz.addressbook;

import java.util.Scanner;

/*
 * Author: Prasad
 * Ability to edit existing contact personusing their name 
 */

public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		
		AddressBook addressBook = new AddressBook();
		addressBook.addContact(addressBook.contact);
		addressBook.display();
		
		System.out.println("Do you want to edit contacts");
		System.out.println("Enter yes to edit");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		if(input.equals("yes") || input.equals("Yes")) {
			addressBook.editContact();
			addressBook.display();
		}
		else {
			System.out.println("Thank You");
		}
	}
}