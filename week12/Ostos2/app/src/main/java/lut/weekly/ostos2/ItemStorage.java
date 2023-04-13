package lut.weekly.ostos2;

import java.util.ArrayList;

public class ItemStorage {

    ArrayList<Item> items;
    private static ItemStorage storage = null;
    final static String TAG = "ZZ ItemRepository";

    private ItemStorage() {
        items = new ArrayList<Item>();
    }

    public static ItemStorage getInstance() {
        if (storage == null) {
            storage = new ItemStorage();
        }
        return storage;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void removeItemById(int id) {
        items.remove(id);
    }

    public void updateItem(int id, Item updated) {
        items.set(id, updated);
    }
}
