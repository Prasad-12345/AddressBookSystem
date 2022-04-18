package com.bridgelabz.addressbook;

public class Contacts {
	//variables
	private String firstName;
	private String lastName;
	private String email;
	private long phoneNumber;
	private String city;
	private String state;
	private long zipCode;
	private String address;
	
	//Getter and setter methods
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public long getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public long getZipCode() {
		return zipCode;
	}
	
	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Contacts [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phoneNumber="
				+ phoneNumber + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode + ", address=" + address
				+ "]";
	}
}
