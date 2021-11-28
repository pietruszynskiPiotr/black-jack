package deck;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {

    private final List<BlackJackCard> cards;

    public Deck() {
        this.cards = shuffle(BlackJackCard.values());
    }

    private List<BlackJackCard> shuffle(BlackJackCard[] cards) {
        List<BlackJackCard> blackJackCards = Arrays.asList(cards);
        Collections.shuffle(blackJackCards);
        return blackJackCards;
    }

}
