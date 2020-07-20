public class forchallenge {
    public static void main(String[] args){
       // for(double p=10;p<=20;p++)
          //  for(double t=2010;t<=2020;t++)
         for(double r=20;r>=1;r--){
             System.out.println("The simple interest for p=1000 and t=10 "+"and r="+r+" si = " +String.format("%.3f",+calculateintrest(10000,10,r)));
         }
         }

    public static double calculateintrest(double p,double t,double r){
        double si=(p*t*r)/100;
       // System.out.println(si);
        return si;
    }
}
