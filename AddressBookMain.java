package com.bridgelabz.addressbook;
/*
 * Author: Prasad
 * Ability to add new contact to Address Book 
 */
public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		
		AddressBook addressBook = new AddressBook();
		addressBook.addContact(addressBook.contact);
		addressBook.display();
	}
}