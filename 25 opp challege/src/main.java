
//main,java
public class main {
    public static void main(String[] args) {

        hamberger hamberger=new hamberger("Basic","Sausage",3.56,"white");
       double price= hamberger.itemizhamberger(); //double price is to know the parameter
        hamberger.addhambergeraddition1("tomoto",5);
        hamberger.addhambergeraddition2("Lettuce",6);
        hamberger.addhambergeraddition3("cheese",10);
        // hamberger.itemizhamberger();  by using this line of code executes first statement because we not specified sout in return hamberger price
        System.out.println("Total burger price "+hamberger.itemizhamberger());


        healthyhamberger healthyhamberger =new healthyhamberger("Bacon",5.67);
        healthyhamberger.addhambergeraddition1("Egg",5.43);
        healthyhamberger.addhealthyhamberger1("Lentils",3.41);
        healthyhamberger.addhealthyhamberger2("soda",1);
       // healthyhamberger.itemizhamberger(); // by using this line of code executes first statement because we not specified sout in return hamberger price
        System.out.println("Total burger price "+healthyhamberger.itemizhamberger());

        Deluxhamberger db=new Deluxhamberger();
        db.addhambergeraddition3("shold not add to extra ",50);
        db.itemizhamberger();
        System.out.println(db.itemizhamberger()); // to print total price




    }
}
