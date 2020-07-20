// create a method called displayhighscoreposition
//it should be a player name as a parameter and a 2nd parameter as a position in the high score table
//you should display the players name along with a  message like " managed get in to position " and the
//position they got and a further message "oon high score table";
//create a 2nd method called calculatehighscoreposition
//it should be sent one argument only , the players score
//it should return an int
//the return data should be
//1 if the score is >1000  or >=1000    //the condition holds true for the given score but we give score 1000,500,100,and 50 we get bug in code so use >=
//2 if the score is >500 or >= and <1000
// 3 if the score is >100 or >= and <500
//4 if all other cases
//call both method and display the result of teh following
//a score of 1500,900,400, and 50

package com.company;

import javax.swing.plaf.SplitPaneUI;

public class Main {

    public static void main(String[] args) {

        int position=calculatehighscoreposition(1500);
        displayhighscoreposition("nayan",position);

        position=calculatehighscoreposition(900);
        displayhighscoreposition("ganga",position);

        position=calculatehighscoreposition(400);
        displayhighscoreposition("lakshmi",position);

        position=calculatehighscoreposition(50);
        displayhighscoreposition("narayana",position);

        position=calculatehighscoreposition(1000);
        displayhighscoreposition("vinutha",position);

    }
    public static void displayhighscoreposition(String playername,int position){
        System.out.println(playername+" Managed to get in to position "+position +" on high score table");

    }
    public static int calculatehighscoreposition(int playersscore){
        if(playersscore>=1000){
            return 1;
        }
        if((playersscore>=500)&&(playersscore<1000)){
            return 2;
        }
        if((playersscore>=100)&&(playersscore<500)){
            return 3;
        }
        else {
            return 4;
        }
    }
}
