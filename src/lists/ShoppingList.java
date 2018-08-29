package lists;

import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;

public class ShoppingList {
    private SimpleStringProperty name;
    private SimpleListProperty<ShoppingItem> items;

    public ShoppingList(String name) {
        this.items = new SimpleListProperty<>();
        this.name = new SimpleStringProperty();

        this.name.set(name);

    }

    public boolean hasShoppingItem(String searchName) {
        for (ShoppingItem item : items) {
            if (item.getName() == searchName) {
                return true;
            }
        }
        return false;
    }

    public void addItem (ShoppingItem item) {
        if (!hasShoppingItem(item.getName())) {
            items.add(item);
        }
    }
}
