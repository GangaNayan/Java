public class player {
    public String fullname;
    public int health;
    public String weapon;

    public void loswhealth(int damage){
        this.health =this.health-damage;
        if(this.health<=0){

            System.out.println("player knocked out");

        }
    }
    public int healthremaining(){
        return this.health;
    }
}
