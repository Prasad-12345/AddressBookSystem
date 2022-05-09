package com.bridgelabz.addressbook;

import java.util.Scanner;

/*
 * Author: Prasad
 * Ability to ensure there is no Duplicate Entry of the same Person in a particular Address Book
 */
public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		//object
		AddressBookOperation addressBookOperation = new AddressBookOperation();
		addressBookOperation.operations();	
	}
}