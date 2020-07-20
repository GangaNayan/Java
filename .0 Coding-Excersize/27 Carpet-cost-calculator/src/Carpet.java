public class Carpet {
    private double coast;

    public Carpet(double coast){
        this.coast=coast;
        if(coast<0){
            this.coast=0;
        }
    }
    public double getcoast(){
        return this.coast;
    }
}
