package com.company;

public class Main {

    public static void main(String[] args) {

        int position=calculateheighscore(1001);
        displayhighscore("Nayan",position);

         position=calculateheighscore(500);
        displayhighscore("Ganga",position);

        position=calculateheighscore(100);
        displayhighscore("Banga",position);

        position=calculateheighscore(50);
        displayhighscore("Tunga",position);


    }
    public static void displayhighscore(String playername,int position){
        System.out.println(playername+" Managed to get in the position  "+position+" on the high score table");
    }
    public static int calculateheighscore(int playerscore){
        if(playerscore>=1000){
            return 1;
        }
       else if(playerscore>=500 && playerscore<1000){
           return 2;
        }
        else if (playerscore>=100 && playerscore<500){
            return 3;
        }
        else{
            return 4;
        }

    }
}
