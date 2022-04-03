import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class handOfCards {
    ArrayList<PlayingCard> handOfCards;
    DeckOfCards deck;

    /**
     * Initiate a hand of cards
     * @param n the amount of cards wished to be dealt to a hand
     */
    public handOfCards(int n){
        this.handOfCards = deck.dealHand(n);
    }

    /**
     * A method to check if a hand has a flush
     * @return true if there's a flush
     */
    public boolean checkFlush() {

        Character[] characterArray = new Character[]{'S', 'H', 'D', 'C'};
        Map<Character, Long> counts = new HashMap<>();
        for (Character charr : characterArray) {
            counts.put(charr, this.handOfCards.stream().filter(cardsuit -> charr.equals((Character) cardsuit.getSuit())).count());
        }

        for (Long value : counts.values()) {
            if (value >= 5) {
                return true;
            }
        }
        return false;
    }

    /**
     * A method to check the sum of the Sum of the faces
     * @return the sum of the faces as an int
     */
    public int sumOfFaces(){
        Integer sum = this.handOfCards.stream().mapToInt(x -> x.getFace()).sum();
        return sum;
    }

    /**
     * A method to check for every card of hearts
     * @return the cards of heart as a string
     */
    public String checkSuitOfCards() {
        char suit = 'H';
        return this.handOfCards.stream().filter(s-> s.getSuit() == suit).collect(Collectors.toList()).toString();
    }


}
