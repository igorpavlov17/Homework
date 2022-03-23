package task2;

class CardC {
    private int rank;
    private String suit;
    static int maxRankDiamonds;
    static int maxRankClubs;
    static int maxRankHearts;
    static int maxRankSpades;

    public CardC(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
        switch (suit) {
            case ("diamonds"):
                if (rank >= maxRankDiamonds) maxRankDiamonds = rank;
                break;
            case ("clubs"):
                if (rank >= maxRankClubs) maxRankClubs = rank;
                break;
            case ("hearts"):
                if (rank >= maxRankHearts) maxRankHearts = rank;
                break;
            case ("spades"):
                if (rank >= maxRankSpades) maxRankSpades = rank;
                break;
        }
    }

    public CardC(String suit) {
        this.suit = suit;
        switch (suit) {
            case ("diamonds"):
                this.rank = ++maxRankDiamonds;
                break;
            case ("clubs"):
                this.rank = ++maxRankClubs;
                break;
            case ("hearts"):
                this.rank = ++maxRankHearts;
                break;
            case ("spades"):
                this.rank = ++maxRankSpades;
                break;
        }
    }

    public int getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }
}
