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
//       if(playersscore>=1000){
//          return 1;
//       }
//       if(playersscore>=500){  //&&(playersscore<1000)){   you can also use this we optimized code based on first condition
//            return 2;
//        }
//        if(playersscore>=100){  //&&(playersscore<500)){
//            return 3;
//        }
//        else {          //u can remove the else statement and code block yhat means the code directly jumps to return 4!
//            return 4;
//        }

        // we can also write like this
        int positon=4;    //we assume the position is 4
        if(playersscore>=1000){
            positon =1;
        }
         else if(playersscore>=500){
            positon=2;
        }
          else if(playersscore>=100){
            positon=3;
        }
        return positon;

    }
}

