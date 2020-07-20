import java.util.ArrayList;

public class main {
    public static void main(String[] args){
        customer cust=new customer("nayan",100.0); // first class
        customer anothercust;  // second class
        anothercust=cust; // the second class changes the first class where second class is a reference to first class it is not a class

        anothercust.setBalance(200.00);
        System.out.println("Balance amount of customemr "+cust.getName()+" is "+cust.getBalance());

        ArrayList<Integer> myvalue= new ArrayList<Integer>();
        myvalue.add(1);
        myvalue.add(3);
        myvalue.add(4);
        for (int i=0;i<myvalue.size(); i++){
            System.out.println(i+" = "+myvalue.get(i));
        }
        myvalue.add(1,2);
        for (int i=0;i<myvalue.size(); i++){
            // when we have to add or remove elements between any array the lower elements
            // comes up that takes lot of manipulation to computer that's why linked list is required

            System.out.println(i+" = "+myvalue.get(i));
        }
    }
}
