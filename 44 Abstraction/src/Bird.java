import java.sql.SQLOutput;

public class Bird extends Animal implements CanFly{

    public Bird(String name){
        super(name);
    }

    @Override
    public void eat(){
       // System.out.println(getName()+" is Eating ");
    }

    @Override
    public void breath(){
        //System.out.println(getName()+" is Breathing ");
    }

    @Override
    public void fly(){
        //System.out.println(getName()+ " if flying ");
    }
}