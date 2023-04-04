package lut.weekly.ostoskori;

import java.util.ArrayList;

public class ItemRepository {

    ArrayList<Item> items;
    private static ItemRepository repository = null;
    final static String TAG = "ZZ ItemRepository";

    private ItemRepository() {
        items = new ArrayList<Item>();
    }

    public static ItemRepository getInstance() {
        if (repository == null) {
            repository = new ItemRepository();
        }
        return repository;
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