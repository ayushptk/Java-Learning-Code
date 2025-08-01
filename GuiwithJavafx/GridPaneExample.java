import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneExample extends Application {
    public void start(Stage stage) {
        GridPane grid = new GridPane();
        grid.add(new Button("1"), 0, 0);
        grid.add(new Button("2"), 1, 0);
        grid.add(new Button("3"), 0, 1);
        grid.add(new Button("4"), 1, 1);

        stage.setScene(new Scene(grid, 200, 150));
        stage.setTitle("GridPane");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
