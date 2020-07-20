public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking,int hourofDay){
        if(hourofDay>=0 && hourofDay<=23){
            if(barking==true && hourofDay<8 || hourofDay>22){
                System.out.println("true"); // this print is optional to display that we got true value we use sout
                return true;

            }
        }
        System.out.println("false");
        return false;

    }

}