
import java.util.Arrays;

public class main{
    public static void main(String[] args){

        int[] array ={1,2,3,4,5,6,7,8,9,10};
        System.out.println("Array = "+ Arrays.toString(array));

        reverseintarray(array);
        System.out.println("Reverse Array = "+Arrays.toString(array));

    }
    public static void reverseintarray(int[] array){
        int indexvalue= array.length-1;
        int halfintarray =array.length/2;
        for(int i=0; i<halfintarray; i++){
            int temp = array[i];
            array[i] = array[indexvalue-i];
            array[indexvalue-i]=temp;
        }
    }

}

