public class AddressBook {

    private String firstname;
    private String lastname;
    private int streetNo;
    private String street;
    private String city;
    private long contactNumber;
    private String email;

    public AddressBook(String firstname, String lastname, int streetNo, String street,
                       String city, int contactNumber, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.streetNo = streetNo;
        this.street = street;
        this.city = city;
        this.contactNumber = contactNumber;
        this.email = email;
    }

    public static void main(String[] args) {
        AddressBook contact = new AddressBook("Rohit", "mehra", 249, "aranya,",
                "indore", 5292759, "rohit264cool@gmail.com");
        System.out.println(
                        contact.firstname + " " +
                        contact.lastname + "\n " +
                        contact.city + " " +
                        contact.streetNo + " " +
                        contact.street + "\n " +
                        contact.contactNumber + "\n " +
                        contact.email);
    }
}

