import org.w3c.dom.ls.LSOutput;

public class minutes {
    public static void main(String[] args) {
        System.out.println(getDurationString(120,00));
        System.out.println(getDurationString(7200 ));
    }


    public static String getDurationString(long minutes,long seconds) {
        if (minutes < 0 || (seconds < 0 || seconds > 59)) {
            System.out.println("Invalid value");
        }
        long hours=minutes/60;
        long remainingminutes=minutes%60;
        return hours+" h "+minutes+" min "+seconds+" sec";
        }
    public static String getDurationString(long seconds){
        if(seconds<0){
            System.out.println("invalid value");
        }
        long minutes=seconds/60;
        long remainingseconds=seconds%60;
        return getDurationString(minutes,remainingseconds);

    }

    }

