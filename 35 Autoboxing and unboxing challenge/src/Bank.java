import java.io.ByteArrayInputStream;
import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> Brances;

    public Bank(String name){
        this.name=name;
        this.Brances=new ArrayList<Branch>();

    }

    public boolean addBranches(String branchname){
        if(findBranch(branchname)==null){
            this.Brances.add(new Branch(branchname));
            return true;
        }
        return false;
    }
    public boolean addcustomer(String branchname,String customername,double initialamount){
        Branch branch=findBranch(branchname);
        if(branch!=null){
            return branch.newCustomer(customername,initialamount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchname,String customername,double amount){
        Branch branch=findBranch(branchname);
        if(branch!=null){
            return branch.addCustomerTransaction(customername,amount);
        }
        return false;
    }
    private Branch findBranch(String branchname){
        for(int i=0; i<this.Brances.size(); i++){
            Branch CheckedBranch=this.Brances.get(i);
            if(CheckedBranch.getName().equals(branchname)){
                return CheckedBranch;
            }
        }
        return null;
    }
    public boolean listcustomers(String branchname,boolean showTransaction){
        Branch branch=findBranch(branchname);
        if(branch!=null){
            System.out.println("Customer details for branch "+branch.getName());

            ArrayList<Customer> branchcustomers=branch.getCustomers();
            for(int i=0; i<branchcustomers.size(); i++){
                Customer branchcustomer=branchcustomers.get(i);
                System.out.println("Customer: "+branchcustomer.getName()+"["+(i+1)+"]");

                if(showTransaction){
                    System.out.println("Transactions");
                    ArrayList<Double> transactions=branchcustomer.getTransactions();
                    for(int j=0; j<transactions.size(); j++){
                        System.out.println("["+ (j+1) +"] Amount "+transactions.get(j));
                    }
                }
            }
            return true;
        }else{
            return false;
        }
    }
}
