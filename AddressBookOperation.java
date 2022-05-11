package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
 * Author: Prasad
 * Ability to view Persons by City or State
 */
public class AddressBookOperation {
	static Map<String, AddressBook> myHashMap = new HashMap<>();
	
	AddressBook addressBook = new AddressBook();

    public static Map<String, AddressBook> getAddressBookMap() {
        return myHashMap;
    }

    public static void setAddressBookMap(Map<String, AddressBook> myHashMap) {
        AddressBookOperation.myHashMap = myHashMap;
    }
	Scanner sc = new Scanner(System.in);
	
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
	
	/*
	 * Searching person by city name
	 */
	public void searchByCity() {
		System.out.println("Enter the name of city where the person resides");
		String cityName = sc.next();
		System.out.println("Enter the name of person");
		String personName = sc.next();
		
		for(AddressBook addressBook : myHashMap.values()) {
			ArrayList<Contacts> contactList = addressBook.getContact();
			contactList.stream().filter(contact -> contact.getFirstName().equals(personName)
															&& contact.getCity().equals(cityName)).forEach(contact -> System.out.println(contact));
		}
	}
	
	/*
	 * Searching person by state name
	 */
	public void searchByState() {
		System.out.println("Enter the name of state where the person resides");
		String stateName = sc.next();
		System.out.println("Enter the name of person");
		String personName = sc.next();
		
		for(AddressBook addressBook : myHashMap.values()) {
			ArrayList<Contacts> contactList = addressBook.getContact();
			contactList.stream().filter(contact -> contact.getFirstName().equals(personName)
															&& contact.getState().equals(stateName)).forEach(contact -> System.out.println(contact));
		}
	}
	
	/*
	 * Displaying person by city or state
	 */
	public void displayPeopleByRegion(HashMap<String, ArrayList<Contacts>> listToDisplay) {

		System.out.println("Enter the name of the region :");
		String regionName = sc.next();

		listToDisplay.values().stream()
				.map(region -> region.stream()
						.filter(contact -> contact.getState().equals(regionName)
								|| contact.getCity().equals(regionName)))
				.forEach(contact -> contact.forEach(contactDetails -> System.out.println(contactDetails)));
	}
}