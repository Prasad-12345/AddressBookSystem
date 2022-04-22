package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBook {
	//creating an array list
	ArrayList<Contacts> list1 = new ArrayList<Contacts>();
	
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
	
	//editContact method to edit contact details
	public void editContact() {
		System.out.println("Enter first name");
		String firstName = sc.next();
		
		if (firstName.equalsIgnoreCase(contact.getFirstName())) {
			System.out.println("Choose the attribute you want to change :");
			System.out.println("1.last name\n2.phone number\n3.email\n4.city\n5.stste\n6.zipcode\n7.address");
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1:
					System.out.println("Enter correct last name :");
					String lastName = sc.next();
					contact.setLastName(lastName);
					break;
					
				case 2:
					System.out.println("Enter correct phone number");
					Long phoneNumber = sc.nextLong();
					contact.setPhoneNumber(phoneNumber);
					break;
					
				case 3:
					System.out.println("Enter correct email :");
					String email = sc.next();
					contact.setEmail(email);
					break;
					
				case 4: 
					System.out.println("Enter correct city :");
					String city = sc.next();
					contact.setLastName(city);
					break;
					
				case 5:
					System.out.println("Enter correct state :");
					String state = sc.next();
					contact.setState(state);
					break;
					
				case 6:
					System.out.println("Enter correct zip code :");
					long zipCode = sc.nextLong();
					contact.setZipCode(zipCode);
					break;
					
				case 7:
					System.out.println("Enter correct address :");
					String address = sc.next();
					contact.setAddress(address);
					break;
				}
		}
	}
	
	//delete contact method to delete contact details
	public void deleteContact() {
		System.out.println("Enter the first name of person to be deleted");
		System.out.println("Enter first name");
		String firstName = sc.next();
		
		Iterator iterator = list1.iterator();
		while(iterator.hasNext()) {
			if (firstName.equalsIgnoreCase(contact.getFirstName())) {
				list1.remove(contact);
				System.out.println("contact deleted successfully");
			}
		}
	}
	
	//display method to display contact details
	public void display() {
		Iterator<Contacts> iterator = list1.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
