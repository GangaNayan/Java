import java.util.ArrayList;

public class autobox {
    public static void main(String[] args){
        int[] myarrayintn=new int[10];
        String[] myarrayString=new String[100];
        ArrayList<String> myarrayListString=new ArrayList<String>();
        myarrayListString.add("hello");

       // ArrayList<int> myintarraylist=new ArrayList<int>();
        // we can't use primitive  data types in Arraylist<> only no-primitive data types can be used
        // all primitive data types are not class
        // all non-primitive data types are class

        ArrayList<myint> myintarraylist=new ArrayList<myint>();
        myintarraylist.add(new  myint(50));  // very class we have to have object

        ArrayList<Integer> myIntegerArrayList=new ArrayList<Integer>();
        myIntegerArrayList.add(50);

        ArrayList<Integer> value=new ArrayList<Integer>();
        for(int i=0; i<=10; i++){
            value.add(Integer.valueOf(i)); //i
            // value.add(1,23); (index,element)
        }
        for(int i=0; i<=10; i++){
            System.out.println(i+" --> "+value.get(i).intValue()); // .intValue() optional
        }

        Integer myintvalue2=56;            // =Integer.valueOf(56);
        int myint=myintvalue2.intValue();  // .intValue() is option jvm add automatically

        ArrayList<Double> myDouble1 =new ArrayList<Double>();
        for(double dbl=0.0; dbl<=10.0; dbl +=0.5){
            myDouble1.add(Double.valueOf(dbl)); // dbl shortcut
            // Double.valueOf(dbl) is Autoboxing we converting the primitive
            // type double to the object Wrapper to the object in other words
        }
        for(int i=0; i<=myDouble1.size(); i++){
            double doublevalue=myDouble1.get(i).doubleValue();// .doubleValue() optional
            System.out.println(i+" --> "+doublevalue);
            //  .doubleValue() we are unboxing we are converting from
            //  the object the object wrapper back into the primitive
            //  type of this case double which is value
        }

    }
}
class myint{
    private int myvalue;

    public myint(int myvalue) {
        this.myvalue = myvalue;
    }

    public int getMyvalue() {
        return myvalue;
    }

    public void setMyvalue(int myvalue) {
        this.myvalue = myvalue;
    }
}
