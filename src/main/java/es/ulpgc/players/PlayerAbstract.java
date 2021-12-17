package es.ulpgc.players;

import es.ulpgc.deck.BlackJackCard;
import es.ulpgc.deck.Figure;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public abstract class PlayerAbstract {

    protected final Set<BlackJackCard> cards;

    public PlayerAbstract(final Set<BlackJackCard> cards) {
        this.cards = new HashSet<>(cards);
    }

    public Boolean hasBlackJack() {
        List<Figure> figures = getFigures();
        List<Integer> values = getFigureValues();
        return figures.contains(Figure.ACE) && values.contains(10) && getPointsNumber() <= 21;
    }

    public Integer getPointsNumber() {
        return cards.stream()
                .map(BlackJackCard::getFigure)
                .mapToInt(Figure::getValue)
                .sum();
    }

    private List<Integer> getFigureValues() {
        return cards.stream()
                .map(BlackJackCard::getFigure)
                .map(Figure::getValue)
                .collect(Collectors.toList());
    }

    private List<Figure> getFigures() {
        return cards.stream()
                .map(BlackJackCard::getFigure)
                .collect(Collectors.toList());
    }

}
