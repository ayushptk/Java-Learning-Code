import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        FlowPane flowPane = new FlowPane(10, 10);

        for (int i = 1; i <= 6; i++) {
            flowPane.getChildren().add(new Button("Button " + i));
        }

        Scene scene = new Scene(flowPane, 300, 200);
        primaryStage.setTitle("FlowPane Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
