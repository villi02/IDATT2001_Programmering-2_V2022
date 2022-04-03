import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * The type Card game app.
 */
public class CardGameApp extends Application {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/CardGameView.fxml"));
        primaryStage.setTitle("Card Game");
        primaryStage.setScene(new Scene(root, 900, 600));
        primaryStage.show();
    }
}

