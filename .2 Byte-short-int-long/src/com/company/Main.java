//NOTE: CTRL+R EASY REPLACEMENT
// 9 WRAPPER CLASESS , OVERFLOW AND UNDERFLOW
/*
WRAPPER CLASESS
it is used in the 8 primitive data types ex in int we use Integer by doing this provides ways o perform the operations on int is called as wreapper class

OVERFLOW AND UNDERFLOW
when we assign the value to the datatype that is larger than the maximum value is called as overflow
when we assign the value to the datatype that is lesser than the minimum value is called as underflow

package com.company;
public class Main {
	public static void main(String[] args) {
	int myintvlaue=1000;
	int mymaxintvalue=Integer.MAX_VALUE;  // WRAPPER CLASESS
	int myminintvlaue=Integer.MIN_VALUE;
	System.out.println("the maximum value of int = " +mymaxintvalue); // OVERFLOW
	System.out.println("the minimum value of int = " +myminintvlaue); // UNDERFLOW
	System.out.println("burst max value = " +(mymaxintvalue+1));
	System.out.println("burst min value = " +(myminintvlaue-1));

	int mymaxtest=2147483648;  // < ERROR? INTEGER NUMBER IS TOO LARGE IT SHOULD BE BTW -2147483647 TO 2147483647
		 int maxtest=2_14_74_83_647;
		System.out.println(maxtest);  // USE THIS SAME TESTING METHOD FOR ALL INTEGER PRIMITIVE NUMBERS
	}
}
*/
/*
package com.company;
public class Main {
	public static void main(String[] args) {
		//int
		int myintvlaue=1000;
		int mymaxintvalue=Integer.MAX_VALUE;  // WRAPPER CLASESS
		int myminintvlaue=Integer.MIN_VALUE;
		System.out.println("the maximum value of int = " +mymaxintvalue); // OVERFLOW
		System.out.println("the minimum value of int = " +myminintvlaue); // UNDERFLOW
		System.out.println("burst max value = " +(mymaxintvalue+1));
		System.out.println("burst min value = " +(myminintvlaue-1));
		
		//byte
		byte mybytevlaue = 100;
		byte mymaxbytevalue = Byte.MAX_VALUE;  // WRAPPER CLASESS
		byte myminbytevlaue = Byte.MIN_VALUE;
		System.out.println("the maximum value of byte = " + mymaxbytevalue); // OVERFLOW
		System.out.println("the minimum value of byte = " + myminbytevlaue); // UNDERFLOW
		System.out.println("burst max value = " + (mymaxbytevalue + 1));
		System.out.println("burst min value = " + (myminbytevlaue - 1));


		//short
		short myshortvalue=1000;
		short mymaxshortvalue =Short.MAX_VALUE;  // WRAPPER CLASESS
		short myminshortvlaue =Short.MIN_VALUE;
		System.out.println("the maximum value of short = " + mymaxshortvalue); // OVERFLOW
		System.out.println("the minimum value of short = " + myminshortvlaue); // UNDERFLOW
		System.out.println("burst max value = " + (mymaxshortvalue + 1));
		System.out.println("burst min value = " + (myminshortvlaue - 1));

		//long
		long mylongvalue=100L;       <IMPORTANT NOYE USE L FOR LONG IF YOU USE SMALL NUMBERS LIKE 100
		long mymaxlongvalue =Long.MAX_VALUE;  // WRAPPER CLASESS
		long myminlongvlaue =Long.MIN_VALUE;
		System.out.println("the maximum value of long = " + mymaxlongvalue); // OVERFLOW
		System.out.println("the minimum value of long = " + myminlongvlaue); // UNDERFLOW
		System.out.println("burst max value = " + (mymaxlongvalue + 1));
		System.out.println("burst min value = " + (myminlongvlaue - 1));
	}
}
*/

// 10 CASTINNG
/*
    int mynewintvlue =(mymaxintvalue/2);
    byte mynewbytevalue= (byte) (mybytevlaue/2);
    short mynewshortvalue=(short)(myshortvalue/2);
 */

// Float and Double
/*
package com.company;
public class Main {
    public static void main(String[] args) {
        float myfloatvalue = 9.9f;
        float mymaxfloatvalue = Float.MAX_VALUE;
        float myminfloatvalue = Float.MIN_VALUE;
        System.out.println("maximum  value of float= " + mymaxfloatvalue);
        System.out.println("minimum vlaue of float= "+ myminfloatvalue);

        double mydoublevalue = 9.9f;
        double mymaxdoublevalue = Double.MAX_VALUE;
        double mymindoublevalue = Double.MIN_VALUE;
        System.out.println("maximum  value of double= " + mymaxdoublevalue);
        System.out.println("minimum vlaue of double= "+ mymindoublevalue);

        int myint=15;
        float myfloat=(float)15.25;
        float myloat1=15.25f;
        double mydouble=15.25d;
        System.out.println(myint);
        System.out.println(myfloat);
        System.out.println(mydouble);
        System.out.println(myloat1);

        int myint=15/2;
        float myfloat=(float)15.25 / 2;
        float myloat1=15.25f / 2f;
        double mydouble=15.25d / 2d;
        System.out.println(myint);
        System.out.println(myfloat);
        System.out.println(mydouble);
        System.out.println(myloat1);
    }
}
*/
// challenge convert pounds to kilograms
/*
package com.company;
public class Main{
    public static void main(String[] args){
        double pounds=200d;
        double covertedkilogram = pounds*0.45359237d;
        System.out.println("coverted kilogram = "+covertedkilogram);
    }
}
*/

// 11 ALWAYS USED FLOAT AND DOUBLE FOR SIMPLE PROBLEMS NOT FOR CHANE IN CURRENCY WE USE BIGDECIMAL
// 12 char and  boolean
/*
package com.company;
public class Main{
    public static void main(String[] args){
        char myunicode= '\u0CA8';
        char myunicode1='ನ';
        char myunicode2= '\u0FD8';
        System.out.println(myunicode);
        System.out.println(myunicode1);
        System.out.println(myunicode2);

        boolean mytrueboolean=true;
        boolean myfalseboolean=false;
        boolean mynumber=1;
        boolean mynumber1=0;
    }
}
*/
// 13 String data special 9th primitive type considered as special type as class
/*
// this type of string implementation is not efficient we learn this next in string buffer !
package com.company;
public class Main{
    public static void main(String[] args){
        String mystring="this is string ";
        String myunicode="\u0044";
         String mynewstring=mystring+ "this is also string";
        mynewstring=mynewstring+" adding another string "+myunicode;
        int myint=115;
        mynewstring=mynewstring+" "+myint;
        double mydouble=77.12;   //here the int and double values are not adding because java intelligently assumes that
                                            //its string(the first assigned type is string adding any value becomes string type only
        mynewstring=mynewstring+mydouble;
        System.out.println(mynewstring);
    }
}
*/






