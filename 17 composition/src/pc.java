//PC.JAVA
public class pc {
    private Case thecase;
    private monitor monitor;
    private motherboard motherboard;

    public pc(Case thecase, monitor monitor, motherboard motherboard) {
        this.thecase = thecase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerup() {
        thecase.presspowerbutton();
        drawlogo();
    }

    private void drawlogo() {
        // fancy graphics
        monitor.drawpixelat(1200, 50, "yellow");
    }
//    public Case getThecase() {
//        return thecase;
//    }
//
//    public monitor getMonitor() {
//        return monitor;
//    }
//
//    public motherboard getMotherboard() {
//        return motherboard;
//    }
//}
}