// BEDROOM.JAVA
public class Bedroom {
    private String name;
    private String wall1;
    private String wall2;
    private String wall3;
    private String wall4;
    private Ceilng Ceilng;
    private Bed Bed;
    private Lamp Lamp;

    public Bedroom(String name,String wall1, String wall2, String wall3, String wall4, Ceilng ceilng, Bed Bed, Lamp lamp) {
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.Ceilng = Ceilng;
        this.Bed = Bed;
        this.Lamp = lamp;
    }

    public void makebed(){
        System.out.println("Bed --> making bed");
        Bed.make();
    }

    public String getWall1() {
        return wall1;
    }

    public String getWall2() {
        return wall2;
    }

    public String getWall3() {
        return wall3;
    }

    public String getWall4() {
        return wall4;
    }

    public Ceilng getCeiling() {
        return Ceilng;
    }

    public Bed getBed() {
        return Bed;
    }

    public Lamp getLamp() {
        return Lamp;
    }
}
