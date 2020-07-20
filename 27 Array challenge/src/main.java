import java.util.Arrays;
import java.util.Scanner;

public class main {
    private static Scanner scanner=new Scanner(System.in);
    public static  void main(String[] args){
        int[] myintarray=getineger(10);
        int[] sort=sortarray(myintarray);
       // System.out.println(sort);
        printarray(sort);
       // Arrays.toString(sort);
       // why not used ? System.out.println(sort);
    }

    public static int[] getineger(int number){
        int[] array=new int[number];
        System.out.println("Enter "+number+" Integer values\r");
        for(int i=0; i<array.length;i++){
          array[i]=scanner.nextInt();
        }
        return array;
    }

    public static void printarray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println("Enterd "+i+" value is "+array[i]);
        }
    }

    public static int[] sortarray(int[] array){
        int[] sortedarray= new int[array.length];
        for(int i=0; i<array.length; i++){
            sortedarray[i]=array[i];
        }
        boolean flag= true;
        int temp;
        while(flag){
            flag =false;
            for(int i=0; i<sortedarray.length-1; i++){
                if(sortedarray[i]<sortedarray[i+1]) {
                    temp = sortedarray[i];
                    sortedarray[i] = sortedarray[i+1];
                    sortedarray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedarray;
    }

}
