package org.example;

import java.util.ArrayList;
import java.util.List;

public class Suit {
    private List<Card> cards = new ArrayList<>();

    public Suit(String suit) {
        for (int i = 6; i < 15; i++) {
            cards.add(new Card(Integer.toString(i), suit));
        }
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
}
