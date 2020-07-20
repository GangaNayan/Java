import java.util.Scanner;

public class ce27{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int sum=0;
        int count=0;
        double avg=0;

        while(true){
            System.out.println("Enter the number: ");
            boolean isitint=sc.hasNextInt();

            if(isitint){
                int number=sc.nextInt();
                count++;
                sum=sum+number;
            }else{
                break;
            }
            sc.nextLine();
        }
        avg=sum/count;
        System.out.println("sum= "+sum+"avg= "+avg);
        sc.close();
    }
}

