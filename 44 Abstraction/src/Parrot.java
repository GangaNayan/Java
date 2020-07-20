public class Parrot extends Bird{

    public Parrot(String name){
        super(name);
    }

    @Override
    public void eat(){
         System.out.println(getName()+" is Eating ");
    }

    @Override
    public void breath(){
        System.out.println(getName()+" is Breathing ");
    }

    @Override
    public void fly(){
        System.out.println(getName()+ " if flying ");
    }

}