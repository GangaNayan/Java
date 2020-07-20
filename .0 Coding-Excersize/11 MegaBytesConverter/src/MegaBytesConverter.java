public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int KiloBytes){
        if(KiloBytes < 0){
            System.out.println("Invalid Value");
        }
        else
        {
            int mb=(KiloBytes/1024);
            int rkb=(KiloBytes%1024);
            System.out.println(KiloBytes + " KB = "+ mb +" MB and "+rkb+" KB");
        }
    }

}