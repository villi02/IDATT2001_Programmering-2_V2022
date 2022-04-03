import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class handOfCards {
    ArrayList<PlayingCard> handOfCards;
    DeckOfCards deck;

    public handOfCards(int n){
        this.handOfCards = deck.dealHand(n);
    }

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

    public int sumOfFaces(){
        Integer sum = this.handOfCards.stream().mapToInt(x -> x.getFace()).sum();
        return sum;
    }

}
