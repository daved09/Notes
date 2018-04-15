package ui_tools;

import com.sun.istack.internal.NotNull;
import javafx.scene.control.Control;
import javafx.stage.Stage;

public class StageTool {

    @NotNull
    public static Stage getScene(@NotNull Control ui){
        Stage stage = (Stage) ui.getScene().getWindow();
        return stage;
    }


}
