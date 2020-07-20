import java.util.Scanner;

public class main {
    private static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        int[] myarrayint = new int[10];
        myarrayint[0] =1;
        myarrayint[1] =2;
        myarrayint[2] =3;
        myarrayint[3] =4;
        System.out.println(myarrayint[0]);

        double[] mydoubleint = new double[10];
        mydoubleint[0] =1;
        mydoubleint[1] =2;
        mydoubleint[2] =3;
        mydoubleint[3] =4;
        System.out.println(mydoubleint[0]);

        int[] myarray2int = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(myarray2int[8]);
        System.out.println(myarray2int[9]);

        int[] myarrayint3 = new int[11];
        for(int i=0;i<myarrayint3.length;i++){
            myarrayint3[i] =i*10;
        }
        for(int i=0;i<myarrayint3.length;i++){
            System.out.println("Element "+i+" value is "+myarrayint3[i]);
        }

        // sum and average
        int[] myintarray4=getIntegers(5);
        for(int i=0;i<myintarray4.length;i++){
            System.out.println("Elemennt "+i+" typed value is "+myintarray4[i]);
        }
        System.out.println("average ="+intaverage(myintarray4));
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter "+number+" integer values\r");
        int[] value=new int[number];
        for(int i=0;i<value.length;i++){
            value[i]=scanner.nextInt();
        }
        return  value;
    }

    public static double intaverage(int[] array){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum +=array[i];
        }
        return (double) sum / (double) array.length;
    }

}
