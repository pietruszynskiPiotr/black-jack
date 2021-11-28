package es.ulpgc.deck;

import java.util.Arrays;
import java.util.List;

public class Deck {

    private final List<BlackJackCard> cards;

    public Deck(BlackJackCard[] cards) {
        this.cards = Arrays.asList(cards);
    }

    public List<BlackJackCard> getCards() {
        return cards;
    }

}
