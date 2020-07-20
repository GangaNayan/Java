
public class minutes {
    public static final String INVALID="invalid value";
    public static void main(String[] args) {
        System.out.println(getDurationString(150,5));
        System.out.println(getDurationString(7500 ));
    }


    public static String getDurationString(long minutes,long seconds) {
        if (minutes < 0 || (seconds < 0 || seconds > 59)) {
            System.out.println(INVALID);
        }
        long hours=minutes/60;
        long remainingminutes=minutes%60;
       // return hours+" h "+minutes+" min "+seconds+" sec"; or
        String hourstring=hours+"h";
        if(hours<=9){
            hourstring="0"+hourstring;
        }
        String minutestring=remainingminutes+"m";
        if(remainingminutes<=9){
            minutestring="0"+minutestring;
        }
        String secondstring=seconds+"s";
        if(seconds<=9){
            secondstring="0"+secondstring;
        }
        return hourstring+" "+remainingminutes+" "+secondstring;
    }
    public static String getDurationString(long seconds){
        if(seconds<0){
            System.out.println(INVALID);
        }
        long minutes=seconds/60;
        long remainingseconds=seconds%60;
        return getDurationString(minutes,remainingseconds);

    }

}