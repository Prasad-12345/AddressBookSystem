package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBook {
	//created an array list
	ArrayList list1 = new ArrayList<Contacts>();
	
	//object creation
	Contacts contact = new Contacts();
	Scanner sc = new Scanner(System.in);
	
	//input contact details
	public void addContact(Contacts contact) {
		System.out.println("Enter first name :");
		String firstName = sc.next();
		
		System.out.println("Enter last name :");
		String lastName = sc.next();
		
		System.out.println("Enter email :");
		String email = sc.next();
		
		System.out.println("Enter phone number :");
		long phoneNumber = sc.nextLong();
		
		System.out.println("Enter city :");
		String city = sc.next();
		
 		System.out.println("Enter state :");
		String state = sc.next();
		
		System.out.println("Enter zip code :");
		long zipCode = sc.nextLong();
		
		System.out.println("Enter address :");
		String address = sc.next();
		
		contact.setFirstName(firstName);
		contact.setLastName(lastName);
		contact.setEmail(email);
		contact.setPhoneNumber(phoneNumber);
		contact.setCity(city);
		contact.setState(state);
		contact.setZipCode(zipCode);
		contact.setAddress(address);
		list1.add(contact);
	}
	
	//display method to display contact
	public void display() {
		Iterator<Contacts> iterator = list1.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
