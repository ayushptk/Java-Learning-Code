import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LabelTextFieldExample extends Application {
    public void start(Stage stage) {
        Label label = new Label("Name:");
        TextField tf = new TextField();
        VBox vbox = new VBox(10, label, tf);

        stage.setScene(new Scene(vbox, 200, 100));
        stage.setTitle("Label and TextField");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
