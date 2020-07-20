public class Main {
    public static void main(String[] args){

        Leauge<Team<FootballPlayer>> f1=new Leauge<>("AFL");

        Team<FootballPlayer> ffulls=new Team<>("Fulls");
        FootballPlayer fnayan=new FootballPlayer("Nayan");
        ffulls.addplayer(fnayan);

        Team<FootballPlayer> ffulls1=new Team<>("Fulls1");
        FootballPlayer fhasi=new FootballPlayer("Hasi");
        ffulls1.addplayer(fhasi);
        FootballPlayer fdhasi=new FootballPlayer("DHasi");
        ffulls1.addplayer(fdhasi);

        Team<FootballPlayer> ffulls2=new Team<>("Fulls2");
        FootballPlayer fjaru=new FootballPlayer("Jaru");
        ffulls2.addplayer(fjaru);

        Team<FootballPlayer> ffulls3=new Team<>("Fulls3");
        FootballPlayer fkassi=new FootballPlayer("Kassi");
        ffulls3.addplayer(fkassi);


        ffulls.matchressult(ffulls1,5,3);
        ffulls.matchressult(ffulls2,2,3);
        ffulls.matchressult(ffulls3,2,4);

        ffulls1.matchressult(ffulls,4,3);
        ffulls1.matchressult(ffulls1,5,3);
        ffulls1.matchressult(ffulls2,2,3);

        ffulls2.matchressult(ffulls,4,3);
        ffulls2.matchressult(ffulls1,5,3);
        ffulls2.matchressult(ffulls3,9,4);

        ffulls3.matchressult(ffulls,4,3);
        ffulls3.matchressult(ffulls1,2,3);
        ffulls3.matchressult(ffulls2,1,3);

        f1.addteam(ffulls);
        f1.addteam(ffulls1);
        f1.addteam(ffulls2);
        f1.addteam(ffulls3);

        f1.leaguetable();
    }
}
