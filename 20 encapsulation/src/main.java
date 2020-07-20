public class main {
    public static void main(String[] args) {
//        player player=new player();
//        player.fullname="nayan";
//        player.health=20;
//        player.weapon="sward";
//
//        int damage=10;
//        player.loswhealth(damage);
//        System.out.println("remaining health = "+player.healthremaining());
//
//        damage=11;
//        player.health=200; // adding health ?
//        player.loswhealth(damage);
//        System.out.println("remaining health = "+player.healthremaining());


        Enhancedplayer player =new Enhancedplayer("nayan",100,"sward");
        System.out.println("Initial health is "+player.getHitpoint());

    }


}
