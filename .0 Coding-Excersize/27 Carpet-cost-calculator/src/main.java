public class main {
    public static void main(String[] args) {
        Flore flore=new Flore(50,50);
        Carpet carpet=new Carpet(10);
        Calculation calculation=new Calculation(flore,carpet);

        System.out.println("total cost = "+calculation.gettotalcoast());
    }
}
