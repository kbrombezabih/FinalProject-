
public class App {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Player player1 = new Player("Player1");
        Player player2 = new Player("Player2");
        deck.shuffle();
        for (int i = 0; i < 52; i++) {
            player1.draw(deck);
            player2.draw(deck);
        }

        for (int i = 0; i < 26; i++) {
            Card player1Card = player1.flip();
            player1Card.describe();
            int tempScore1 = player1Card.getValue();
            Card player2Card = player2.flip();
            player2Card.describe();
            int tempScore2 = player2Card.getValue();
            if (tempScore1 > tempScore2) {
                player1.incrementScore();
                System.out.printf("The winner of round %d is Player1!!\n", i + 1);
            } else if (tempScore1 < tempScore2) {
                player2.incrementScore();
                System.out.printf("The winner of round %d is Player2!!\n", i + 1);
            } else {
                System.out.printf("There is no winner for round %d. It is a Draw!!\n", i + 1);
            }
            System.out.println("Updated score after round : " + (i + 1));
            System.out.println("Player1 : " + player1.getScore());
            System.out.println("Player2 : " + player2.getScore());
            System.out.println();
        }
        System.out.println("*******************************************");
        System.out.println("              FINAL SCORE");
        System.out.println("*******************************************");
        System.out.println(player1.getName() + " : " + player1.getScore());
        System.out.println(player2.getName() + " : " + player2.getScore());
        if (player1.getScore() > player2.getScore()){
            System.out.println(player1.getName() + " won the game with " + player1.getScore() + " points!!!");
        } else if (player2.getScore() > player1.getScore()){
            System.out.println(player2.getName() + " won the game with " + player2.getScore() + " points!!!");
        } else {
            System.out.println("The game is a draw!");
        }

    }
}