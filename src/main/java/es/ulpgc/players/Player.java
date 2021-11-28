package es.ulpgc.players;

import es.ulpgc.deck.BlackJackCard;

import java.util.Set;

final public class Player extends PlayerAbstract {

    public Player(final String name,
                  final Set<BlackJackCard> cards) {
        super(name, cards);
    }

}
