package App;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class DeckOfCardsTest {

    DeckOfCards deck = new DeckOfCards();

    @Test
    public void testGetCardDeck() {
        assertEquals(52, deck.getCardDeck().size());
    }

    @Test
    public void checkDealHandDealSameHand() {
        assertEquals(false, deck.dealHand(5).equals(deck.dealHand(5)));
    }

    @Test
    public void checkAmountDealtCards() {
        assertEquals(5, deck.dealHand(5).size());
    }
}