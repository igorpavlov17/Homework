package task4;

public class Task4 {
    public static void main(String[] args) {
        Deck.createWithoutJokers();
        Deck.extractCard(10, "diamonds");
        Deck.extractCard(8, "clubs");
        Deck.extractCard(6, "spades");
        Deck.returnCard(10, "diamonds");
        Deck.returnCard(8, "clubs");
        Deck.returnCard(8, "clubs");
        System.out.println(Deck.deck);
        Deck.shuffle();
        System.out.println(Deck.deck);
        Deck.sort();
        System.out.println(Deck.deck);
        for (int i = 2; i < 16; i++) {
            for (String suit : Deck.suits) {
                Deck.extractCard(i, suit);
            }
        }
        System.out.println(Deck.deck);
    }
}
