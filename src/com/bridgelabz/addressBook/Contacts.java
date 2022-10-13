package com.bridgelabz.addressBook;

public class Contacts {

	private final String firstName;
	private final String lastName;
	private final String address;
	private final String city;
	private final String state;
	private final int zip;
	private final long phoneNo;
	private final String email;

	public Contacts(String myFirstName, String myLastName, String myAddress, String myCity, String myState, int myZip,
			long myPhoneNo, String myEmail) {
		firstName = myFirstName;
		lastName = myLastName;
		address = myAddress;
		city = myCity;
		state = myState;
		zip = myZip;
		phoneNo = myPhoneNo;
		email = myEmail;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public int getZip() {
		return zip;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public String getEmail() {
		return email;
	}

}