package es.ulpgc.players;

import es.ulpgc.deck.BlackJackCard;

import java.util.Set;

final public class Croupier extends PlayerAbstract {

    public Croupier(final String name,
                    final Set<BlackJackCard> cards) {
        super(name, cards);
    }

}
