import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Player implements ISaveable {

    private String name;
    private int hitpoints;
    private int Strength;
    private String Weapon;

    public Player(String name,int hitpoints,int Strength){
        this.name=name;
        this.hitpoints=hitpoints;
        this.Strength=Strength;
        this.Weapon="Knife";
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getHitpoints(){
        return hitpoints;
    }

    public void setHitpoints(int hitpoints){
        this.hitpoints=hitpoints;
    }

    public int getStrength(){
        return Strength;
    }

    public void setStrength(int Strength){
        this.Strength=Strength;
    }

    public String getWeapon(){
        return Weapon;
    }

    public void setWeapon(String weapon){
        this.Weapon=Weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitpoints=" + hitpoints +
                ", Strength=" + Strength +
                ", Weapon='" + Weapon + '\'' +
                '}';
    }

    public List<String> write(){
        ArrayList<String> value=new ArrayList<String>();
        value.add(0,this.name);
        value.add(1," "+this.hitpoints); // to convert int to String use " "+this.integer
        value.add(2," "+this.Strength);
        value.add(3,this.Weapon);

        return value;
    }

    public void read(List<String> savedvalue){
        if(savedvalue !=null && savedvalue.size()>0){
            this.name=savedvalue.get(0);
            this.hitpoints=Integer.parseInt(savedvalue.get(1));
            this.Strength = Integer.parseInt(savedvalue.get(2));
            this.Weapon=savedvalue.get(3);
        }
    }

}

