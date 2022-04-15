package task2;

public class Task2 {
    public static void main(String[] args) {
        CardC card1 = new CardC(6, "diamonds");
        CardC card2 = new CardC("diamonds");
        CardC card3 = new CardC("diamonds");
        CardC card4 = new CardC(12, "clubs");
        CardC card5 = new CardC("clubs");
        System.out.println(card1.getRank());
        System.out.println(card2.getRank());
        System.out.println(card3.getRank());
        System.out.println(card4.getRank());
        System.out.println(card5.getRank());
    }
}