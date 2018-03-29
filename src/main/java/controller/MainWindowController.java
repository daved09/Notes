package controller;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class MainWindowController implements Initializable {

    @FXML
    private ListView noteList;

    @FXML
    private AnchorPane panel;

    private Stage thisStage;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        thisStage = (Stage) panel.getScene().getWindow();
    }

    public void closeWindow(ActionEvent event){
        thisStage.close();
    }

}
