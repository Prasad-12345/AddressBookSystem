package com.bridgelabz.addressbook;
/*
 * Author: Prasad
 * Ability to add new contact to Address Book 
 */
public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		
		//Object
		AddressBook addressBook = new AddressBook();
		addressBook.addContact(addressBook.contact); //calling add contact method
		addressBook.display(); //calling display method
	}
}
