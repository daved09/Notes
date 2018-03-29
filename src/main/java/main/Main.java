package main;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("gui/MainWindow.fxml"));
        primaryStage.setTitle("Notes");
        primaryStage.setOnCloseRequest(e -> close());
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    private void close(){
        Platform.exit();
        System.exit(0);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
