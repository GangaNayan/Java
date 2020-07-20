import java.security.spec.RSAOtherPrimeInfo;

public class Dog extends Animal {
    private int eye;
    private int leg;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int brain, int body, int size, int weight,int eye,int leg,int tail,int teeth,String coat) { //we initialized both animal and dog parameters
        super(name, 1, 1, size, weight);  // super is a keyword. It is used inside a sub-class method definition to call a method defined in the super class.
    // above we added fixed values to parameters

        // initialization
        this.eye=eye;
        this.leg=leg;
        this.tail=tail;
        this.teeth=teeth;
        this.coat=coat;


        }
      public void chew(){
          System.out.println("dog.chew() is called");
      }
      // override // u can use code generator
    @Override
    public void eat() {
        System.out.println("Dog.chew() is called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("dog.walk() is called");
        move(5);  //or super.move();
    }

    public void run(){
        System.out.println("dog.run() is called");
        move(10);   // by using super it goes to another class and not execute below overload method even if we use the override method above this code it first goes to super
    }
    public  void legmove(int speed){
        System.out.println("dog.legmove() is called");
    }
     //override
    public void move(int speed){
        legmove(speed);
        System.out.println("dog.move() is called");
        super.move(speed);
    }
}
