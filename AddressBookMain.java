package com.bridgelabz.addressbook;

import java.util.Scanner;

/*
 * Author: Prasad
 * Ability to add multiple contacts to address book
 */
public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		
		//object
		AddressBook addressBook = new AddressBook();
		//calling getMenu method
		addressBook.getMenu();		
	}
}