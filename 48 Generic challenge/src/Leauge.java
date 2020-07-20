import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leauge<T extends Team> {
    private String name;
    private List<T> leauge =new ArrayList<>();

    public Leauge(String name){
        this.name=name;
    }

    public boolean addteam(T team){
        if(leauge.contains(team)){
            System.out.println("Team already exists");
            return false;
        }else{
            leauge.add(team);
            System.out.println(team.getName()+" added to the Leauge "+this.name);
            return true;
        }
    }

    public void leaguetable(){
       Collections.sort(leauge,Team::compareTo);

       //Collections.sort(teams, Team::compareTo)
        for(T t: leauge){
            System.out.println(t.getName()+" : "+t.ranking());
        }
    }
}
