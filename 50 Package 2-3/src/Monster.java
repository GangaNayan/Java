package com.package_143;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {

    private String name;
    private int hitpoints;
    private int Strength;

    public Monster(String name, int hitpoints, int Strength){
        this.name=name;
        this.hitpoints=hitpoints;
        this.Strength=Strength;

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


    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitpoints=" + hitpoints +
                ", Strength=" + Strength +'\''+
                '}';
    }

    public List<String> write(){
        ArrayList<String> value=new ArrayList<String>();
        value.add(0,this.name);
        value.add(1," "+this.hitpoints); // to convert int to String use " "+this.integer
        value.add(2," "+this.Strength);

        return value;
    }

    public void read(List<String> savedvalue){
        if(savedvalue !=null && savedvalue.size()>0){
            this.name=savedvalue.get(0);
            this.hitpoints=Integer.parseInt(savedvalue.get(1));
            this.Strength = Integer.parseInt(savedvalue.get(2));

        }
    }

}

