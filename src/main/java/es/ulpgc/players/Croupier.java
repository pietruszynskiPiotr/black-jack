package es.ulpgc.players;

import es.ulpgc.deck.BlackJackCard;

import java.util.Set;

public final class Croupier extends PlayerAbstract {

    public Croupier(final Set<BlackJackCard> cards) {
        super(cards);
    }

    public void addCard(BlackJackCard card) {
        this.cards.add(card);
    }

}
