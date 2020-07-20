import java.util.ArrayList;
import java.util.Scanner;

public class main {

    private static Scanner scanner =new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit =false;
        int choice =0;
        printInstruction();
        while (!quit){
            System.out.println("Enter your choice");
            choice =scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstruction();
                    break;

                case 1:
                    groceryList.printGroceryList();
                    break;

                case 2:
                    add();
                    break;
                case 3:
                    modify();
                    break;
                case 4:
                    remove();
                    break;
                case 5:
                    find();
                    break;
                case 6:
                    processarraylist();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }

    }

    public  static void printInstruction(){
        System.out.println("\nPress");
        System.out.println("\t 0 - TO print choice options.");
        System.out.println("\t 1 - TO print the list of grocery item.");
        System.out.println("\t 2 - TO add item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void add(){
        System.out.println("Please enter the grocery item: ");
        groceryList.addgroceryList(scanner.nextLine());
    }

    public static void modify(){
        System.out.println("current item name ");
        String itemno =scanner.nextLine();
        System.out.println("Enter new item: ");
        String newitem =scanner.nextLine();
        groceryList.modifyGroceryItem(itemno,newitem);
    }

    public static void remove(){
        System.out.println("Enter item name: ");
        String itemno =scanner.nextLine();
        groceryList.removeGroceryItem(itemno);
    }

    public static void find(){
        System.out.println("Item to search for : ");
        String searchitem =scanner.nextLine();
        if(groceryList.onfile(searchitem)){
            System.out.println("Found "+searchitem+" in grocery list ");
        }else{
            System.out.println(searchitem+" not in the shopping list");
        }
    }

    public  static  void  processarraylist(){
        ArrayList<String> newarray =new ArrayList<String>();
        newarray.addAll(groceryList.getGroceryList());

//        ArrayList<String> nextarray =new ArrayList<String>(groceryList.getGroceryList());
//
//        String[] myarray =new String[groceryList.getGroceryList().size()];
//        myarray = groceryList.getGroceryList().toArray(myarray);
    }
}

