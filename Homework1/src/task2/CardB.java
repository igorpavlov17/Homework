package task2;

class CardB {
    private int rank;
    private String suit;

    public CardB(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
        if (!(suit.equals("diamonds") || suit.equals("clubs") || suit.equals("hearts") || suit.equals("spades"))) {
            System.out.println("Неправильное значение suit!");
        }
    }

    public int getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }
}
