package VendingMachine;

import java.util.Map;

public class Inventory<Product> {
    private final Map<Product,Integer> inventory = new java.util.HashMap<>();

    public void addItem(Product item, int quantity) {
        inventory.put(item, inventory.getOrDefault(item, 0) + quantity);
    }

    public void deduct(Product item, int quantity) {
        if(inventory.containsKey(item) && inventory.get(item) >= quantity) {
            inventory.put(item, inventory.get(item) - quantity);
            if (inventory.get(item) == 0) {
                inventory.remove(item);
            }
        } else {
            throw new IllegalArgumentException("Not enough items in stock or item does not exist.");
        }
    }
    public int getQuantity(Product item) {
        return inventory.getOrDefault(item, 0);
    }
    public Map<Product, Integer> getInventory() {
        return inventory;
    }

}
