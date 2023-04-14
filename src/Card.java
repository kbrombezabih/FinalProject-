
public class Card {
    private int value;
    private String name;

    public Card() {}

    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // prints out information about a card
    public void describe() {
        System.out.println(this.name + " (value: " + this.value + ")");
    }
}