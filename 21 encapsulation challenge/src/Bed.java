//BED.JAVA
   public class Bed {
    private String style;
    private String pillows;
    private int height;
    private int sheets;
    private int quilt;

    public Bed(String style, String pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }
    public void make(){
        System.out.println("Bed --> making");
    }

    public String getStyle() {
        return style;
    }

    public String getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }
}
