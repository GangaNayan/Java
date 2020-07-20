// if and nested if statement
package com.company;

public class Main {

    public static void main(String[] args) {
	double number =100;
	if (number<150){    // if satatement
        System.out.println("the number is less than 150");
    }
	 if(number>=100){  // nested if statement
            System.out.println("the number is equal to 100");
	 }

// if else satement

        int myno=101;
	 if(myno<=100){
         System.out.println("the number is not grater than 100");
     }
	 else{
         System.out.println("the number is grater than 100");
     }

// if else if statement

      int mynum=10000;
	 if((mynum>=1) && (mynum<9)) {
            System.out.println("its one digit number");
        }
        else if((mynum>=10) && (mynum<=99)){
            System.out.println("its two digit number");
        }
        else if((mynum>=100) && (mynum<=999)){
            System.out.println("its three digit number");
        }
        else if((mynum>=1000)&&(mynum<=9999)){
            System.out.println("its four digit number");
        }
        else {
            System.out.println("the number is not in range of '1 to 9999'");

// challenge
        boolean gameover=true;
        int score=800;
        int levelscompleted=8;
        int bonus=800;

        if(gameover==true){     // or u can also write iff condition as if(gameover) that takes true value
            double finalscore=(score+(levelscompleted*bonus));
            System.out.println("the final score is = "+finalscore);
        }

        double lastfinal=finalscore; //displays error because it is out side of the if condition code block

         // here we duplicated by copying same from above but any changes made above should make changes below also so dont follow this
          gameover=true;
         score=800;
         levelscompleted=8;
          bonus=800;

         if(gameover==true) {
             double finalscore = (score + (levelscompleted * bonus));
             System.out.println("the final score is = " + finalscore);
         }
        }

    }
}
