import java.util.Scanner;

public class maxmin {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
// or       int min=0;  using 0 that prints mini um value as 0
//        int max=0;
// or1       int min=200000;
//        int max=-200000;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        boolean first=true;

        while(true) {
            System.out.println("Enter the number: ");
            boolean isitint = sc.hasNextInt();
            if (isitint) {
                int number=sc.nextInt();
//  or              if(first){
//                    first=false;
//                    min=number;
//                    max=number;
//                }

                if(number>max){
                    max=number;
                }
                if(number<min){
                    min=number;
                }
            } else {
                break;
            }

        }
        System.out.println("min= "+min+" max= "+max);
        sc.nextLine();


        sc.close();
    }
}
