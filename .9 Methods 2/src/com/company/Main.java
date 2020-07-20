package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameover=true;
        int score=800;
        int levelcompleted=5;
        int bouns=100;
        calculatescore(gameover,score,levelcompleted,bouns);

        // game over is already there
        score=10000;
        levelcompleted=8;
        bouns=200;
        calculatescore(gameover,score,levelcompleted,bouns);
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

