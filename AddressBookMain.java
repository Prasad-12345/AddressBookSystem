package com.bridgelabz.addressbook;

import java.util.Scanner;

/*
 * Author: Prasad
 * Ability to search Person in a City or State across the multiple AddressBook
 */
public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		//object
		AddressBookMain addressBookMain = new AddressBookMain();
		addressBookMain.operations();
	}

	/*
	 * This method contains all address book operation    
	 */
	public void operations() {
		AddressBookOperation addressBookOperation = new AddressBookOperation();
		Scanner sc = new Scanner(System.in);
		//operations according to user choice
		boolean check = true;
		do {
			System.out.println("Enter your choice");
			System.out.println("1.Add Address Book\n2.Display Address Book\n3.Edit address book\n4.Delete address book\n5.Search person\n6.Exit");
			int choice = sc.nextInt();
			switch(choice) {
				case 1:
					addressBookOperation.addAddressBook();
					break;
					
				case 2:
					addressBookOperation.displayAddressBook();
					break;
					
				case 3:
					addressBookOperation.editAddressBook();
					break;
					
				case 4:
					addressBookOperation.deleteAddressBook();
					break;
						
				case 5:
					System.out.println("Enter \n1.Search By City\n2.Search By State");
					int searchChoice = sc.nextInt();
					if(searchChoice==1)
						addressBookOperation.searchByCity();
					else 
						addressBookOperation.searchByState();
						break;
						
				case 6: 
					check = false;
					break;
					}
				}
				while(check);
			}
	}
