package edu.designpatterns.structural.proxy;

import java.util.ArrayList;

public class InventoryProxy implements Inventory {

    SuperstoreInventory inventory;

    @Override
    public ArrayList<Item> getInventory() {
        if (inventory == null) {
            inventory = new SuperstoreInventory();
        }
        return inventory.getInventory();
    }
}
