public class Contact {
    private String firstName;
    private String lastName;
    private int streetNo;
    private String street;
    private String city;
    private String contactNumber;
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(int streetNo) {
        this.streetNo = streetNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ContactDetail{" +
                "firstname='" + firstName + '\'' +
                ", lastname='" + lastName + '\'' +
                ", streetNo=" + streetNo +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", contactNumber=" + contactNumber +
                ", email='" + email + '\'' +
                '}';
    }
}
