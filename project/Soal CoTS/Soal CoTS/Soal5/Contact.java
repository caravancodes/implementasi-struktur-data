package com.company;

/**
 * Created by ACERR on 24/04/2017.
 */
public class Contact {
    //to do
	/*Buatlah member dari kelas ini*/

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
}
