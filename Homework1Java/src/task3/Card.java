package task3;

import java.util.Arrays;
import java.util.Objects;

public class Card implements Comparable<Card> {
    private int rank;
    private String suit;
    private String suits[] = {"clubs", "diamonds", "spades", "hearts"};
    private boolean isCorrect = false;

    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
        for (String s : suits) {
            if (suit.equals(s)) {
                isCorrect = true;
            }
        }
        if (!isCorrect) System.out.println("Неправильное значение suit!");
    }

    public void checkCard() { // проверить, принадлежит ли карта к стандартной колоде
        if (!isCorrect && ((this.rank < 2) || (this.rank > 15))) {
            System.out.print("Карта не принадлежит к стандартной колоде!");
        }
    }

    public void isBetter(Card card) { // проверить, является ли текущая карта сильнее другой, если масть одинакова
        if (!this.suit.equals(card.suit)) System.out.println("Текушая карта сильнее!");
        else System.out.println("Текущая карта слабее!");
    }

    public int compareTo(Card card) { // сравнить текущую карту с другой
        int index1 = 0;
        int index2 = 0;
        if (this.rank != card.rank) return this.rank - card.rank;
        if (this.suit.equals(card.suit)) return 0;
        for (int i = 0; i < 4; i++) {
            if (this.suit.equals(suits[i])) index1 = i;
            if (card.suit.equals(suits[i])) index2 = i;
        }
        return index1 - index2;
    }

    @Override
    public String toString() {
        String ranks[] = {"Jack", "Queen", "King", "Ace", "Joker"};
        checkCard();
        if ((rank > 10) && (rank < 16)) return ranks[rank - 11] + " of " + suit;
        return rank + " of " + suit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return rank == card.rank && isCorrect == card.isCorrect && Objects.equals(suit, card.suit) && Arrays.equals(suits, card.suits);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(rank, suit, isCorrect);
        result = 31 * result + Arrays.hashCode(suits);
        return result;
    }

    public int getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }
}
