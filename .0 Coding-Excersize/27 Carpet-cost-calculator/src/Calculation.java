public class Calculation {
    private Flore flore;
    private Carpet carpet;

    public Calculation(Flore flore,Carpet carpet){
        this.flore=flore;
        this.carpet=carpet;
    }
    public double gettotalcoast(){
        return flore.getArea()*carpet.getcoast();
    }
}
