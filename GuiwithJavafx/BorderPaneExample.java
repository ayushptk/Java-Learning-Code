import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneExample extends Application {
    public void start(Stage stage) {
        BorderPane pane = new BorderPane();
        pane.setTop(new Button("Top"));
        pane.setBottom(new Button("Bottom"));
        pane.setLeft(new Button("Left"));
        pane.setRight(new Button("Right"));
        pane.setCenter(new Button("Center"));

        stage.setScene(new Scene(pane, 300, 200));
        stage.setTitle("BorderPane");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
