// MONITOR.JAVA
public class monitor {
    private String model;
    private String manufacture;
    private int size;
    private resolution nativeresolution;

    public monitor(String model, String manufacture, int size, resolution nativeresolution) {
        this.model = model;
        this.manufacture = manufacture;
        this.size = size;
        this.nativeresolution = nativeresolution;
    }

    public void drawpixelat(int x,int y,String colour){
        System.out.println("drawing pixel at "+x+","+y+" in colours "+colour);
    }


    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public int getSize() {
        return size;
    }

    public resolution getNativeresolution() {
        return nativeresolution;
    }
}
