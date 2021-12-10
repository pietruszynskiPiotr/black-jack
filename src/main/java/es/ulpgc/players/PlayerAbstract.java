package es.ulpgc.players;

import es.ulpgc.deck.BlackJackCard;
import es.ulpgc.deck.Figure;

import java.util.*;
import java.util.stream.Collectors;

public abstract class PlayerAbstract {

    private final String name;

    private final Set<BlackJackCard> cards;

    public PlayerAbstract(final String name,
                          final Set<BlackJackCard> cards) {
        this.name = name;
        this.cards = new HashSet<>(cards);
    }

    public Boolean hasBlackJack() {
        Integer sum = cards.stream()
                .map(BlackJackCard::getFigure)
                .mapToInt(Figure::getValue)
                .filter(Objects::nonNull)
                .sum();

        List<Integer> aces = cards.stream()
                .map(BlackJackCard::getFigure)
                .mapToInt(Figure::getValue)
                .filter(Objects::isNull)
                .boxed()
                .collect(Collectors.toList());

        List<Integer> totalSums = Arrays.asList(sum);

        aces.forEach(a -> totalSums.forEach(
                        s -> {
                            Integer s1 = s + 1;
                            Integer s2 = s + 11;
                            totalSums.remove(s);
                            totalSums.add(s1);
                            totalSums.add(s2);
                        }
                )
        );
        return totalSums.contains(21);
    }
//
//    public Boolean hasBlackJack() {
//        return lessThanTweTwo() && hasWinnersCards();
//    }

    protected Boolean hasWinnersCards() {
        return cards.stream()
                .map(BlackJackCard::getFigure)
//                .filter(f -> 10 == f.getValue() || f == Figure.ACE)
//                .filter(f -> 10 == f.getValue() || 11 == f.getValue())
                .mapToInt(Figure::getValue)
                .filter(v -> v == 10 || v == 1)
                .distinct()
                .limit(2)
                .count() == 2;
    }

    private Boolean lessThanTweTwo() {
        return cards.stream()
                .map(BlackJackCard::getFigure)
                .mapToInt(Figure::getValue)
                .sum()  < 22;
    }

    public void addCard(BlackJackCard card) {
        this.cards.add(card);
    }

}
