public class NumberToWords {

    public static void numberToWords(int number){
        if(number<0){
            System.out.println("Invalid Value");
        }
        if(number==0){
            System.out.println("Zero");
        }
        int reversed=reverse(number);
        int numbercount=getDigitCount(number);
        int reversecount=getDigitCount(reversed);
        while (reversed>0){
            int lastdigitreversed=reversed%10;
            switch (lastdigitreversed){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                    //reversedno=reversedno/10; can't reach
            }
            reversed=reversed/10;
        }
        while(numbercount>reversecount){  //Because when we reverse 100 we get 001 in switch statement we get 001 as "One" but we want to print as "Zero Zero One" in that case we using this count
            System.out.println("Zero");
            reversecount++;
        }


    }
    public static int reverse(int numbertoreverse) { // we are not taking int number as parameter directly here  because the number will change when we reverse it
        int reversedno = 0;
        while (numbertoreverse != 0) {
            int lastdigitno = numbertoreverse % 10;
            reversedno = (reversedno * 10) + lastdigitno;
            numbertoreverse = numbertoreverse / 10;
        }
        return reversedno;
    }
    public static int getDigitCount(int number){
        if(number<0){
            return -1;
        }
        if(number==0){
            return 1;
        }
        int digitcount=0;
        while (number>0){
            digitcount++;
            number=number/10;
        }
        return digitcount;


    }

}
