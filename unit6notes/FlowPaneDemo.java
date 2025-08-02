import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

//1.Extends the Application class
public class FlowPaneDemo extends Application {

    @Override
    //2.set the Stage is like the outer window frame of your app.
    public void start(Stage primaryStage)throws Exception
     {
        // 3.Create a Layout
        FlowPane flowPane = new FlowPane();
        flowPane.setHgap(10); // horizontal gap between children
        flowPane.setVgap(10); // vertical gap between rows

        // 4.Add buttons to FlowPane
        for (int i = 1; i <= 10; i++) {
            Button button = new Button("Button " + i);
            flowPane.getChildren().add(button);
        }

        // 5.Create a scene and show the stage
        Scene scene = new Scene(flowPane, 300, 200);
        primaryStage.setTitle("FlowPane Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    // 6.main method
    public static void main(String[] args) {
        launch(args);
    }
}
