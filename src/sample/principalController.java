package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import lists.ShoppingItem;
import lists.ShoppingList;

import java.io.IOException;

public class principalController {
    @FXML
    TableView<ShoppingList> listsTable;

    @FXML
    TableColumn namesColumn;

    @FXML
    TableColumn pendingsColumn;

    @FXML
    TableColumn totalsColumn;

    @FXML
    Button deleteListButton;

    @FXML
    Button editListButton;

    @FXML
    Button addListButton;


    public void openNewListWindow(ActionEvent event) {
        Parent root;
        try {

            // Cargar la nueva ventana
            FXMLLoader loader = new FXMLLoader(getClass().getResource("TestScene.fxml"));
            root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Seleccion");
            stage.setScene(new Scene(root, 450, 450));

            // Manda la persona seleccionada
            newListController newListController = loader.getController();
            ShoppingItem selectedItem = listsTable.getSelectionModel().getSelectedItem();
            if (selectedItem != null) {
                newListController.setName("" + selectedItem);
            } else {
                newListController.setName("Mano, no hay nadie seleccionado!");
            }

            // Muestra la ventana
            stage.show();
            // Hide this current window (if this is what you want)
            // ((Node)(event.getSource())).getScene().getWindow().hide();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

