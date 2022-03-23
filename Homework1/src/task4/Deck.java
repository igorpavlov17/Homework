package task4;

import task3.Card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck{
    static ArrayList<Card> cards;
    static String[] suits = {"clubs", "diamonds", "spades", "hearts"};
    static Deck deck;

    private Deck(ArrayList<Card> list){
        cards = list;
    }

    public static void createWithJokers(){ // создать колоду с джокерами
        cards = new ArrayList<>();
        for (int i = 2; i < 15; i++) {
            for (String suit : suits) {
                cards.add(new Card(i, suit));
            }
        }
        cards.add(new Card(15, "spades"));
        cards.add(new Card(15, "hearts"));
        deck = new Deck(cards);
    }

    public static void createWithoutJokers(){ // создать колоду без джокеров
        cards = new ArrayList<>();
        for (int i = 2; i < 15; i++) {
            for (String suit : suits) {
                cards.add(new Card(i, suit));
            }
        }
        deck = new Deck(cards);
    }

    public static Card getRandomCard(ArrayList<Card> deck){ // получить случайную карту
        return deck.get(new Random().nextInt(deck.size()));
    }

    public static void shuffle(){ // перемешать колоду
        Collections.shuffle(cards);
    }

    public static void sort(){ // сортировать колоду
        Collections.sort(cards);
    }

    public static void extractCard(int rank, String suit){ // выдать карту
        for (Card card : cards) {
            if (card.getRank() == rank && card.getSuit().equals(suit)){
                cards.remove(card);
                return;
            }
        }
    }

    public static void returnCard(int rank, String suit){ // вернуть карту в колоду
        boolean b = false;
        for (Card card : cards) {
            if (card.getRank() == rank && card.getSuit().equals(suit)) {
                b = true;
                break;
            }
        }
        if (!b) cards.add(new Card(rank, suit));
        else System.out.println("Карта " + rank + " of " + suit + " в колоде уже есть!");
    }

    public static boolean checkEmpty(){ // проверить на пустоту
        return cards.isEmpty();
    }

    @Override
    public String toString() {
        if (cards.isEmpty()) return "Колода пуста!";
        return "Колода: " + cards;
    }
}