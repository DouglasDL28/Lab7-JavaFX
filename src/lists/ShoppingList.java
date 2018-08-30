package lists;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;

public class ShoppingList {
    private SimpleStringProperty name;
    private SimpleStringProperty description;
    private SimpleListProperty<ShoppingItem> items;
    private SimpleDoubleProperty totalPrice;
    private SimpleIntegerProperty pendings;


    public ShoppingList(String name, String description) {
        this.items = new SimpleListProperty<>();
        this.name = new SimpleStringProperty();
        this.description = new SimpleStringProperty();
        this.totalPrice = new SimpleDoubleProperty();
        this.pendings = new SimpleIntegerProperty();

        this.name.set(name);
        this.description.set(description);

    }

    public Double setTotalPrice () {
        Double GrandTotal = 0.0;
        for (ShoppingItem item : items) {
            GrandTotal += item.getTotal();
        }
        return GrandTotal;
    }

    public Integer countPendings () {
        Integer pendingCount = 0;
        for (ShoppingItem item: items) {
            if (item.getPending()) {
                pendingCount += 1;
            }
        }
        return pendingCount;
    }

    public boolean hasShoppingItem(String searchName) {
        for (ShoppingItem item : this.items) {
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

    public void deleteItem (ShoppingItem item) {
        if (hasShoppingItem(item.getName())) {
            items.remove(item);
        }
    }
}
