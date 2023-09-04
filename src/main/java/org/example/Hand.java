package org.example;

import org.example.Card;
import org.example.Deck;

import java.util.List;

public class Hand {

    private List<Card> cardsInHand;

    public Hand(List<Card> cards) {
        this.cardsInHand = cards;
    }

    public void printHand() {
        for (Card card:cardsInHand) {
            System.out.println(card.getNum() + "    " + card.getSuit());
        }
    }
}
