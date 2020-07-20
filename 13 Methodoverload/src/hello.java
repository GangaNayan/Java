import java.sql.SQLOutput;
/*
Method overloading: The method overloading allows the class to have same method name but with different parameter name
 */
public class hello {
    public static void main(String[] args){
      int finalscore=calculatescore("nayan",500);
      System.out.println(finalscore); // here only return type is printed
        int finalscore1=calculatescore(800);
        System.out.println(finalscore1); // here only return type is printed
        calculatescore();

    }
    public static int calculatescore(String playername,int score){
        System.out.println("player "+playername+" scored "+score+" points");
        return score*1000;
    }
    public static int calculatescore(int score){
        System.out.println("player scored "+score+" points");
        return score*1600;
    }
    public static int calculatescore() {
        System.out.println("no player no points");
        return -1;
    }


}

