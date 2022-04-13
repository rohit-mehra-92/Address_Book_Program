import java.lang.*;
import java.util.*;

public class AddressBook {
    ArrayList<Contact> person = new ArrayList<Contact>();
    Scanner sc = new Scanner(System.in);

    public void addContact() {
        Contact newPerson = new Contact();

        System.out.print("Enter first name: ");
        newPerson.setFirstName(sc.nextLine());

        System.out.print("Enter last name: ");
        newPerson.setLastName(sc.nextLine());

        System.out.print("Enter streetNo.: ");
        newPerson.setStreetNo(sc.nextInt());

        System.out.print("Enter street: ");
        newPerson.setStreet(sc.nextLine());

        sc.nextLine();

        System.out.print("Enter city: ");
        newPerson.setCity(sc.nextLine());

        System.out.print("Enter phone Number: ");
        newPerson.setContactNumber(sc.nextLine());

        System.out.print("Enter email address: ");
        newPerson.setEmail(sc.nextLine());

        person.add(newPerson);

        for (int i = 0; i < person.size(); i++) {
            System.out.println(person.get(i));
        }
    }

    public void editContact(String editName) {
        for (int i = 0; i < person.size(); i++) {
            if (person.get(i).getFirstName().equalsIgnoreCase(editName)) {
                System.out.println("CHOOSE THE OPTIONS YOU WANT TO EDIT :");
                System.out.println(" 1.firstName \n 2.lastName \n 3.streetNumber \n 4.street \n 5.city \n 6.contactNumber \n 7.emailAddress ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println(person.get(i).getFirstName());
                        System.out.println("Enter first name");
                        sc.nextLine();
                        String firstName = sc.nextLine();
                        person.get(i).setFirstName(firstName);
                        System.out.println(person.get(i));
                        break;
                    case 2:
                        System.out.println(person.get(i).getLastName());
                        System.out.println("Enter last name");
                        sc.nextLine();
                        String lastName = sc.nextLine();
                        person.get(i).setLastName(lastName);
                        System.out.println(person.get(i));
                        break;
                    case 3:
                        System.out.println(person.get(i).getStreetNo());
                        System.out.println("Enter the street number");
                        int streetNum = sc.nextInt();
                        person.get(i).setStreetNo(streetNum);
                        System.out.println(person.get(i));
                        break;
                    case 4:
                        System.out.println(person.get(i).getStreet());
                        System.out.println("Enter street name");
                        sc.nextLine();
                        person.get(i).setStreet(sc.nextLine());
                        System.out.println(person.get(i));
                        break;
                    case 5:
                        System.out.println(person.get(i).getCity());
                        System.out.println("Enter city name");
                        sc.nextLine();
                        person.get(i).setCity(sc.nextLine());
                        System.out.println(person.get(i));
                        break;
                    case 6:
                        System.out.println(person.get(i).getContactNumber());
                        System.out.println("Enter contact number");
                        sc.nextLine();
                        person.get(i).setContactNumber(sc.nextLine());
                        System.out.println(person.get(i));
                        break;
                    case 7:
                        System.out.println(person.get(i).getEmail());
                        System.out.println("Enter email address");
                        sc.nextLine();
                        person.get(i).setEmail(sc.nextLine());
                        System.out.println(person.get(i));
                        break;
                    default:
                        System.out.println("Enter the valid option");
                        break;
                }
            } else System.out.println("Contact not found");
        }
    }

    public void deleteContact(String firstName) {
        for (int i = 0; i < person.size(); i++) {
            if (person.get(i).getFirstName().equalsIgnoreCase(firstName)) {
                person.remove(i);
                System.out.println(person);
            }
        }
    }
}