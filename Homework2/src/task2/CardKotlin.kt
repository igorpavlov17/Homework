package task2

import java.util.*

class CardKotlin(val rank: Int, val suit: Suit) : Comparable<CardKotlin> {
    private var isCorrect = false

    init {
        for (suit in Suit.values()) {
            if (this.suit == suit) {
                isCorrect = true
                break
            }
        }
        if (!isCorrect) println("Неправильное значение suit!")
    }

    fun checkCard() {
        if (!isCorrect && (rank < 2 || rank > 15)) {
            print("Карта не принадлежит к стандартной колоде!")
        }
    }

    fun isBetter(card: CardKotlin) {
        if (suit != card.suit) println("Текушая карта сильнее!") else println("Текущая карта слабее!")
    }

    override fun compareTo(other: CardKotlin): Int {
        var index1 = 0
        var index2 = 0
        if (rank != other.rank) return rank - other.rank
        if (suit == other.suit) return 0
        for (i in 0..3) {
            if (suit == Suit.values()[i]) index1 = i
            if (other.suit == Suit.values()[i]) index2 = i
        }
        return index1 - index2
    }

    override fun toString(): String {
        checkCard()
        return if (rank in 11..15) Rank.values()[rank - 11].toString().lowercase(Locale.getDefault()).capitalize() + " of " + suit.toString().lowercase(Locale.getDefault()) else "$rank of $suit"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if ((other == null) || (javaClass != other.javaClass)) return false
        val card = other as CardKotlin
        return rank == card.rank && isCorrect == card.isCorrect && suit == card.suit
    }

    override fun hashCode(): Int {
        return Objects.hash(rank, suit, isCorrect)
    }
}