package es.ulpgc.deck;

import lombok.Getter;

@Getter
public enum BlackJackCard {

    TWO_CLUBS(Figure.TWO, Color.CLUBS),
    THREE_CLUBS(Figure.THREE, Color.CLUBS),
    FOUR_CLUBS(Figure.FOUR, Color.CLUBS),
    FIVE_CLUBS(Figure.FIVE, Color.CLUBS),
    SIX_CLUBS(Figure.SIX, Color.CLUBS),
    SEVEN_CLUBS(Figure.SEVEN, Color.CLUBS),
    EIGHT_CLUBS(Figure.EIGHT, Color.CLUBS),
    NINE_CLUBS(Figure.NINE, Color.CLUBS),
    TEN_CLUBS(Figure.TEN, Color.CLUBS),
    JACK_CLUBS(Figure.JACK, Color.CLUBS),
    QUEEN_CLUBS(Figure.QUEEN, Color.CLUBS),
    KING_CLUBS(Figure.KING, Color.CLUBS),
    ACE_CLUBS(Figure.ACE, Color.CLUBS),

    TWO_DIAMONDS(Figure.TWO, Color.DIAMONDS),
    THREE_DIAMONDS(Figure.THREE, Color.DIAMONDS),
    FOUR_DIAMONDS(Figure.FOUR, Color.DIAMONDS),
    FIVE_DIAMONDS(Figure.FIVE, Color.DIAMONDS),
    SIX_DIAMONDS(Figure.SIX, Color.DIAMONDS),
    SEVEN_DIAMONDS(Figure.SEVEN, Color.DIAMONDS),
    EIGHT_DIAMONDS(Figure.EIGHT, Color.DIAMONDS),
    NINE_DIAMONDS(Figure.NINE, Color.DIAMONDS),
    TEN_DIAMONDS(Figure.TEN, Color.DIAMONDS),
    JACK_DIAMONDS(Figure.JACK, Color.DIAMONDS),
    QUEEN_DIAMONDS(Figure.QUEEN, Color.DIAMONDS),
    KING_DIAMONDS(Figure.KING, Color.DIAMONDS),
    ACE_DIAMONDS(Figure.ACE, Color.DIAMONDS),

    TWO_HEARTS(Figure.TWO, Color.HEARTS),
    THREE_HEARTS(Figure.THREE, Color.HEARTS),
    FOUR_HEARTS(Figure.FOUR, Color.HEARTS),
    FIVE_HEARTS(Figure.FIVE, Color.HEARTS),
    SIX_HEARTS(Figure.SIX, Color.HEARTS),
    SEVEN_HEARTS(Figure.SEVEN, Color.HEARTS),
    EIGHT_HEARTS(Figure.EIGHT, Color.HEARTS),
    NINE_HEARTS(Figure.NINE, Color.HEARTS),
    TEN_HEARTS(Figure.TEN, Color.HEARTS),
    JACK_HEARTS(Figure.JACK, Color.HEARTS),
    QUEEN_HEARTS(Figure.QUEEN, Color.HEARTS),
    KING_HEARTS(Figure.KING, Color.HEARTS),
    ACE_HEARTS(Figure.ACE, Color.HEARTS),

    TWO_SPADES(Figure.TWO, Color.SPADES),
    THREE_SPADES(Figure.THREE, Color.SPADES),
    FOUR_SPADES(Figure.FOUR, Color.SPADES),
    FIVE_SPADES(Figure.FIVE, Color.SPADES),
    SIX_SPADES(Figure.SIX, Color.SPADES),
    SEVEN_SPADES(Figure.SEVEN, Color.SPADES),
    EIGHT_SPADES(Figure.EIGHT, Color.SPADES),
    NINE_SPADES(Figure.NINE, Color.SPADES),
    TEN_SPADES(Figure.TEN, Color.SPADES),
    JACK_SPADES(Figure.JACK, Color.SPADES),
    QUEEN_SPADES(Figure.QUEEN, Color.SPADES),
    KING_SPADES(Figure.KING, Color.SPADES),
    ACE_SPADES(Figure.ACE, Color.SPADES);

    private final Figure figure;

    private final Color color;

    BlackJackCard(final Figure figure,
                  final Color color) {
        this.figure = figure;
        this.color = color;
    }

}
