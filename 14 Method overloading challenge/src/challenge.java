public class challenge {
    public static void main(String[] args){
      double finalc= calculatefeetandinchesticentimeter(1,11);
      if(finalc<0.0){
          System.out.println("Invalid Parameter ");
      }
calculatefeetandinchesticentimeter(100);

    }
    public static double calculatefeetandinchesticentimeter(double feet,double inches){
        if(feet<0 || (inches<0 || inches>12)){
            return -1;
        }
        double centimeters=(feet*12)*2.54;
        centimeters +=inches*2.54;
        System.out.println(feet+" feet and "+inches+" inches = "+centimeters+" cm");
        return centimeters;
    }
    public static double calculatefeetandinchesticentimeter(double inches){
        if(inches<0){
            System.out.println("invalid parameter");
            return -1;
        }
        double feet=(int)inches/12;
        double remainingiches=(int)inches%12;
        System.out.println(inches+" Inches is equal to "+feet+" feet "+remainingiches+" inches");
        return calculatefeetandinchesticentimeter(feet,remainingiches);
    }

}
