import java.util.ArrayList;
import java.util.Random;
import java.util.stream.IntStream;

public class DeckOfCards {

    private final char[] suit = {'S', 'H', 'D', 'C'};
    ArrayList<PlayingCard> cardDeck;

    public DeckOfCards(){
        for (char c : suit) {
            IntStream.range(1, 14).forEach(i -> {
                this.cardDeck.add(new PlayingCard(c, i));
            });
        }

    }

    public ArrayList<PlayingCard> dealHand(int n){
        ArrayList<PlayingCard> cards = new ArrayList<>();
        Random rand = new Random();
        while (cards.size() < n){
            PlayingCard newCard = this.cardDeck.get(rand.nextInt(13-1) + 1);
            if (!cards.contains(newCard)){
                cards.add(newCard);
            }
            else{
                continue;
            }
        }
        return cards;
    }

}
