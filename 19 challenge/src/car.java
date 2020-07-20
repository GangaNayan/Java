public class car extends vehicle {

    private int whells;
    private int doors;
    private int gear;
    private boolean ismanual;

    private int currentgear;

    public car(String name, String size, int whells, int doors, int gear, boolean ismanual /* int currentgear */) {
        super(name, size);
        this.whells = whells;
        this.doors = doors;
        this.gear = gear;
        this.ismanual = ismanual;
        this.currentgear = 1;
    }

    public void changegear(int currentgear){
        this.currentgear=currentgear;
        System.out.println("car.changegear(): changed to "+this.currentgear+" gear");
    }

    public void changevelocity(int speed,int direction){
        System.out.println("car.changevelocity(): velocity "+speed+" direction "+direction);
        move(speed,direction);

    }

}
