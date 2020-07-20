import java.util.ArrayList;

public class mobilephone {
    private String mynumber;
    private ArrayList<Contact> myContacts;

    // ERROR find
//    public mobilephone(String mynumber, ArrayList<Contact> myContacts) {
//        this.mynumber = mynumber;
//        this.myContacts = myContacts;
//    }

    // we need to query, modify ,delete contact so we dont want to enter contact directly from constructor initialization!
    public mobilephone(String mynumber) {
        this.mynumber = mynumber;
        this.myContacts =  new ArrayList<Contact>();  // using new to create array object
    }


    public boolean addnewcontacts(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundposition = findContact(oldContact);
        if (foundposition < 0) {
            System.out.println(oldContact.getName() + " was not found.");
            return false;
        }else if(findContact(newContact.getName()) !=-1){  // !=-1
            System.out.println("Contact with name "+newContact.getName()+
                    " already exists. Update was not Successful");
            return false;
        }
        this.myContacts.set(foundposition, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }

    public boolean removecontact(Contact contact) {
        int foundposition = findContact(contact);
        if (foundposition < 0) {
            System.out.println(contact.getName() + " was not found.");
            return false;
        }
        this.myContacts.remove(foundposition);
        System.out.println(contact.getName() + " was deleted.");
        return true;
    }

    public String queryContact(Contact contact) {
        if (findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name){
        int positiion=findContact(name);
        if(positiion>=0){
            return this.myContacts.get(positiion);
        }
        return null;
    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactname) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactname)) {
                return i;
            }
        }
        return -1;
    }

    public void printContacts() {
        System.out.println("contact list");
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i + 1) + "." +
                    this.myContacts.get(i).getName() + "-->" +
                    this.myContacts.get(i).getPhonenumber());
        }
    }
}


