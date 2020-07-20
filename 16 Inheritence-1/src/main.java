public class main {
    public static void main(String[] args) {
        Animal animal=new Animal("Animal",1,1,50,50);
        Dog dog=new Dog("jordon",1,1,30,40,2,4,1,45,"normal");
        Fish fish=new Fish("fish",4,6,60,2,4);
       //dog.eat();
        dog.walk();
       //dog.run();
       fish.swim(8);
       fish.move(9);
    }
}
