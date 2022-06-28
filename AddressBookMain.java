/**
 * 
 */
package main;


import java.util.Scanner;
/**
 * @author MD_AFROZ
 *
 */
public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("<-------------Welcome To Address Book----------------->");
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		AddressBook a = new AddressBook();
		
		boolean exit = false;
		System.out.println("Enter Your Choice");
		
		while (!exit) {
			System.out.println("1.Create Contact\t 2.Edit Contact\t 3.Delete Contact\t 4.Quit");
			int choice = scanner.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Add New Contact");
				a.addContact(null);
				break;
			case 2:
				System.out.println("Update Contact");
				a.editContact();
				break;
			case 3:
				System.out.println("Delete Contact");
				
				break;
			case 4:
				exit = true;
				System.out.println("Thank you.....!!!");
				break;
			default:
				System.out.println("Please Enter a valid choice..!!");
				break;
			}
		}
		
	}

}
