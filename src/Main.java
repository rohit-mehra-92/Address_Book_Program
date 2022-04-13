import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        AddressBook addressBook = new AddressBook();
        Scanner in = new Scanner(System.in);
        int option;
        do {
            System.out.println("CHOOSE THE OPTION: \n 1.Add Contact \n 2.Edit Contact \n 3.remove Contact \n 0.exit");
            option = in.nextInt();
            switch (option) {
                case 1:
                    addressBook.addContact();
                    break;
                case 2:
                    System.out.println("Enter the first Name of person who you want to edit");
                    String edit = sc.nextLine();
                    addressBook.editContact(edit);
                    break;
                case 3:
                    System.out.println("Enter the first name of person who you want to delete");
                    String remove = sc.nextLine();
                    addressBook.deleteContact(remove);
                    break;
                default:
                    System.out.println("Please choose correct option");
            }
        } while (option != 0);
    }
}



