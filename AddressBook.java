package addressbook.com;
import java.util.Scanner;

public class AddressBook {

	public String[] AddYourDetails() {
		Scanner input = new Scanner(System.in);
		//char[] crossBoard = new char[8];
		String[] details = new String[8];
		System.out.println("Enter your First Name");
		String firstName = input.next();
		details[0] = firstName;
		System.out.println("Enter your Last Name");
		String lastName = input.next();
		details[1] = lastName;
		System.out.println("Enter your address");
		String address = input.next();
		details[2] = address;
		System.out.println("Enter your City name");
		String city = input.next();
		details[3] = city;
		System.out.println("Enter your State name");
		String state = input.next();
		details[4] = state;
		System.out.println("Enter your Zip Code");
		String zipCode = input.next();
		details[5] = zipCode;
		System.out.println("Enter your Phone number");
		String phoneNumber = input.next();
		details[6] = phoneNumber;
		System.out.println("Enter your Email address");
		String email = input.next();
		details[7] = email;
		return details;
	}
 
	public void EditYourDetails(String[] details) {
		System.out.println("If you want to edit the details press 1 else press 0");
		Scanner sc = new Scanner(System.in);
		int modify = sc.nextInt();
		if (modify == 1) {
			System.out.println("Press the Number you want to edit the details:\n "
					+ "1  First Name\n2 Last Name\n3 Address\n4 City\n5 State\n6 Zip Code\n7 Phone number\n8 Email");
			int input = sc.nextInt();
			switch (input) {
			case 1:
				System.out.println("Enter the First Name to Modify");
				String modifyFirstName = sc.next();
				details[0] = modifyFirstName;
				break;
			case 2:
				System.out.println("Enter the Last Name to Modify");
				String modifyLastName = sc.next();
				details[1] = modifyLastName;
				break;
			case 3:
				System.out.println("Enter the Address to Modify");
				String modifyAddress = sc.next();
				details[2] = modifyAddress;
				break;
			case 4:
				System.out.println("Enter the City to Modify");
				String modifyCity = sc.next();
				details[3] = modifyCity;
				break;
			case 5:
				System.out.println("Enter the State to Modify");
				String modifyState = sc.next();
				details[4] = modifyState;
				break;
			case 6:
				System.out.println("Enter the Zip Code to Modify");
				String modifyZipCode = sc.next();
				details[5] = modifyZipCode;
				break;
			case 7:
				System.out.println("Enter the Phone number to Modify");
				String modifyPhoneNumber = sc.next();
				details[6] = modifyPhoneNumber;
				break;
			case 8:
				System.out.println("Enter your new email");
				String modifyEmail = sc.next();
				details[7] = modifyEmail;
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}
			System.out.println("Your new details are as follows");
			for (int j = 0; j < details.length; j++) {
				System.out.println(details[j]);
			}
		} 
		else if (modify == 0) {
			for (int j = 0; j < details.length; j++) {
				System.out.println(details[j]);
			}
			
		}
		else
			System.out.println("You Input Is Invalid");
	}
	
	public static void main(String[] args) {
		System.out.println("***Welcome to Address Book Program***");
		AddressBook details = new AddressBook();
		String[] info = details.AddYourDetails();
		details.EditYourDetails(info);
	}
}