import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addgroceryList(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have "+groceryList.size()+" item in your grocery list");
        for(int i=0; i<groceryList.size(); i++){
            System.out.println((i+1)+", "+groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position,String newItem){
        groceryList.set(position,newItem);      // int index , string element
        System.out.println("Grocery item "+ (position) +" has been modified.");
    }

    public void remveGroceryItem(int position){
        String thisItem = groceryList.get(position);
        groceryList.remove(position);
    }

    public String findItem(String searchItem){
        //boolean exists = groceryList.contains(searchItem);

        int position= groceryList.indexOf(searchItem);
        if(position>=0){
            return groceryList.get(position);
        }else{
            return  null;
        }

    }


}
