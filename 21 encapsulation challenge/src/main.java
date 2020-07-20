// MAIN.JAVA
public class main {
    public static void main(String[] args){
        Wall wall1 =new Wall("west");
        Wall wall2 =new Wall("East");
        Wall wall3 =new Wall("south");
        Wall wall4 =new Wall("North");

        Ceilng ceilng = new Ceilng(12,15);
        Bed bed=new Bed("modern","4",3,2,1);
        Lamp lamp=new Lamp("classic",false,75);
        Bedroom bedroom=new Bedroom("Nayan","wall1","wall2","wall3","wall4",ceilng,bed,lamp);

        bedroom.makebed();
        bedroom.getLamp().turnon();

    }
}
