package lehugha;

public class Contact {
    String phoneNumber, address;

    public Contact(String phoneNumber, String address) {
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    //to do
	/*Buatlah method hashCode, equals dan
	**toString bagi kelas ini. Variabel
	**yang menjadi key bagi Contact adalah
	**no telepon*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        return phoneNumber.equals(contact.phoneNumber);

    }
    @Override
    public int hashCode() {
        return phoneNumber.hashCode();
    }

    @Override
    public String toString() {
        return phoneNumber + ' ' +address ;
    }
}
