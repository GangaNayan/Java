import java.util.Scanner;

public class Generis {
    public static <G> void printg(G[] input){
        for(G element:input){
            System.out.println(element);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements in String");
        int n=sc.nextInt();
        String[] str=new String[n];

        System.out.println("Enter String Elements");
        for(int i=0; i<str.length; i++){
            str[i]=sc.nextLine();
        }

        printg(str);
    }
}
