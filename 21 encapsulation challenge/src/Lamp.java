//lAMP.JAVA
public class Lamp {
    private String Style;
    private boolean battery;
    private int globeRating;

    public Lamp(String style, boolean battery, int globeRating) {
        Style = style;
        this.battery = battery;
        this.globeRating = globeRating;
    }

    public void turnon(){
        System.out.println("Lamp --> turning on");
    }

    public String getStyle() {
        return Style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobeRating() {
        return globeRating;
    }
}
