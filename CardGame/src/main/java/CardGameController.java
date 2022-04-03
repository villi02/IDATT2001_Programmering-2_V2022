import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;


public class CardGameController {
    private Scene scene;
    private Stage stage;

    public void startCardGame(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/CardGameScene.fxml"));
        DeckOfCards deckOfCards = new DeckOfCards();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}

