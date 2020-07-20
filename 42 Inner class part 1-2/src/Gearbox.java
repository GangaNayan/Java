import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears; //   M1
    private int maxGears; //   M1
    private int currentGear=0; //   M1
    private boolean clutchIsIn; //   M2

    public Gearbox(int maxGears){ //   M1
        this.maxGears=maxGears;
        this.gears=new ArrayList<>();
        Gear neutral =new Gear(0,0.0);
        this.gears.add(neutral);

        // A1  Alternate code in main
        for (int i=0; i<maxGears; i++){
            addGear(i,i*5.3);
        }
    }

    public void operateClutch(boolean in) { //   M2
        this.clutchIsIn = in;
    }

    public void addGear(int number, double ratio) { //   M2
        if((number >0) && (number <= maxGears)) {
            this.gears.add(new Gear(number, ratio));
        }
    }

    public void changeGear(int newGear) { //   M2
        if((newGear>=0 ) && (newGear <this.gears.size()) && this.clutchIsIn) {
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected.");
        } else {
            System.out.println("Grind!");
            this.currentGear = 0;
        }
    }

    public double wheelSpeed(int revs) { //   M2
        if(clutchIsIn) {
            System.out.println("Scream!!!");
            return 0.0;
        }
        return revs * gears.get(currentGear).getRatio();
    }

    // or public
    // 2) Non-Static nested class or inner class
    private class Gear{  //   M1
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber,double ratio){

            this.gearNumber=gearNumber;
            this.ratio=ratio;

        }
        public double getRatio() { //   M2
            return ratio;
        }

        public double driveSpeed(int revs){ //   M1
            return revs*(this.ratio);
        }
    }
}
