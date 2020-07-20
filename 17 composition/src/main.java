// MAIN.JAVA
public class main {
    public static void main(String[] args) {
        dimensions dimensions=new dimensions(20,20,5);
        Case thecase = new Case("2208","Dell","240",dimensions);

        monitor themonitor=new monitor("27 inch beast","acer",27,new resolution(2540,1440)); //new way of calling variable

        motherboard themotherboard =new motherboard("BJ-200","asus",4,6,"v2.44");

        pc thepc =new pc(thecase,themonitor,themotherboard);
//        thepc.getMonitor().drawpixelat(1500,1200,"red");
//        thepc.getMotherboard().loadprogram("windows 1.0");
//        thepc.getThecase().presspowerbutton();
        thepc.powerup();
    }
}
