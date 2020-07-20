
/* 1 HELLO WORLD PROGRAM
public class hello {
    public static void main(String[] args) {
    System.out.println("Hello, world");
int myfirstnumber=1+4+4+4+4+4;
        System.out.println(myfirstnumber);
        
    }
}

 */

// 2 VARIABLES
//STRING PROGRAM
// string literals   "hello" cannot be changed like variables int,boolean

/*public class hello{
    public static void main(String[] args) {
        String name = "mystring";
        System.out.println(name);
    }


}
>
public class hello{
  public static void main(String[] args) {
        String name;
        name="mystring";
        System.out.println(name);
    }
}
*/

// int program
/*
public class hello{
    public static void main(String[] args){
        int number=15;
        System.out.println(number);

    }
}
>
public class hello{
    public static void main(String[] args){
        int number;
        number=15;
        System.out.println(number);
    }
}
>
public class hello{
    public static void main(String[] args){
        int number=15;
        number=20;
        System.out.println(number);
    }
}
 > NOTE: ERROR?
public class hello{
    public static void main(String[] args){
        final int number=15;
        number=20; // will generate an error: cannot assign a value to a final variable
        System.out.println(number);
    }
}
*/

// Other types
/*
int number=15;
String name="hello";
float myfloat=9.99f;
double mydouble=99.99d;
char mychar='d';
boolean myboolean=true;
 */

// 3 Display of variables
 // String
/*
public class hello{
    public static void main(String[] args){
        String name="Nayan";
        System.out.println("hello " + name);
    }
}
>
public class hello{
    public static void main(String[] args){
        String first_name="Ganag ";
        String second_name="Nayan";
        System.out.println(first_name + second_name);
    }
}
*/

// Integer
/*
public class hello{
    public static void main(String[] args){
        int number=15;
        System.out.println(number+15);
    }
}
*/
/*
public class hello{
    public static void main(String[] args){
        int x=15;
        int y=15;
        System.out.println(x+y);
    }
}
>
public class hello{
    public static void main(String[] args){
        int _x=1, $y=2, z=3;
        System.out.println(_x+$y+z);
    }
}
*/
/*
public class hello{
    public static void main(String[] args){
        int firstnumber=(5+5)*(5*5)+(5+5);
        int secondnumber=30;
        int thirdnumber=firstnumber*2;
        int total=firstnumber+secondnumber+thirdnumber;
        int lastnumber=total-10;
        System.out.println(lastnumber);


    }
}
*/


// 4 Identifiers
/*
The variables are identified with unique names called as identifier
it is  in short names or descriptive names
x,y,z or sum,total,age

 NOTE: always use descriptive names to maintain code and understand code

 starts with leters,digits,dollar symbol,underscore and we can use them
 we should use lower case letters
 it is case sensitive
 we should not use java keywords as identifiers ex int or boolean etc
 */

// 5 Declaration statement
/*
that defines the variable by assigning the data types and names and values to the variables
ex: string mystring="hello";
 */

// 6 Expressions
/*
the construct that evaluates to single value
public class hello{
    public static void main(String[] args){
        int firstnumber=(5+5)*(5*5)+(5+5);
        int secondnumber=30;
        int thirdnumber=firstnumber*2;
        int total=firstnumber+secondnumber+thirdnumber;
        int lastnumber=total-10;
        System.out.println(lastnumber);
}
}
 */

// 7 DATA TYPES
/*
data types represents the size and type of the data in the identifiers
there are two types
1) primitive data types
2) non primitive data types

1)primitive data types
byte,short,int,long,float,double,boolean,char

2)non primitive data types
string,array,class etc

primitive data types two types
integer type (byte,short,int,long)

name       size      description
byte        1byte     it stores the whole numbers from -128 to 128
short       2byte      it stires the whole numbers 128*128+128*128
int         4byte
long        8byte
float       4byte     stores the factorial numbers it contains  6 to 7 decimal point
double      8byte     store the factorial  numbers it contains  15 decimal numbers
boolean     1bytes     true  or false
char        2byte      stores the single character 'A' or ASCII value

byte mybyte=100;
system.out.println(mybyte);

shore myshort=1000;
system.out.println(myshort);

int mybyte=100000;
system.out.println(myint);

long mylong=100000000;
system.out.println(mylong);

float myfloat=9.99f;
double mydouble=99.99d
system.out.println(myfloat);
system.out.println(mydouble);

       // scientific numbers
       float myfloat=99e3f;     99000.0
       double mydouble=99E4d;   990000.0

char mychar='a';
system.out.printlnl(mychar);

                // ASCII instaed of a , b , c
                char a=65, b=66, c 67;
                system.out.println(a);   prints a
                system.out.println(b);   prints b
                system.out.println(c);   prints c

boolean javaeasy=true;
boolean fishtasty=false;
system.out.println(javaeasy);    print true
system.out.println(fishtasty);   print false

2) non primitive data types
this type is called reference type because refers to the objects

in primitive data types which are predefined in java
non primitive data types which ar created by programmer not defined in java except string
non primitive data can b e used to call methods to perform certain operation but primitive cannot.
primitive data type has always a value but non primitive is null;
primitive starts with small letters and non primitive start with the big letters
primitive data size depends on the type of data used where in on primitive data types the size remains same

*/

// 8 TYPE CASTING
/*
in which assigning value of one primitive data type to other

there are two types of type casting
1) widening casting
2) narrowing casting

widening casting (automatic)
converting from smaller type to large type size
byte>short>char>int>long>float>double

public class hello{
 public static void main(String[] args){
     int myint=15;
     double mydouble=myint;
     System.out.println(myint);
     System.out.println(mydouble);  prints 15.0
 }
}

narrowing casting (manually)
converting from larger type size to smaller type size
double>float>long>int>char>short>byte

public class hello{
 public static void main(String[] args){
        double mydouble=9.0;
        int myint=(int) mydouble;
        System.out.println(mydouble);
        System.out.println(myint);     prints 9
    }
}
*/






