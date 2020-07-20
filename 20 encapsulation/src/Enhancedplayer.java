public class Enhancedplayer {
    private String fullname;
    private int hitpoint;
    private String weapon;

    public Enhancedplayer(String fullname, int health, String weapon) {
        this.fullname = fullname;
        if(health>0 && health<=100) {
            this.hitpoint = health;
        }
        this.weapon = weapon;
    }

    public void loswhealth(int damage){
        this.hitpoint =this.hitpoint -damage;
        if(this.hitpoint <=0){

            System.out.println("player knocked out");

        }
    }

    public int getHitpoint() {
        return hitpoint;
    }
}
