import java.util.Scanner;

public  class main {
    private static Scanner scanner = new Scanner(System.in);
    private static mobilephone mobile = new mobilephone("434535");

    public static void main(String[] args) {
        boolean quit = false;
        startphone();
        printaction();
        while (!quit) {
            System.out.println("\n Enter action (6 t0 show available actions ): ");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\n shutting down....");
                    quit = true;
                    break;
                case 1:
                    mobile.printContacts();  //or1
                    break;
                case 2:
                    addnewcontacts(); // or you can use any name
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removecontact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printaction();
                    break;

            }
        }
    }
//    private static void printContacts(){  //or1
//        mobile.printContacts(); //
//        mobilephone.printContacts(); error Non-static method
//        'printContacts()' cannot be referenced from a static context
//    }

    private static void addnewcontacts(){
        System.out.println("Entetr new contact name:");
        String name=scanner.nextLine();
        System.out.println("Enter phone number:");
        String phone=scanner.nextLine();
        //we used the reference to the contact class haven't used an
        // object we haven't created a new instance we've used that directly
        // it is reference from the Contact class using static method
        Contact newContact=Contact.createcontacts(name,phone);
        if(mobile.addnewcontacts(newContact)){
            System.out.println("New contact added: name = "+name+", phone = "+phone);
        }else {
            System.out.println("Cannot add, "+name+" already on file");
        }
    }

    private static void updateContact(){
        System.out.println("Enter Existing Contact name: ");
        String name=scanner.nextLine();
        Contact existingContactRecord=mobile.queryContact(name);
        if(existingContactRecord==null){
            System.out.println("Contact not found ");
            return;
        }
        System.out.print("Enter new Contact Name: ");
        String newName=scanner.nextLine();
        System.out.print("Enter new Contact phone number: ");
        String newNumber=scanner.nextLine();
        Contact newConatct=Contact.createcontacts(newName,newNumber);
        if(mobile.updateContact(existingContactRecord,newConatct)){
            System.out.println("Successfully updated Record");
        }else{
            System.out.println("Error Updating Record");
        }
    }

    private static void removecontact() {
        System.out.println("Enter Existing Contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobile.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found ");
            return;
        }
        if(mobile.removecontact(existingContactRecord)){
            System.out.println("Successfully Updated");
        }else{
            System.out.println("Error Updating Contact");
        }
    }

    private static void queryContact() {
        System.out.println("Enter Existing Contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobile.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found ");
            return;
        }
        System.out.println("Name: "+existingContactRecord.getName()+" phone number is "+existingContactRecord.getPhonenumber());
    }
    private static void startphone () {
        System.out.println("Starting phone...");
    }
    private static void printaction () {
        System.out.println("\n available action:\npress");
        System.out.println(" 0  - to shutdown\n" +
                " 1  - to print contacts\n" +
                " 2  - to to add a new contact\n" +
                " 3  - to update existing contact\n" +
                " 4  - to remove existing contact\n" +
                " 5  - to query if an existing contact exists\n" +
                " 6  - to print a list of available actions\n");
        System.out.println("choose your action");
    }


}


