public class Floor {
    private double width;
    private double length;
    public Floor(double width, double length) {
        this.width = width;
        this.length = length;
        if (width < 0) {
            this.width = 0;
        }
        if (length < 0) {
            this.length = 0;
        }
    }
    public double getArea() {
        return this.width * this.length;
    }
}
public class Carpet {
    private double cost;
    public Carpet(double cost) {
        this.cost = cost;
        if(cost < 0){
            this.cost = 0;
        }
    }
    public double getCost(){
        return this.cost;
    }
}
public class Calculator {
    private Floor floor;
    private Carpet carpet;
    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }
    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }
}
