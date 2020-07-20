// MOTHERBOARD.JAVA
public class motherboard {
    private String model;
    private String manufacturer;
    private int ramslots;
    private int cardslots;
    private String bios;

    public motherboard(String model, String manufacturer, int ramslots, int cardslots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramslots = ramslots;
        this.cardslots = cardslots;
        this.bios = bios;
    }
    public void loadprogram(String programname){
        System.out.println("progarm "+programname+" is now loading...");
    }


    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamslots() {
        return ramslots;
    }

    public int getCardslots() {
        return cardslots;
    }

    public String getBios() {
        return bios;
    }
}
