package org.package_143; // or we can use in any other project

// or import com.package_143.*;
import com.package_143.ISaveable;
import com.package_143.Monster;
import com.package_143.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Player nayan=new Player("Nayan",55,100);
        System.out.println(nayan);
        savevalues(nayan);

        nayan.setName("vinu");  // modification
        nayan.setHitpoints(56);
        System.out.println(nayan);  // we are printing toString()
        savevalues(nayan);          // we printing saved values

        //   loadvalue(nayan);    // we are loading values but not printing it
        System.out.println(nayan);  // now we are printing loaded value

//        Monster monster=new Monster("ganaga",56,678);
//        System.out.println("Monster Strength = "+monster.getStrength());

//       if you want to declare a variable that can hold objects of different
//       types that could have type of common interface

//      if we want to access methods that exist in the class like getStrength
//      then object will have to  be declared as class type itself

        ISaveable monster=new Monster("ganga",56,678);
        System.out.println("Monster Strength ="+((Monster)monster).getStrength());
        System.out.println(monster);
        savevalues(monster);

        loadvalue(monster);
        System.out.println(monster);
    }

    public static ArrayList<String> raedvalues(){
        ArrayList<String> values=new ArrayList<String>();

        Scanner scanner=new Scanner(System.in);
        boolean quit=false;
        int index=0;
        System.out.println("Choose Option \n"
                +" 0 to quit \n"
                +" 1 to Enter the value");
        while (!quit){
            System.out.println("Choose an option \n");
            int intvalue=scanner.nextInt();
            scanner.nextLine();
            switch (intvalue){
                case 0:
                    quit=true;
                    break;
                case 1:
                    System.out.println("Enter the String");
                    String stringinput=scanner.nextLine();
                    values.add(index,stringinput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void savevalues(ISaveable values){
        for(int i=0; i<values.write().size(); i++){
            System.out.println("Saved "+values.write().get(i)+" to the Memory");
        }
    }

    public static void loadvalue(ISaveable savedvalue){
        ArrayList<String> value=raedvalues();
        savedvalue.read(value);
    }
}

