package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
/*
 * Author: Prasad
 * Ability to add multiple contacts to address book
 */
public class AddressBook {
	//creating an array list
	ArrayList<Contacts> list1 = new ArrayList<Contacts>();
	
	//object 
	Contacts contact = new Contacts(null, null, null, 0, null, null, 0, null);
	Scanner sc = new Scanner(System.in);
	
	//input contact details and adding it to the array list
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
		
		list1.add(new Contacts(firstName, lastName, email, phoneNumber, city, state, zipCode, address));
	}
	
	//editContact method to edit contact details
	public void editContact() {
		if(list1.isEmpty()) {
			System.out.println("There is no contact");
		}
		else {
			System.out.println("Enter first name");
			String originalName = sc.next();
			for(int i = 0; i < list1.size(); i++) {
				String name = list1.get(i).getFirstName();
		
				if (originalName.equalsIgnoreCase(name)) {
					System.out.println("Enter correct first name :");
					String firstName = sc.next();
					
					System.out.println("Enter correct last name :");
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
					
					list1.get(i).setFirstName(firstName);
					list1.get(i).setLastName(lastName);
					list1.get(i).setEmail(email);
					list1.get(i).setPhoneNumber(phoneNumber);
					list1.get(i).setCity(city);
					list1.get(i).setState(state);
					list1.get(i).setZipCode(zipCode);
					list1.get(i).setAddress(address);
					}
				}
			}
		}
	
	//deleteContact method to delete contact details
	public void deleteContact() {
		System.out.println("Enter original first name");
		String deleteName = sc.next();
		if(list1.isEmpty()) {
			System.out.println("There is no contact");
		}
		else {
			for(int i = 0; i < list1.size(); i++) {
				String name = list1.get(i).getFirstName();
					if (deleteName.equalsIgnoreCase(name)) {
						list1.remove(i);
						System.out.println("Contact removed successfully");
					}			
			}
		}
	}
	
	//display method to display contact details
	public void display() {
		if(list1.isEmpty()) {
			System.out.println("There is no contact");
		}
		else {
			for(int i = 0; i < list1.size(); i++) {
				System.out.println(list1.get(i));
			}
		}
	}
	
	//taking input from user to perform a specific task
	public void getMenu() {
		System.out.println("Menu of address book");
		boolean check = false;
		do{
			System.out.println("Enter your choice\n1.Add Contact\n2.Edit Contact\n3.Delete Contact\n4.Display\n5.Exit");
			int option = sc.nextInt();
			switch(option){
				case 1 : addContact(contact);
					break;
					
				case 2 : editContact();
				    break;
				    
				case 3 : deleteContact();
					break;
				
				case 4: display();
					break;
					
				case 5 : check = true;
					break;
				
				default :
					System.out.println("Please choose valid option");
			}
		}
		while(!check);
	}
}
