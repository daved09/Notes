package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class MainWindowController implements Initializable {

    @FXML
    private ListView noteList;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public void closeWindow(ActionEvent event){
        getStageFromWindow().close();
    }

    private Stage getStageFromWindow(){
        return (Stage) noteList.getScene().getWindow();
    }

}
