import java.util.Scanner;

public class main {
    private static Scanner scanner =new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the count"); //2
        int count =scanner.nextInt();
        scanner.nextLine();

        int[] returndarray=readintcount(count);
        int returnmin=findmin(returndarray);

        System.out.println("minimum value is = "+returnmin);

    }
    public static int[] readintcount(int count){ //1
        int[] array= new int[count];
        for(int i=0;i<array.length;i++){
            System.out.println("Enter the number :");
            int number =scanner.nextInt();
            scanner.nextLine();
            array[i]=number;

        }
        return  array;
    }

    public static int findmin(int[] array){ //3
        int min=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            int value=array[i];
            if(value<min){
                min=value;
            }
        }
        return min;
    }

}
