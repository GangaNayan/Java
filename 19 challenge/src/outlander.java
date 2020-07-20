public class outlander extends car {

    private int roadservicemonths;

    public outlander(/*String name, int size, int whells, int doors, int gear, boolean ismanual, */int roadservicemonths) {
        super("outlander","4wd",5,5,6,false);
        this.roadservicemonths = roadservicemonths;
    }

    public void accelerate(int rate){
        int newvelocity=getCurrentvelocity()+rate;
        if(newvelocity<0){
            stop();
            changegear(1);
        }
        else if (newvelocity>1 && newvelocity<20){
            changegear(1);
        }
        else if(newvelocity>20 && newvelocity<30){
            changegear(2);
        }
        else if(newvelocity>30 && newvelocity<40){
            changegear(3);
        }
        else{
            changegear(4);
        }
        if(newvelocity>0){
            changevelocity(newvelocity,getCurrentdirection());
        }
    }
}
