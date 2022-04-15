package task2;

public class Task2 {
    public static void main(String[] args) {
        CardKotlin card1 = new CardKotlin(17, Suit.CLUBS);
        CardKotlin card2 = new CardKotlin(11, Suit.DIAMONDS);
        CardKotlin card3 = new CardKotlin(11, Suit.SPADES);
        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);
        System.out.println(card1.compareTo(card2));
    }
}

