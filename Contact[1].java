public class Contact {
	private String contactID;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	public Contact(String id,String first,String last,String number,String addy){
		if(id.length() <= 10 && id != null) {
			this.contactID = id;
		}
		this.setFirstName(first);
		this.setLastName(last);
		this.setPhoneNumber(number);
		this.setAddress(addy);
	}

	public void setFirstName(String first) {
		if(first.length() <= 10 && first != null) {
			this.firstName = first;
		}
	}
	
	public void setLastName(String last) {
		if(last.length() <= 10 && last != null) {
			this.lastName = last;
		}
	}

	public void setPhoneNumber(String number) {
		if(number.length() == 10 && number != null) {
			this.phoneNumber = number;
		}
	}
	
	public void setAddress(String addy) {
		if(addy.length() <= 30 && addy != null) {
			this.address = addy;
		}
	}

	public String getContactID() {
		return contactID;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Contact [contactID=" + contactID + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", phoneNumber=" + phoneNumber + ", address=" + address + "]";
	}
}