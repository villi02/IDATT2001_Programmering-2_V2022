package App;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.IntStream;

public class DeckOfCards {

    /**
     * Initializing variables
     */
    private final char[] suit = {'S', 'H', 'D', 'C'};
    ArrayList<PlayingCard> cardDeck = new ArrayList<>();

    /**
     * A method to initialize a deck of cards
     */
    public DeckOfCards(){
        for (char c : suit) {
            IntStream.range(1, 14).forEach(i -> {
                this.cardDeck.add(new PlayingCard(c, i));
            });
        }

    }

    public ArrayList<PlayingCard> getCardDeck() {
        return this.cardDeck;
    }

    /**
     * A method to deal a hand with n cards
     * @param n the amount of cards to be dealt as an int
     * @return a hand of cards as an ArrayList<App.PlayingCard>
     */
    public ArrayList<PlayingCard> dealHand(int n){
        ArrayList<PlayingCard> cards = new ArrayList<>();
        Random rand = new Random();
        while (cards.size() < n){
            PlayingCard newCard = this.cardDeck.get(rand.nextInt(52-1) + 1);
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
