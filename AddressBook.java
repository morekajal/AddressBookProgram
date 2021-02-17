package addressbook.com;

public class AddressBook {
	
	public String firstName;
	public String lastName;
	public String address;
	public String city;
	public String state;
	public int zipCode;
	public String phoneNumber;
	public String email;
	
	//Constructor
	public AddressBook(String firstName, String lastName, String address, String city, 
			String state, int zipCode, String phoneNumber, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	public static void main(String[] args) {
		System.out.println("***Welcome to Address Book Program***");
		AddressBook makeEntry = new AddressBook("Kajal", "More", "Karmveer_Nagar", "Shirdi", 
				"Maharashtra", 423603, "9270371777", "kajalm3105@gmail.com");
		System.out.println("First name: " + makeEntry.firstName);
		System.out.println("Last name: " + makeEntry.lastName);
		System.out.println("Address: " + makeEntry.address);
		System.out.println("City: " + makeEntry.city);
		System.out.println("State: " + makeEntry.state);
		System.out.println("Zip code: " + makeEntry.zipCode);
		System.out.println("Phone number: " + makeEntry.phoneNumber);
		System.out.println("Email: " + makeEntry.email);
		
	}

}
