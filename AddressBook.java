package addressbook.com;
import java.util.Scanner;

public class AddressBook {
	
	public void AddYourDetails() {
		Scanner input = new Scanner(System.in);
		System.out.println(" \n Enter your First Name");
		String firstName = input.next();
		System.out.println("\n Enter your Last Name");
		String lastName = input.next();
		System.out.println("\n Enter your Address");
		String address = input.next();
		System.out.println("\n Enter your City name");
		String city = input.next();
		System.out.println("\n Enter your State name");
		String state = input.next();
		System.out.println("\n Enter your Zip Code");
		String zipCode = input.next();
		System.out.println("\n Enter your Phone number");
		String phoneNumber = input.next();
		System.out.println("\n Enter your Email address");
		String email = input.next();
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("House Number: " + address);
		System.out.println("City: " + city);
		System.out.println("State: " + state);
		System.out.println("Pin Code: " + zipCode);
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("E-Mail: " + email);
	}
	
	public static void main(String[] args) {
		System.out.println("WELCOME to Address Book Program");
		AddressBook contact = new AddressBook();
		contact.AddYourDetails();
		
	}
}