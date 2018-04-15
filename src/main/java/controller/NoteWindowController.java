package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import ui_tools.MessageBox;
import ui_tools.StageTool;

import java.net.URL;
import java.util.ResourceBundle;

public class NoteWindowController implements Initializable {

    @FXML
    private TextField txtTitle;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void keyPress(KeyEvent event){
        if(event.isControlDown()){
            if(event.getCode() == KeyCode.S){

            }
            if(event.getCode() == KeyCode.Y){
                StageTool.getScene(txtTitle).close();
            }
        }
    }

}
