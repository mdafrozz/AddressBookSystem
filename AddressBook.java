/**
 * 
 */
package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.List;

/**
 * @author MD_AFROZ
 *
 */
public class AddressBook {
	List<Contact> listContact = new ArrayList<Contact>();
	Contact con = new Contact(toString(), toString(), toString(), toString(), toString(), toString(), toString(),
			toString());
	static Scanner scanner = new Scanner(System.in);

	// Create Contacts
	public void createContact() {
		System.out.println("Enter Person Details:");
		System.out.println("Enter first Name");
		String firstName = scanner.next();

		System.out.println("Enter last Name");
		String lastName = scanner.next();

		System.out.println("Enter Email");
		String email = scanner.next();

		System.out.println("Enter phone number");
		String phoneNumber = scanner.next();

		System.out.println("Enter address");
		String address = scanner.next();

		System.out.println("Enter state");
		String state = scanner.next();

		System.out.println("Enter city");
		String city = scanner.next();

		System.out.println("Enter zip");
		String zip = scanner.next();

		listContact.add(new Contact(firstName, lastName, email, phoneNumber, address, state, city, zip));
		// printContacts();
	}

	// Adding new contact method
	public void addContact(Contact contact) {
		createContact();
		System.out.println("Enter firstname and lastname");
		String name = scanner.next() + "" + scanner.next();
		
		Iterator<Contact> iterator = listContact.listIterator();
		
		while (iterator.hasNext()) {
			Contact contacts = iterator.next();
			if (name.equals(contacts.getFirstName() + "" + contacts.getLastName())) {
				System.out.println("Duplicate entry add new contact press 1 ");
			}else {
				System.out.println("Enter Person Details:");

				System.out.println("Enter first Name");
				String firstName = scanner.next();

				System.out.println("Enter last Name");
				String lastName = scanner.next();

				System.out.println("Enter Email");
				String email = scanner.next();

				System.out.println("Enter phone number");
				String phoneNumber = scanner.next();

				System.out.println("Enter address");
				String address = scanner.next();

				System.out.println("Enter state");
				String state = scanner.next();

				System.out.println("Enter city");
				String city = scanner.next();

				System.out.println("Enter zip");
				String zip = scanner.next();

				listContact.add(new Contact(firstName, lastName, email, phoneNumber, address, state, city, zip));
				printContacts();
			}
		}
	}

	// Print Contacts
	public Contact printContacts() {
		if (listContact.isEmpty()) {
			System.out.println("No Records!!!");
		} else {
			for (Contact contacts : listContact) {
				System.out.println(contacts);
			}
		}
		return con;
	}

	// Edit and update Contacts
	public void editContact() {
		System.out.println("Enter the person name for update");
		String firstName = scanner.next();

		Iterator<Contact> iterator = listContact.listIterator();

		while (iterator.hasNext()) {
			Contact contacts = iterator.next();
			if (firstName.equals(contacts.getFirstName())) {
				System.out.println("Edit the details of person");
				System.out.println("Enter first Name");
				String firstName1 = scanner.next();
				contacts.setFirstName(firstName1);

				System.out.println("Enter last Name");
				String lastName = scanner.next();
				contacts.setLastName(lastName);

				System.out.println("Enter Email");
				String email = scanner.next();
				contacts.setEmail(email);

				System.out.println("Enter phone number");
				String phoneNumber = scanner.next();
				contacts.setPhoneNumber(phoneNumber);

				System.out.println("Enter state");
				String state = scanner.next();
				contacts.setState(state);

				System.out.println("Enter city");
				String city = scanner.next();
				contacts.setCity(city);

				System.out.println("Enter zip");
				String zip = scanner.next();
				contacts.setZip(zip);

				printContacts();

			} else {
				System.out.println("Person not found");
			}
		}
	}

	// Delete contacts
	public void deleteContactByName() {
		try {
			System.out.println("Enter first name for delete contact:");
			String firstName = scanner.next();

			Iterator<Contact> iterator = listContact.listIterator();

			while (iterator.hasNext()) {
				Contact contacts = iterator.next();
				if (firstName.equals(contacts.getFirstName())) {
					listContact.remove(contacts);
					System.out.println("Contact: " + contacts.getFirstName() + " " + "deleted successfully...");
				}
			}
		} catch (Exception e) {
		}
		printContacts();
	}
}
