package ui_tools;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class MessageBox {

    public static void show(String text){
        show("Message", text, text, AlertType.INFORMATION);
    }

    public static void show(String title, String header, String text, AlertType type){
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(text);
        alert.showAndWait();
    }

}
