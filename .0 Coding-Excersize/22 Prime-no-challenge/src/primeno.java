public class primeno {
    public static void mian(String[] args){
        isprimeno(2);
    }
    public static boolean isprimeno(int num){
        if(num==1){
            return false;

        } else{
            for(double i=2;i<=num/2;i++){
                if(num%2==0){
                    return false;
                }
            }
            return true;
        }
    }
}