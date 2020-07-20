public class hello {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 10; i < 51; i++) {
           if(isprimeno(i)){
               count++;
               System.out.println("prime numbers are = "+i);
            if(count>10){
                System.out.println("no of counts");
                break;
            }
           }
        }
    }
    public static boolean isprimeno(int num){
        if (num == 1) {
            return false;

        }
        for (double i = 2; i <=(long) Math.sqrt(num); i++) { // num / 2 we use math.sqrt for code optimization
            System.out.println("looping"+i);  // print the number of looping
            if (num % 2 == 0) {
                //System.out.println("false");
                return false;
            }


        }

        //System.out.println("true");
        return true;

    }


}