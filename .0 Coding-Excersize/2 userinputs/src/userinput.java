import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int count=0;
        int sum=0;

       // while (true){  //or
        while(count<10){
            int order=count+1;
            System.out.println("Enter the number #"+order+" : ");
             boolean hasNextInt=sc.hasNextInt();
             if(hasNextInt){
                 int number=sc.nextInt();
                 count++;
                 sum +=number;
//                 if(count==10){ //or
//                     break;
//                 }
             }else {
                 System.out.println("Enter valid number: ");
             }
             sc.nextLine();  // loop never ends and continues display Enter the number #"+order+" : and Enter valid number:


        }
        System.out.println("sum ="+sum);
        sc.close();
    }
}
