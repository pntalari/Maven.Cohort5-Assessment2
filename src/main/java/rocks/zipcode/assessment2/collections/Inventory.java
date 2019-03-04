package rocks.zipcode.assessment2.collections;
import java.util.*;
import java.util.List;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    /**
     * @param strings list of strings to add / remove / fetch from
     */

    private Map <String,Integer> mapInventory = new HashMap<>();
    private ArrayList<String> list = new ArrayList();

    public Inventory(List<String> strings) {
        for(String s: strings){
            list.add(s);
        }
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {


    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
            if(mapInventory.containsKey(item)){
                mapInventory.put(item,mapInventory.get(item)+1);
            }
            else {
                mapInventory.put(item,1);
            }
        }
      //  list.add(item);

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        if (mapInventory.containsKey(item))
            mapInventory.remove(item);
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
       return mapInventory.getOrDefault(item,0);
    }
}
