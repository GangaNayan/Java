import java.util.jar.JarOutputStream;

public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;


    public Fish(String name, /*int brain, int body, we can remove this if we want because we initialized fixed values*/
                int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    public void rest(){

}
    public void movebody(){
        System.out.println("fisth.movebody() is called");
    }
    public void movefins(){
        System.out.println("fish.movefins()  is called");
    }

    public void swim(int speed){
        movebody();
        movefins();
        super.move(speed);

    }


}
