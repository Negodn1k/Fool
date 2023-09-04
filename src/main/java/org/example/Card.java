package org.example;

public class Card {
    private String num;

    private String suit;

    public Card(String num, String suit) {
        this.suit = suit;
        this.num = num;
        upCard();
    }

    public String getNum() {
        return num;
    }

    public String getSuit() {
        return suit;
    }

    private void upCard() {
        switch (num) {
            case "11" -> num = "J";
            case "12" -> num = "Q";
            case "13" -> num = "K";
            case "14" -> num = "A";
        }
    }
}
