package lists;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class ShoppingItem {
    private SimpleStringProperty name;
    private SimpleIntegerProperty quantity;
    private SimpleDoubleProperty price;

    public ShoppingItem (String name, Integer quantity, Double price){
        this.name = new SimpleStringProperty();
        this.quantity = new SimpleIntegerProperty();
        this.price = new SimpleDoubleProperty();

        this.name.set(name);
        this.quantity.set(quantity);
        this.price.set(price);
    }

    //getter y setters
    public String getName(){return this.name.get();}

    public void setName(String name) {this.name.set(name);}

    public Integer getQuantity () {return this.quantity.get();}

    public void setQuantity(Integer quantity) {this.quantity.set(quantity);}

    public Double getPrice() {return this.price.get();}

    public void setPrice(Double price) {this.price.set(price);}


    @Override
    public String toString() {
        return "Item: " +
                "name= " + name +
                ", quantity= " + quantity +
                ", price= " + price ;
    }
}

