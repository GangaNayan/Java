import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addgroceryList(String item){
        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList(){
        System.out.println("You have "+groceryList.size()+" item in your grocery list");
        for(int i=0; i<groceryList.size(); i++){
            System.out.println((i+1)+", "+groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentitem,String newItem){
     int position= findItem(currentitem);
     if(position>=0){
         modifyGroceryItem(position,newItem);
     }
    }

    private void modifyGroceryItem(int position,String newItem){
        groceryList.set(position,newItem);      // int index , string element
        System.out.println("Grocery item "+ (position) +" has been modified.");
    }

    public void removeGroceryItem(String item){
        int position=findItem(item);
        if(position>=0){
            remveGroceryItem(position);
        }
    }
    private void remveGroceryItem(int position){
        groceryList.remove(position);
    }

    public int findItem(String searchItem){
        return groceryList.indexOf(searchItem);
    }

    public boolean onfile(String searchItem){
        int position = findItem(searchItem);
        if(position>=0){
            return  true;
        }
        return false;
    }


}
