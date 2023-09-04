package org.example;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private List<Suit> suits;
    public Deck(List<String> suits) {
        generateSuits(suits);
    }

    private void generateSuits(List<String> suits) {
        this.suits = new ArrayList<>();
        for (String suit:suits) {
            this.suits.add(new Suit(suit));
        }
    }

    public Card getRandomCard() {
        int suitNum = (int) ((Math.random() * 4) - 1);

        Suit suit = suits.get(suitNum);
        List<Card> cards = suit.getCards();

        int cardNum = (int) (Math.random() * cards.size());

        Card card = cards.get(cardNum);
        cards.remove(cardNum);
        suit.setCards(cards);
        return card;
    }
}
