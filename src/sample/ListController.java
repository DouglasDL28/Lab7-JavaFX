package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import lists.ShoppingItem;

public class ListController {
    @FXML
    Button backButton;

    @FXML
    Button markPendingButton;

    @FXML
    Button markBoughtButton;

    @FXML
    Button addItemButton;

    @FXML
    TableView <ShoppingItem> itemTableView;

    @FXML
    TableColumn itemCol;

    @FXML
    TableColumn quantityCol;

    @FXML
    TableColumn priceCol;

    @FXML
    TableColumn totalCol;

    @FXML
    TableColumn stateCol;




}
