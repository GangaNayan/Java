import java.util.Scanner;

public class readinguserinupt {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Enter your yearofbirth: ");
        boolean hasNextInt = Scanner.hasNextInt();
        if (hasNextInt) {

            int yearofbirth = Scanner.nextInt();
            Scanner.nextLine();

            System.out.println("Enter your name: ");
            String name = Scanner.nextLine(); // make sure u use this nextLine() from popups
            int age = 2020 - yearofbirth;
            if (age >= 0 && age <= 100) {
                System.out.println("your name is " + name + " and you are " + age + " years old");
            } else {
                System.out.println("Invalid date of birth");
            }
            Scanner.close();

        }else{
            System.out.println("Unable to parse  the year");
        }

    }
}
