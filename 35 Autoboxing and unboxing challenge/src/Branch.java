import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name){
        this.name=name;
        this.customers=new ArrayList<Customer>();
    }

    public String getName(){
        return name;
    }
    public ArrayList<Customer> getCustomers(){
        return customers;
    }

    public boolean newCustomer(String custamername,double initialamount){
        if(findcustomer(custamername)==null){
            this.customers.add(new Customer(custamername,initialamount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customername,double amount){
        Customer existingcustomer=findcustomer(customername);
        if(existingcustomer!=null){
            existingcustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findcustomer(String customername){
        for(int i=0; i<this.customers.size(); i++){
              Customer checkedcustomer=this.customers.get(i);
              if(checkedcustomer.getName().equals(customername)){
                  return checkedcustomer;
              }
        }
        return null;
    }
}


