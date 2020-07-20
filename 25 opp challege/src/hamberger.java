// hamberger.java
public class hamberger {
    private String name;
    private String meat;
    private double price;
    private String breadrolltype;

    private String addition1name;
    private double addition1price;

    private String addition2name;
    private double addition2price;

    private String addition3name;
    private double addition3price;

    private String addition4name;
    private double addition4price;

    public hamberger(String name, String meat, double price, String breadrolltype) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadrolltype = breadrolltype;
    }

    public void addhambergeraddition1(String name,double price){
        this.addition1name=name;
        this.addition1price=price;
    }

    public void addhambergeraddition2(String name,double price){
        this.addition2name=name;
        this.addition2price=price;
    }

    public void addhambergeraddition3(String name,double price){
        this.addition3name=name;
        this.addition3price=price;
    }

    public void addhambergeraddition4(String name,double price){
        this.addition4name=name;
        this.addition4price=price;
    }

    public double itemizhamberger(){
        double hambergerprice=this.price;
        System.out.println(this.name+" hamberger "+" on a "+this.breadrolltype+" roll"+" price is "+this.price);

        if(this.addition1name != null){
            hambergerprice +=this.addition1price;
            System.out.println("Added "+this.addition1name+" for an extra "+this.addition1price);
        }

        if(this.addition2name != null){
            hambergerprice +=this.addition2price;
            System.out.println("Added "+this.addition2name+" for an extra "+this.addition2price);
        }

        if(this.addition3name != null){
            hambergerprice +=this.addition3price;
            System.out.println("Added "+this.addition3name+" for an extra "+this.addition3price);
        }

        if(this.addition4name != null){
            hambergerprice +=this.addition4price;
            System.out.println("Added "+this.addition4name+" for an extra "+this.addition4price);
        }
        return hambergerprice;

    }


}
