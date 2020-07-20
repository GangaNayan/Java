import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class main {
    public static void main (String[] args){
        LinkedList<String> placestovisit=new LinkedList<String>();
      addInoredr(placestovisit,"Bali");
      addInoredr(placestovisit,"switzerland");
      addInoredr(placestovisit,"Mount everest");
      addInoredr(placestovisit,"Green Land");
      addInoredr(placestovisit,"Ice Land");
      addInoredr(placestovisit,"Nail river");
      addInoredr(placestovisit,"India");

       printlist(placestovisit);
        visit(placestovisit);

    }
    private static void printlist(LinkedList<String> linkedList){
        Iterator<String> i=linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting "+i.next());
        }
        System.out.println("====================================");
    }

    private static boolean addInoredr(LinkedList<String> Linkedlist,String newCity){
        ListIterator<String> stringListIterator=Linkedlist.listIterator();

        while(stringListIterator.hasNext()){
            int comparission=stringListIterator.next().compareTo(newCity);
            if(comparission==0){
                // equal, do not add
                System.out.println(newCity+" is Already included as a Destination ");
                return  false;
            }else if(comparission>0){
                // new city should appear before this one
                //banglore --> anekal
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return  true;
            }else if(comparission<0){
                // move on next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static  void visit(LinkedList<String> cities){  //or LinkedList
        Scanner scanner=new Scanner(System.in);
        boolean quit=false;
        boolean goingForward=true;
        ListIterator<String > listIterator=cities.listIterator();

        if(cities.isEmpty()){
            System.out.println("No cities in the itenerary");
            return;
        }else {
            System.out.println("Now visiting "+listIterator.next());
            printmenu();
        }
        while (!quit){
            int action=scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Holiday (vacation) over");
                    quit=false;
                    break;
                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward=true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now visiting "+listIterator.next());
                    }else {
                        System.out.println("Reached the end of the list");
                        goingForward=false;
                    }
                    break;
                case 2:
                    if(goingForward){
                       if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward=false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting "+listIterator.previous());
                    }else{
                        System.out.println("we are at the start of teh List ");
                        goingForward=true;
                    }
                    break;
                case 3:
                    printmenu();
                    break;
            }
        }
    }
    private static void printmenu(){
        System.out.println("Available actions:\npress");
        System.out.println("0 - To quit\n"+
                           "1 - Go to next city\n"+
                           "2 - Go to previous city\n"+
                           "3 - Print menu options");
    }
}
