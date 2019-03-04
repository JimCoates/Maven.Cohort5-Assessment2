package rocks.zipcode.assessment2.collections;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    Map<String, Integer> inventory;

    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {
        this.inventory = new TreeMap<>();
        for (int i = 0; i < strings.size(); i++) {
            inventory.put(strings.get(i), 0);
        }
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        this.inventory = new TreeMap<>();
    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        if(this.inventory.containsKey(item)){
        this.inventory.put(item, inventory.get(item) + 1);
    } else {
        this.inventory.put(item,1);
        }
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        this.inventory.put(item, inventory.get(item) - 1);
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        if(!(this.inventory.containsKey(item))){
            return 0;
        }
        return inventory.get(item);
    }
}
