import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class M4A2JavaFX extends Application {
    private final static int width = 400;
    private final static int height = 400;
    private final static int boxWidth = width / 10;
    private final static int boxHeight = height / 10;

    public void start(Stage inputStage) {
        GridPane grid = new GridPane();

        //loops for the x and y boxes
        for(int y = 0; y < 10; y++) {
            for(int x = 0; x < 10; x++) {
                TextField textBox = new TextField(Integer.toString((int)(Math.random() * 2)));
                textBox.setMinWidth(boxWidth);
                textBox.setMinHeight(boxHeight);
                grid.add(textBox, x, y);
            }
        }

        //create the scene
        Scene scene = new Scene(grid, width, height);
        inputStage.setScene(scene);
        //inputStage.setTitle("Matrix");
        inputStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}