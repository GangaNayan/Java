import java.util.ArrayList;
// Warning be aware of i<=size(); out of bound exception
public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name,double initialamount){
        this.name=name;
        this.transactions=new ArrayList<Double>();
        addTransaction(initialamount);
    }

    public void addTransaction(double amount){
        this.transactions.add(amount);
    }

    public String getName(){
        return name;
    }

    public ArrayList<Double> getTransactions(){
        return transactions;
    }
}
