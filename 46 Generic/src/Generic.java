//public  class Generic <t1,t2>{
//    public  void printgenric(t1 value1,t2 value2){
//        //public static void printgenric(t1 value1,t2 value2){
//        // Generic cannot reference from static
//
//        System.out.println(value1+" "+value2);
//    }
//
//    public static void main(String[] args) {
//        Generic<String,Integer> g1=new Generic<>();
//
////    or  <String,String>
//        //<Character,Double>
//        g1.printgenric("Nayan",77);
//
//    }
//}

public  class Generic <t1,t2>{
    public  void printgenric(t1[] value1,t2[] value2){
        //public static void printgenric(t1[] value1,t2[] value2){
        // Generic cannot reference from static

       for(t1 ele1:value1){
           System.out.println(ele1);
       }

        for(t2 ele2:value2){
            System.out.println(ele2);
        }
    }

    public static void main(String[] args) {

        String[]  str1={"gdff","tefgfg","ygeyfgrfy"};
        Integer[] int1={1,2,3,4,5,6};

        Generic<String,Integer> g1=new Generic<>(); // or Character,Double
        g1.printgenric(str1,int1);


    }
}


