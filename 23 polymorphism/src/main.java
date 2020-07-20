// 94 polymorphism
class movies{
    private String name;

    public movies(String name){
        this.name=name;
    }

    public String plot(){
        return "No plot is described";
    }

    public String getName(){
        return this.name;
    }

}

class bahubali extends movies{
//    public bahubali(String name) {
//        super(name);
//    }

    public bahubali() {
        super("bahubali");
    }
    public String plot(){
        return "prabhas, rana";
    }
}

class angi extends movies{

    public angi() {
        super("angi");
    }
    public String plot(){
        return "chiru,mahesh wife";
    }
}

class bairavadeepam extends movies{

    public bairavadeepam() {
        super("bairavadeepam");
    }
    public String plot(){
        return "balayya";
    }
}

class ega extends movies{
    public ega() {
        super("ega");
    }
    public String plot(){
        return "nani";
    }
}

class no1 extends movies{
    public no1() {
        super("no1");
    }
    public String plot(){
        return "mahesh";
    }
}




public class main {
    public static void main(String[] args) {
        for(int i=1; i<11; i++){
            movies movies = randommovies();
            System.out.println("movie #"+i+" : "+movies.getName()+" \n "+" plot : "+movies.plot()+" \n ");
        }

    }
    public static movies randommovies(){
        int randomnumber = (int) (Math.random()*5)+1;
        System.out.println("the random number generated was "+randomnumber);
        switch (randomnumber){
            case 1:
                return bahubali();

            case 2:
                return new angi();

            case 3:
                return new bairavadeepam();

            case 4:
                return new ega();

            case 5:
                return new no1();

//            default:
//                return null;
        }
        return null;
    }

}
