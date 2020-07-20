import java.util.Arrays;

// primitive types are value type that holds values ex int,boolean,double
// non-primitive type are reference type ex array,String etc
public class main {
    public static void main(String[] args){
        // value type
        int myintvalue =10;
        int anotherintvalue = myintvalue;

        System.out.println("myinvalue = "+myintvalue);
        System.out.println("anotherinvalue = "+anotherintvalue);

        anotherintvalue++;

        System.out.println("myinvalue = "+myintvalue);
        System.out.println("anotherinvalue = "+anotherintvalue);

        /*  // when we created int variable this value type a single space in memory is allocated to store the value and
        that variable directly holds  the value now you sign it to another variable the value is copied directly and
         then both variables work independently each have their own copy of a specific value  */

        // reference type
        // reference is like address of some object in memory below myintarray is reference to the array in memory
        int[] myintarray =new int[5];
        int[] anotherarray = myintarray;

        System.out.println("myintarray = "+ Arrays.toString(myintarray));
        // built in java code that  prints all elements of an array by converting in to string
        System.out.println("anotherarray = "+ Arrays.toString(anotherarray));

        anotherarray[0]=1;

        System.out.println("after change myintarray = "+ Arrays.toString(myintarray));
        System.out.println("after change anotherarray = "+ Arrays.toString(anotherarray));

        anotherarray =new int[] {4,5,6,7,8}; // now we have two different references and memory
        modifyarray(myintarray);

        System.out.println("after modify myintarray = "+ Arrays.toString(myintarray));
        System.out.println("after modify anotherarray = "+ Arrays.toString(anotherarray));

    }

    private static void modifyarray(int[] array){
        array[0]=2;
        array =new int[] {1,2,3,4,5};
        // it dereferences nothing has change because it refers to main array
    }
}
