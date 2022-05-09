package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
 * Author: Prasad
 * Refactor to add multiple address book to the system
 */
public class AddressBookOperation {
	static Map<String, AddressBook> myHashMap = new HashMap<>();
	
	//AddressBookOperation addressBookOperation = new AddressBookOperation();

    public static Map<String, AddressBook> getAddressBookMap() {
        return myHashMap;
    }

    public static void setAddressBookMap(Map<String, AddressBook> myHashMap) {
        AddressBookOperation.myHashMap = myHashMap;
    }
	Scanner sc = new Scanner(System.in);
	
	public void operations() {
		//operations according to user choice
		boolean check = true;
		do {
			System.out.println("Enter your choice");
			System.out.println("1.Add Address Book\n2.Display Address Book\n3.Edit address book\n4.Delete address book\n5.Exit");
			int choice = sc.nextInt();
			switch(choice) {
				case 1:
					addAddressBook();
					break;
				
				case 2:
					displayAddressBook();
					break;
				
				case 3:
					editAddressBook();
					break;
				
				case 4:
					deleteAddressBook();
					break;
					
				case 5: 
					check = false;
					break;
				}
			}
			while(check);
		}
	
	public void editAddressBook() {
		System.out.println("Enter the name of address book you want to edit");
		String editAddressBookName = sc.next();
		if(myHashMap.containsKey(editAddressBookName)) {
			myHashMap.get(editAddressBookName).getMenu(myHashMap.get(editAddressBookName));
		}
		else {
			System.out.println("Entered address book name is invalid");
		}
	}

	/*
	 * Method to add multiple address book
	 */
	public void addAddressBook() {		
		System.out.println("Enter the name of address book");
	    String addressBookName = sc.next();
	    if(myHashMap.containsKey(addressBookName)) {
	    	System.out.println("AddressBook name exists, Please enter unique name");
	    }
	    else {
	    	AddressBook addressBook = new AddressBook();
	    	myHashMap.put(addressBookName, addressBook);
	    }
	//	addressBook.getMenu();
	}
	
	/*
	 * method to display address book
	 */
	public void displayAddressBook() {
		for(String key : myHashMap.keySet()) {
			System.out.println(key);
		}
	}
	
	/*
	 * Method to delete address book
	 */
	public void deleteAddressBook() {
		System.out.println("Enter the name of address book you want to delete");
		Scanner sc = new Scanner(System.in);
		String adressBookToDelete = sc.next();
		if(myHashMap.containsKey(adressBookToDelete)) {
			myHashMap.remove(adressBookToDelete);
			System.out.println("Address Book removed successfully");
		}
		else {
			System.out.println("Enter correct address book name");
		}
	}
}