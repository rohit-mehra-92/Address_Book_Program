import java.lang.*;
import java.util.*;

public class AddressBook {

    public static void main(String[] args) {

        Contact newPerson = new Contact();

        ArrayList<Contact> person = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first name: ");
        newPerson.setFirstname(sc.nextLine());

        System.out.print("Enter last name: ");
        newPerson.setLastname(sc.nextLine());

        System.out.print("Enter streetNo.: ");
        newPerson.setStreetNo(sc.nextInt());

        sc.nextLine();

        System.out.print("Enter street: ");
        newPerson.setStreet(sc.nextLine());

        System.out.print("Enter city: ");
        newPerson.setCity(sc.nextLine());

        sc.nextLine();

        System.out.print("Enter phone Number: ");
        newPerson.setContactNumber(sc.nextLine());

        System.out.print("Enter email address: ");
        newPerson.setEmail(sc.nextLine());

        person.add(new Contact(newPerson.getFirstname(), newPerson.getLastname(), newPerson.getStreetNo(), newPerson.getStreet(),
                newPerson.getCity(), newPerson.getContactNumber(), newPerson.getEmail()));

        System.out.println(person.get(0));
    }
}
