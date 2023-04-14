import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck {
    private List<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
        // Populate the deck with the standard 52 cards
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] cardsName = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
                                "Jack", "Queen", "King", "Ace"};
        for (String suit : suits) {
            for (int i = 0; i < cardsName.length; i++) {
                int value = i + 2;
                String cardName = cardsName[i] + " Of " + suit;
                Card card = new Card();
                card.setName(cardName);
                card.setValue(value);
                this.cards.add(card);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(this.cards);
       
    }

    public Card draw() {
        if (this.cards.size() == 0) {
            return null;
        }
        return this.cards.remove(0);
    }
}