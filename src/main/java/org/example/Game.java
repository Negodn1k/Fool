package org.example;

import java.util.ArrayList;
import java.util.List;

public class Game {
    Deck deck = new Deck(createSuits());

    public Game() {
        Hand playerHand = createHand();
        Hand enemyHand = createHand();
    }

    private List<String> createSuits() {
        List<String> suits = new ArrayList<>();
        suits.add("Diamonds");
        suits.add("Baptize");
        suits.add("Peaks");
        suits.add("Hearts");
        return suits;
    }

    private Hand createHand() {
        List<Card> cards = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            cards.add(deck.getRandomCard());
        }
        return new Hand(cards);
    }
}
