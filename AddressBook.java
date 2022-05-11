package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
/*
 * Author: Prasad
 * Ability to get number of contact persons i.e. count by City or State
 */
public class AddressBook {
	//creating hash map
	public Map<String, Contacts> contactList = new HashMap<String, Contacts>();
	public static HashMap<String, ArrayList<Contacts>> city = new HashMap<String, ArrayList<Contacts>>();
	public static HashMap<String, ArrayList<Contacts>> state = new HashMap<String, ArrayList<Contacts>>();
	
	//object 
	
	Scanner sc = new Scanner(System.in);
	boolean isPresent = false;
	
	public String addressBookName;
	
	//Getter and setter method for address book
	public String getAddressBookName() {
		return addressBookName;
	}

	public void setAddressBookName(String addressBookName) {
		this.addressBookName = addressBookName;
	}
	
	public ArrayList<Contacts> getContact(){
		return new ArrayList<Contacts>(contactList.values());
	}

	//input contact details and adding it to the array list
	public void addContact() {
		Contacts contact = new Contacts();
		System.out.println("Enter first name :");
		String firstName = sc.next();
	
		//To check each name in address book is unique
		contactList.entrySet().stream().forEach(new Consumer<Entry<String, Contacts>>(){

			@Override
			public void accept(Entry<String, Contacts> entry) {
				if(entry.getKey().equals(firstName.toLowerCase())) {
					System.out.println("Contact already exists");
					isPresent = true;
				}
			}
		});
		
		if(isPresent) {
			System.out.println("First name already exists please enter unique name");
		}
		
		else  {
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
            contact.setPhoneNumber(phoneNumber);
            contact.setEmail(email);
            contact.setCity(city);
            contact.setState(state);
            contact.setZipCode(zipCode);
            contact.setAddress(address);
            addPersonToCity(contact);
            addPersonToState(contact);
		
			contactList.put(firstName.toLowerCase(), contact);
			}
		}
	
	//editContact method to edit contact details
	public void editContact() {
	   //    Contacts person = new Contact();
			Contacts contact = new Contacts();
	        System.out.println("Enter first name : ");
	        String firstName = sc.next();
	        if (contactList.containsKey(firstName)) {
	            contact = contactList.get(firstName);
	            System.out.println("Choose you want to change : ");
	            System.out.println("1.First Name\n2.Last Name\n3.Phone Number\n4.Email\n5.City\n6.State\n7.ZipCode");
	            switch (sc.nextInt()) {
	            	case 1:
		            	System.out.println("Enter the correct First Name :");
	                    String newFirstName = sc.next();
	                    contact.setFirstName(newFirstName);
	                    break;
	                case 2:
	                    System.out.println("Enter the correct Last Name :");
	                    String lastName = sc.next();
	                    contact.setLastName(lastName);
	                    break;
	                case 3:
	                    System.out.println("Enter the correct Phone Number :");
	                    long phoneNumber = sc.nextLong();
	                    contact.setPhoneNumber(phoneNumber);
	                    break;
	                case 4:
	                    System.out.println("Enter the correct Email Address :");
	                    String email = sc.next();
	                    contact.setEmail(email);
	                    break;
	                case 5:
	                    System.out.println("Enter the correct City :");
	                    String city = sc.next();
	                    contact.setCity(city);
	                    break;
	                case 6:
	                    System.out.println("Enter the correct State :");
	                    String state = sc.next();
	                    contact.setState(state);
	                    break;
	                case 7:
	                    System.out.println("Enter the correct ZipCode :");
	                    long zip = sc.nextLong();
	                    contact.setZipCode(zip);
	                    break;
	            }

	        } else {
	            System.out.println(" Name does not exist.");
	        }
	}
	
	//deleteContact method to delete contact details
	public void deleteContact() {
		System.out.println("Enter original first name");
		String firstName = sc.next();
		if(contactList.containsKey(firstName)) {
			contactList.remove(firstName);
			System.out.println("Contact deleted successfully");
		}
		else {
			System.out.println("Contact not found");
		}

	}
	
	//display method to display contact details
	public void display() {
		System.out.println("Contents of address book: " + this.getAddressBookName());
		for(String eachContact : contactList.keySet()) {
			Contacts contacts = contactList.get(eachContact);
			System.out.println(contacts);
		}
	}
	
	//taking input from user to perform a specific task
	public void getMenu(AddressBook addressBook) {
		System.out.println("Menu of address book");
		boolean check = false;
		do{
			System.out.println("Enter your choice\n1.Add Contact\n2.Edit Contact\n3.Delete Contact\n4.Display\n5.Exit");
			int option = sc.nextInt();
			switch(option){
				case 1 : addContact();
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
	
	//adding contact according to states
	public void addPersonToState(Contacts contact) {
		if(state.containsKey(contact.getState())) {
			state.get(contact.getState()).add(contact);
		}
		else {
			ArrayList<Contacts> stateList = new ArrayList<Contacts>();
			stateList.add(contact);
			state.put(contact.getState(), stateList);
		}
	}
	
	//adding contact according to city
	public void addPersonToCity(Contacts contact) {
		if(city.containsKey(contact.getCity())) {
			city.get(contact.getCity()).add(contact);
		}
		else {
			ArrayList<Contacts> cityList = new ArrayList<Contacts>();
			cityList.add(contact);
			city.put(contact.getCity(), cityList);
		}
	}
}

