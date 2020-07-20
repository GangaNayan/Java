package com.company;

public class Main {

    public static void main(String[] args) { // void is the non return value or it wont return any value


        calculatescore(true,800,5,100);
        //below one optional it is used for better understand of code
        boolean gameover=true;
        int score=800;
        int levelcompleted=5;
        int bouns=100;

      calculatescore(true,10000,8,200);
    }
    // After end of main method u start another main method
    public static int calculatescore(boolean gameover,int score,int levelscompleted,int bonus){

        if (gameover) { //or if (gameover == true)
            int finalscore = (score + (levelscompleted * bonus));
            finalscore +=1000;
            System.out.println("the final score is = " + finalscore);
            return finalscore;    // returns the value in main method we wanted
        }
        return -1;    // Many methods in standard Java classes return - 1 in order to tell you “couldn't find the thing you were looking for
    }
}


