package task2;

import java.util.Objects;

public class Card implements Comparable<Card> {
    private final int rank;
    private final Suit suit;
    private boolean isCorrect = false;

    public Card(int rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
        for (Suit s : Suit.values()) {
            if (suit.equals(s)) {
                isCorrect = true;
                break;
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
            if (this.suit.equals(Suit.values()[i])) index1 = i;
            if (card.suit.equals(Suit.values()[i])) index2 = i;
        }
        return index1 - index2;
    }

    @Override
    public String toString() {
        checkCard();
        if ((rank > 10) && (rank < 16)) return Rank.values()[rank - 11].toString() + " of " + suit.toString();
        return rank + " of " + suit.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return rank == card.rank && isCorrect == card.isCorrect && suit == card.suit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, suit, isCorrect);
    }

    public int getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }
}
