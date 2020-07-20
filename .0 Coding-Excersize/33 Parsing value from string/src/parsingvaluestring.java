public class parsingvaluestring {
    public static void main(String[] args){
        String mystring="2018.18a";   // java cannot take now this to add number to letter
        System.out.println("string"+mystring);

       // double number=Double.parseDouble(mystring);
        double number=Double.parseDouble(mystring);
        System.out.println("parsestring"+number);

        mystring +=1;
        number +=1;

        System.out.println("stringaddonne"+mystring);
        System.out.println("parsestringaddone"+number);
    }
}
