package App;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class handOfCardsTest {

    DeckOfCards deck = new DeckOfCards();
    public ArrayList<PlayingCard> cardsFlushAndQueenSpades = new ArrayList<>();
    public ArrayList<PlayingCard> cardsNoFlush = new ArrayList<>();

    @BeforeEach
    public void testData() {
        cardsNoFlush.add(new PlayingCard('H', 9));
        cardsNoFlush.add(new PlayingCard('H', 8));
        cardsNoFlush.add(new PlayingCard('S', 7));
        cardsNoFlush.add(new PlayingCard('H', 5));
        cardsNoFlush.add(new PlayingCard('H', 4));
    }

    @Test
    public void testCheckFlush() {
        cardsFlushAndQueenSpades.add(new PlayingCard('S', 12));
        cardsFlushAndQueenSpades.add(new PlayingCard('S', 13));
        cardsFlushAndQueenSpades.add(new PlayingCard('S', 11));
        cardsFlushAndQueenSpades.add(new PlayingCard('S', 10));
        cardsFlushAndQueenSpades.add(new PlayingCard('S', 9));

        handOfCards hand = new handOfCards(cardsFlushAndQueenSpades);
        assertEquals(true, hand.checkFlush());
    }

    @Test
    public void testSumOfFaces() {
        cardsFlushAndQueenSpades.add(new PlayingCard('S', 12));
        cardsFlushAndQueenSpades.add(new PlayingCard('S', 13));

        handOfCards hand = new handOfCards(cardsFlushAndQueenSpades);
        assertEquals(25, hand.sumOfFaces());
    }

    @Test
    public void testCheckForHeart() {
        cardsNoFlush.add(new PlayingCard('H', 9));
        cardsNoFlush.add(new PlayingCard('H', 8));
        cardsNoFlush.add(new PlayingCard('S', 7));
        cardsNoFlush.add(new PlayingCard('H', 5));
        cardsNoFlush.add(new PlayingCard('H', 4));

        handOfCards hand = new handOfCards(cardsNoFlush);
        String count = cardsNoFlush.stream().filter(s-> s.getSuit() == 'H').collect(Collectors.toList()).toString();
        assertEquals(count, hand.checkForHeart());
    }

    @Test
    public void testCheckForQueen() {
        cardsFlushAndQueenSpades.add(new PlayingCard('S', 12));
        cardsFlushAndQueenSpades.add(new PlayingCard('S', 13));
        cardsFlushAndQueenSpades.add(new PlayingCard('S', 11));
        cardsFlushAndQueenSpades.add(new PlayingCard('S', 10));
        cardsFlushAndQueenSpades.add(new PlayingCard('S', 9));

        handOfCards hand = new handOfCards(cardsFlushAndQueenSpades);
        assertEquals(true, hand.checkForQueen());
    }
}