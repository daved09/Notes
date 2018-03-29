package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import ui_tools.MessageBox;

import java.io.IOException;
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

    public void newNote(ActionEvent event){
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("gui/NoteWindow.fxml"));
        try {
            Parent root = loader.load();
            stage.setTitle("Note");
            stage.setScene(new Scene(root));
            stage.showAndWait();
        } catch (IOException e) {
            MessageBox.showError(e.getMessage());
        }

    }

}
