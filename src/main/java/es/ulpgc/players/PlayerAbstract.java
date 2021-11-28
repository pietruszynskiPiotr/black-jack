package players;

import deck.BlackJackCard;

import java.util.HashSet;

public abstract class PlayerAbstract {

    private final HashSet<BlackJackCard> cards = new HashSet<>();

    public abstract Boolean hasBlackJack();

    public void addCard(BlackJackCard card) {
        this.cards.add(card);
    }

}
