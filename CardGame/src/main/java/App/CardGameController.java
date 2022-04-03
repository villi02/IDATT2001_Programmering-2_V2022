package App;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CardGameController {
    /**
     * Initialize elements
     */
    @FXML
    public TextField cardsDealtField;

    @FXML
    public TextField amountOfCards;

    @FXML
    public TextField sumOfFacesField;

    @FXML
    public TextField cardOfHeartsField;

    @FXML
    public TextField queenSpadesField;

    @FXML
    public TextField flushField;

    DeckOfCards deck = new DeckOfCards();

    /**
     * A method to deal hand and update all the text fields
     *
     * @param event the event
     */
    public void dealHand(ActionEvent event) {
        int n = Integer.parseInt(amountOfCards.getText());
        handOfCards handOfCards = new handOfCards(deck.dealHand(n));
        // Update all fields
        sumOfFacesField.setText(String.valueOf(handOfCards.sumOfFaces()));
        cardOfHeartsField.setText(handOfCards.checkForHeart());
        flushField.setText(String.valueOf(handOfCards.checkFlush()));
        queenSpadesField.setText(String.valueOf(handOfCards.checkForQueen()));
        cardsDealtField.setText(handOfCards.getHand());

    }
}