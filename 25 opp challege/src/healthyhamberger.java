// healthyhamberger.java
public class healthyhamberger extends hamberger {

    private String healthyExtra1name;
    private double healthyExtra1price;

    private String healthyExtra2name;
    private double healthyExtra2price;

    public healthyhamberger( String meat, double price) {
        super("Healthy", meat, price, "Brown rye");

    }

    public void addhealthyhamberger1(String name,double price){
        this.healthyExtra1name=name;
        this.healthyExtra1price=price;
    }

    public void addhealthyhamberger2(String name,double price){
        this.healthyExtra2name=name;
        this.healthyExtra2price=price;
    }

    @Override
    public double itemizhamberger() {
        double hambergerprice= super.itemizhamberger();

        if(this.healthyExtra1name != null){
            hambergerprice +=this.healthyExtra1price;
            System.out.println("Added "+this.healthyExtra1name+" for an extra "+this.healthyExtra1price);
        }

        if(this.healthyExtra2name != null){
            hambergerprice +=this.healthyExtra2price;
            System.out.println("Added "+this.healthyExtra2name+" for an extra "+this.healthyExtra2price);
        }
        return hambergerprice;
    }
}
