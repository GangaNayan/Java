import java.util.Scanner;

public class list {
    public static Scanner sc=new Scanner(System.in);
    public static int[] baseint= new int[10];
    public static void main(String[] args){
        System.out.println("Enter 10 Integer values: ");
        getinteger();
        printint(baseint);
        resize();
//        System.out.println("Enter 12 integer values : ");
//        getinteger();
        baseint[10]=11;
        baseint[11]=12;
        printint(baseint);

    }

    public static void getinteger(){
        for(int i=0; i<baseint.length;i++){
            baseint[i]=sc.nextInt();
        }
    }

    public static void printint(int[] integer){
        for(int i=0; i<integer.length; i++){
            System.out.println(integer[i]+" ");
            System.out.println();
        }
    }

    public static void resize(){
        int[] original=baseint;
        baseint=new int[12];
        for(int i=0; i<original.length; i++){
            baseint[i] = original[i];
        }
    }

}
