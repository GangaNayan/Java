// CASE.JAVA
public class Case {
    private String model;
    private  String manufacture;
    private String powersupply;
    private dimensions dimensions;

    public Case(String model, String manufacture, String powersupply, dimensions dimensions) {
        this.model = model;
        this.manufacture = manufacture;
        this.powersupply = powersupply;
        this.dimensions = dimensions;
    }

    public void presspowerbutton(){
        System.out.println("power button passed");
    }

    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public String getPowersupply() {
        return powersupply;
    }

    public dimensions getDimensions() {
        return dimensions;
    }
}
