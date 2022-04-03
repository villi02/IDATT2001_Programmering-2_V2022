import java.util.ArrayList;
import java.util.HashMap;
import java.sql.Array;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Flushtest {

    private final char[] suits = {'S', 'H', 'D', 'C'};
    ArrayList<PlayingCard> cardDeck = new ArrayList<>();

    public ArrayList<PlayingCard> DeckOfCards(){
        for (char c : suits) {
            IntStream.range(1, 14).forEach(i -> {
                this.cardDeck.add(new PlayingCard(c, i));
            });
        }
        return this.cardDeck;
    }



    private static final char[] suit = {'S', 'H', 'D', 'C'};
    public static ArrayList<PlayingCard> cards = new ArrayList<>();

    public static void testData(){
        cards.add(new PlayingCard('S', 6));
        cards.add(new PlayingCard('S', 7));
        cards.add(new PlayingCard('S', 9));
        cards.add(new PlayingCard('S', 10));
        cards.add(new PlayingCard('S', 11));
        cards.add(new PlayingCard('C', 6));
        cards.add(new PlayingCard('C', 8));
    }

    // List<String> collect = staff.stream().map(x -> x.getName()).collect(Collectors.toList());

    //Map<String, Long> counts = list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));

    public static Map mapHand(ArrayList<PlayingCard> list){
        //long count = animals.stream().filter(animal -> "bat".equals(animal)).count();

        Character[] characterArray = new Character[]{'S', 'H', 'D', 'C'};
        Map<Character, Long> counts = new HashMap<>();
        for (Character charr : characterArray) {
            counts.put(charr, cards.stream().filter(cardsuit -> charr.equals((Character) cardsuit.getSuit())).count());
        }


        //HashMap<PlayingCard, Integer> mapped =  list.stream().map(x -> x.getSuit()).map;
        return counts;
    }

    // for (Map.Entry<String,String> entry : gfg.entrySet())
    //            System.out.println("Key = " + entry.getKey() +
    //                             ", Value = " + entry.getValue());
    public static boolean hasFlush(Map<Character, Long> cards){
        for (Long value : cards.values()){
            if (value >= 5){
                return true;
            }
        }

        return false;
    }

    public static int sumOfFaces(ArrayList<PlayingCard> cards){
        Integer sum = cards.stream().mapToInt(x -> x.getFace()).sum();
        return sum;
    }

    public static void main(String[] args) {
    Flushtest test = new Flushtest();
    Flushtest.testData();
        System.out.println(Flushtest.mapHand(test.cards));
        System.out.println(Flushtest.hasFlush(Flushtest.mapHand(test.cards)));
        System.out.println(Flushtest.sumOfFaces(test.cards));
        System.out.println(test.DeckOfCards());
    }
}
