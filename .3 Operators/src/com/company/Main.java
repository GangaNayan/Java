//  14 operators
package com.company;

public class Main {

    public static void main(String[] args) {

        int result=1+2;
        System.out.println("1+2=" +result);  //1+2=3
        System.out.println("previous result= "+result );

        result=result-1;    //3-1=2
        System.out.println("3-1= " +result);

        result=result*50;    //2*50=100
        System.out.println("2*5= " +result);

        result=result/2;     //100/2=50
        System.out.println("100/2= "+result);

        result=result % 7; //remainder is 1
        System.out.println(result);

       result++; //1+1=2
        System.out.println("1+1= "+result);
       result--;  //2-1=1
        System.out.println("2-1= "+result);

        // result=result+2

        result +=2;    //1+2=3
        System.out.println("1+2= "+result);

        result -=1;    //3-1=2
        System.out.println("3-1=" +result);

        result *=5;     //2*5=10
        System.out.println("2*5= "+result);

        result /=2;  //10/2=5
        System.out.println("10/2= "+result);

        result %=2;
        System.out.println("5%2= "+result);

        // if-then rules
        boolean isaliean=false;
        if (isaliean==false){
            System.out.println("it is not alien");
            System.out.println("i sacred of aliens");

        int points=100;
        if (points!=100){
            System.out.println("he got highest points");
        }

        int points1=85;
        if (points1==100){
            System.out.println("he got o grade");
        }
        else if (points1<95){
            System.out.println("he did not got o grade");
        }

        // AND and OR operator

            int topscore=90;
        if ((topscore>=90) && (topscore<100)){        // the both right and lest condition should be satisfied
                System.out.println("cutoff for student to join comapny satisfied");

                if((topscore>90) || (topscore<100)){
                    System.out.println("any one condition satisfied");

                }
          boolean man=true;
                if(!man==true){
                    System.out.println("he is  human being");
                }
          boolean itscar=true;
                boolean wascar=(itscar) ? true : false;
                if(wascar){
                    System.out.println("yes its a car");
                }

                // challenge on operators
            double firstno=20.0d;
                double secondno=80.0d;
                double myresult =(firstno+secondno)*100.00d;
            System.out.println("the result is = "+myresult);
                double finalresult=myresult % 40;
            System.out.println("the  remainder is = "+finalresult);
                boolean lastresult=(finalresult==0) ? true : false;
            {
                System.out.println("the remainder is zero " + lastresult);
            }
                if (!lastresult){
                    System.out.println("got some remainder");
                }

            }
        }
    }
}
