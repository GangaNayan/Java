// deluxhamberger.java
public class Deluxhamberger extends hamberger {
    public Deluxhamberger(){
        super("Delux","Sasage",14.54,"white");
        super.addhambergeraddition1("Chips",2.75);
        super.addhambergeraddition2("Drink",1.81);
    }

    @Override
    public void addhambergeraddition1(String name, double price) {
       // super.addhambergeraddition1(name, price);
        System.out.println("Cannot add to EXTRA total");
    }

    @Override
    public void addhambergeraddition2(String name, double price) {
        System.out.println("Cannot add to total");
    }

    @Override
    public void addhambergeraddition3(String name, double price) {
        System.out.println("Cannot add to total");
    }

    @Override
    public void addhambergeraddition4(String name, double price) {
        System.out.println("Cannot add to total");
    }
}
