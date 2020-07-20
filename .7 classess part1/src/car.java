public class car {
    private int doors;
    private int wheels;
    private String model;
    private String colour;

    public void setModel(String model) {
        String validmodel = model.toLowerCase();
        if (validmodel.equals("tata 150") || validmodel.equals("tata 360")) {
            this.model = model;
        } else {

            System.out.println("Model is unknown");
        }
    }
    public String getModel(){
        return this.model;
    }
}
