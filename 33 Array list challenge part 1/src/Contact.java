import java.util.Scanner;

public class Contact {
    private String name;
    private String phonenumber;

    public Contact(String name, String phonenumber) {
        this.name = name;
        this.phonenumber = phonenumber;
    }

    public String getName() {
        return name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    // by using this below method we don't want to create new object instance in main class
    public static Contact createcontacts(String name, String phonenumber) {
        return new Contact(name, phonenumber);
    }
}

