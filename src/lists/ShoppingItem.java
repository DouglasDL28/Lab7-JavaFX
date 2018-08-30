package lists;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class ShoppingItem {
    private SimpleStringProperty name;
    private SimpleIntegerProperty quantity;
    private SimpleDoubleProperty price;
    private SimpleBooleanProperty pending  ;

    public ShoppingItem (String name, Integer quantity, Double price){
        this.name = new SimpleStringProperty();
        this.quantity = new SimpleIntegerProperty();
        this.price = new SimpleDoubleProperty();
        this.pending = new SimpleBooleanProperty();

        this.name.set(name);
        this.quantity.set(quantity);
        this.price.set(price);
        this.pending.set(true);
    }

    //getter y setters
    public String getName(){return this.name.get();}

    public void setName(String name) {this.name.set(name);}

    public Integer getQuantity () {return this.quantity.get();}

    public void setQuantity(Integer quantity) {this.quantity.set(quantity);}

    public Double getPrice() {return this.price.get();}

    public void setPrice(Double price) {this.price.set(price);}

    public void changePending () {this.pending.set(false);}

    public void setPending () {this.pending.set(true);}

    public Boolean getPending () {return this.pending.get();}

    public Double getTotal () {
        Double total = 0.0;
        total += this.getQuantity() * this.getPrice();
        return total;
    }


    @Override
    public String toString() {
        String state = "";
        if (getPending()) {
            state += "Pendiente";
        } else {
            state += "Comprado";
        }

        return "Item: " +
                "nombre= " + name +
                ", cantidad= " + quantity +
                ", precio= " + price +
                ", estado= " + state;
    }
}

