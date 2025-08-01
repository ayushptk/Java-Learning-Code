import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ControlsExample extends Application {
    public void start(Stage stage) {
        Button btn = new Button("Click Me");
        RadioButton rb = new RadioButton("Ayush Channel");
        CheckBox cb = new CheckBox("Subscribe");
        VBox vbox = new VBox(10, btn, rb, cb);

        stage.setScene(new Scene(vbox, 200, 150));
        stage.setTitle("Button, RadioButton, CheckBox");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
