/**
 * 
 */
package main;


import java.util.HashMap;
import java.util.Scanner;
/**
 * @author MD_AFROZ
 *
 */
public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("<-------------Welcome To Address Book----------------->");
		
		Scanner scanner = new Scanner(System.in);
		HashMap<String, AddressBook> services = new HashMap<>();
		System.out.println("*****Enter Unique Address Book Name*****");
		String addressBookNameAsKey = scanner.nextLine().toUpperCase();
		System.out.println(addressBookNameAsKey);
		AddressBook addressBookNameValue = new AddressBook();
		services.put(addressBookNameAsKey, addressBookNameValue);
		
		boolean exit = false;
		System.out.println("Enter Your Choice");
		
		while (!exit) {
			System.out.println("1.Create/Add Contact\t 2.Update Contact\t 3.Delete Contact\t 4.Quit");
			int choice = scanner.nextInt();
			scanner.close();
			switch (choice) {
			case 1:
				System.out.println("Add New Contact");
				services.get(addressBookNameAsKey).addContact(null);
				break;
			case 2:
				System.out.println("Update Contact");
				services.get(addressBookNameAsKey).editContact();
				break;
			case 4:
				System.out.println("Search Contact");
				services.get(addressBookNameAsKey).searchContact();
				break;
			case 5:
				exit = true;
				System.out.println("Thank you.....!!!");
				break;
			default:
				System.out.println("Application is quit...");
				break;
			}
		}
		System.out.println("You are out of choice of multiple addressbook");
	}
}