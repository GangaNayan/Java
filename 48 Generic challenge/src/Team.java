import java.util.ArrayList;

public class Team<T extends Player>implements comparable<Team<T>>{
    private String name;
    private int played=0;
    private int won=0;
    private int lost=0;
    private int tied=0;

    public Team(String name){
        this.name=name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    private ArrayList<Team<T>> members=new ArrayList<>();

    public boolean addplayer(T player){
        if(members.contains(player)){
            System.out.println("Cannot add "+player.getName()+" Player already in Team");
            // ((Player)player).getName() type cast or Team<T extends Player>
            return false;
        }else{
            System.out.println(player.getName()+" added in to the Team "+this.name);
            // ((Player)player).getName() type cast or Team<T extends Player>
            return true;
        }
    }

    public int TeamSize(){
        return this.members.size();
    }

    public void matchressult(Team<T> opponent, int ourscore, int theirscore) {

        String message;
        if (ourscore > theirscore) {
            won++;
            message = " won";
        } else if (ourscore < theirscore) {
            lost++;
            message = " lost to ";
        } else {
            tied++;
            message = " Tied with ";
        }
        played++;
        if (opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            // won++ , lost++ , tied++ to work correctly
            opponent.matchressult(null,theirscore,ourscore);
        }
    }

    public int ranking(){
        return (won*2)+tied;
    }

    public int compareTo(Team team){
        if(this.ranking()>team.ranking()){
            return -1;
        }else if(this.ranking()<team.ranking()){
            return 1;
        }else {
            return 0;
        }
    }


}