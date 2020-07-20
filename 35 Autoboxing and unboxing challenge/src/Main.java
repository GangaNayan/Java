public class Main {
    public static void main(String[] args) {
      Bank bank =new Bank("National Indian Bank");

      if(bank.addBranches("banglore")){
          System.out.println("banglore branch created");
      }

      bank.addcustomer("banglore","nayan",50.00);
        bank.addcustomer("banglore","vinu",150.00);
        bank.addcustomer("banglore","sahana",250.00);

        bank.addBranches("mysore");
        bank.addcustomer("mysore","ram",300);

        bank.addCustomerTransaction("banglore","nayan",77.16);
        bank.addCustomerTransaction("banglore","nayan",67.12);
        bank.addCustomerTransaction("banglore","vinu",400.00);

        bank.listcustomers("banglore",true);
        bank.listcustomers("mysore",false);

        if(!bank.addcustomer("melborn","gudi",56.0)){
            System.out.println("error updaing");
        }

        if(!bank.addBranches("banglore")){
            System.out.println("banglore already exists");
        }

        if(!bank.addCustomerTransaction("banglore","guchi",50.00)){
            System.out.println("Customer does not exist at branch");
        }
        if(!bank.addcustomer("banglore","nayan",50.00)){
            System.out.println("Customer nayan already exists");
        }

    }
}
