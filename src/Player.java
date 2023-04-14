import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> hand;
    private int score;
    private String name;

    public Player(String name) {
        this.hand = new ArrayList<>();
        this.score = 0;
        this.name = name;
    }

    public List<Card> getHand() {
        return hand;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public void describe() {
        System.out.println(name + "'s hand:");
        for (Card card : hand) {
            card.describe();
        }
    }

    public Card flip() {
        Card card = hand.remove(0);
        return card;
    }

    // takes a Deck as an argument and calls the draw method on the deck,
    // adding the returned Card to the hand field
    public void draw(Deck deck) {
        Card topCard = deck.draw();
        hand.add(topCard);
    }

    public void incrementScore() {
        score++;
    }
}