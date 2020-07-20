// 95 polymorphism challenge
class car{
    private String name;
    private int cylinder;
    private int wheels;
    private boolean engine;

    public car(String name,int wheels){
        this.name=name;
        this.wheels=wheels;
        this.cylinder=2;
        this.engine=true;
    }

    public String startengine(){
        return "car --> startengine():";
    }

    public String accelerate(){
        return "car -->accelerate():";
    }

    public String brake(){
        return "car -->brake():";
    }

    public String getName() {
        return name;
    }

//    public int getCylinder() {    already initialized
//        return cylinder;
//    }

    public int getWheels() {
        return wheels;
    }

//    public boolean isEngine() {  already initialized
//        return engine;
//    }
}

class tata extends car{
    public tata(String name, int wheels) {
        super(name, wheels);
    }

    @Override
    public String startengine() {
      //  return super.startengine(); to call base class
        return "tata--> startengine()";
    }

    @Override
    public String accelerate() {
        return "tata--> accelerate()";
    }

    @Override
    public String brake() {
        return "tata--> brake()";
    }
}

//    // refacot >> move >> make inner class of  >> main
    class holden extends car{
      public holden(String name, int wheels) {
           super(name, wheels);
      }

        @Override
        public String startengine() {
           //  return super.startengine(); to call base class
            return "main.holden--> startengine()";
       }
        @Override
       public String accelerate() {
           return "main.holden--> accelerate()";
        }
      @Override
       public String brake() {
           return "main.holden--> brake()";
       }
   }



public class main {
    public static void main(String[] args) {

        car car = new car("car 2020", 4);
        System.out.println(car.getName());
        System.out.println(car.getWheels());
        System.out.println(car.startengine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        tata tata = new tata("tata nano", 4);
        System.out.println(tata.getName());  // refactor >> rename
        System.out.println(tata.getWheels());
        System.out.println(tata.startengine());
        System.out.println(tata.accelerate());
        System.out.println(tata.brake());

        holden holden= new holden("holden nano", 4);
        System.out.println(holden.getName());  // refactor >> rename
        System.out.println(holden.getWheels());
        System.out.println(car.startengine()); // prints car.startengine

        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

        // refactor >> copy class name
        //refactor >> inline class
        car swift = new car("swift nano", 4) {
            @Override
            public String startengine() {
              //  return super.startengine(); to call base class
                return "swift--> startengine()";
            }

            @Override
            public String accelerate() {
                return "swift--> accelerate()";
            }

            @Override
            public String brake() {
                return "swift--> brake()";
            }
        };
        System.out.println(swift.getName());  // refactor >> rename
        System.out.println(swift.getWheels());
        System.out.println(swift.startengine());
        System.out.println(swift.accelerate());
        System.out.println(swift.brake());

    }

//    // refacot >> move >> make inner class of  >> main
//    static class holden extends car{
//        public holden(String name, int wheels) {
//            super(name, wheels);
//        }
//
//        @Override
//        public String startengine() {
//            //  return super.startengine(); to call base class
//            return "main.holden--> startengine()";
//        }
//
//        @Override
//        public String accelerate() {
//            return "main.holden--> accelerate()";
//        }
//
//        @Override
//        public String brake() {
//            return "main.holden--> brake()";
//        }
//    }
}
