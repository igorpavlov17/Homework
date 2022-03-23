package task3;

public class Task3 {
    public static void main(String[] args) {
        Card card1 = new Card(17, "clubs");
        Card card2 = new Card(11, "diamonds");
        Card card3 = new Card(11, "spades");
        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);
        card1.compareTo(card2);
    }
}

