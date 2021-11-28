package deck;

public enum BlackJackCard {

    ACE_CLUBS(Figure.ACE, Color.CLUBS, 1),
    TWO_CLUBS(Figure.TWO, Color.CLUBS, 2),
    THREE_CLUBS(Figure.THREE, Color.CLUBS, 3),
    FOUR_CLUBS(Figure.FOUR, Color.CLUBS, 4),
    FIVE_CLUBS(Figure.FIVE, Color.CLUBS, 5),
    SIX_CLUBS(Figure.SIX, Color.CLUBS, 6),
    SEVEN_CLUBS(Figure.SEVEN, Color.CLUBS, 7),
    EIGHT_CLUBS(Figure.EIGHT, Color.CLUBS, 8),
    NINE_CLUBS(Figure.NINE, Color.CLUBS, 9),
    TEN_CLUBS(Figure.TEN, Color.CLUBS, 10),
    JACK_CLUBS(Figure.JACK, Color.CLUBS, 10),
    QUEEN_CLUBS(Figure.QUEEN, Color.CLUBS, 10),
    KING_CLUBS(Figure.KING, Color.CLUBS, 10),

    ACE_DIAMONDS(Figure.ACE, Color.DIAMONDS, 1),
    TWO_DIAMONDS(Figure.TWO, Color.DIAMONDS, 2),
    THREE_DIAMONDS(Figure.THREE, Color.DIAMONDS, 3),
    FOUR_DIAMONDS(Figure.FOUR, Color.DIAMONDS, 4),
    FIVE_DIAMONDS(Figure.FIVE, Color.DIAMONDS, 5),
    SIX_DIAMONDS(Figure.SIX, Color.DIAMONDS, 6),
    SEVEN_DIAMONDS(Figure.SEVEN, Color.DIAMONDS, 7),
    EIGHT_DIAMONDS(Figure.EIGHT, Color.DIAMONDS, 8),
    NINE_DIAMONDS(Figure.NINE, Color.DIAMONDS, 9),
    TEN_DIAMONDS(Figure.TEN, Color.DIAMONDS, 10),
    JACK_DIAMONDS(Figure.JACK, Color.DIAMONDS, 10),
    QUEEN_DIAMONDS(Figure.QUEEN, Color.DIAMONDS, 10),
    KING_DIAMONDS(Figure.KING, Color.DIAMONDS, 10),

    ACE_HEARTS(Figure.ACE, Color.HEARTS, 1),
    TWO_HEARTS(Figure.TWO, Color.HEARTS, 2),
    THREE_HEARTS(Figure.THREE, Color.HEARTS, 3),
    FOUR_HEARTS(Figure.FOUR, Color.HEARTS, 4),
    FIVE_HEARTS(Figure.FIVE, Color.HEARTS, 5),
    SIX_HEARTS(Figure.SIX, Color.HEARTS, 6),
    SEVEN_HEARTS(Figure.SEVEN, Color.HEARTS, 7),
    EIGHT_HEARTS(Figure.EIGHT, Color.HEARTS, 8),
    NINE_HEARTS(Figure.NINE, Color.HEARTS, 9),
    TEN_HEARTS(Figure.TEN, Color.HEARTS, 10),
    JACK_HEARTS(Figure.JACK, Color.HEARTS, 10),
    QUEEN_HEARTS(Figure.QUEEN, Color.HEARTS, 10),
    KING_HEARTS(Figure.KING, Color.HEARTS, 10),

    ACE_SPADES(Figure.ACE, Color.SPADES, 1),
    TWO_SPADES(Figure.TWO, Color.SPADES, 2),
    THREE_SPADES(Figure.THREE, Color.SPADES, 3),
    FOUR_SPADES(Figure.FOUR, Color.SPADES, 4),
    FIVE_SPADES(Figure.FIVE, Color.SPADES, 5),
    SIX_SPADES(Figure.SIX, Color.SPADES, 6),
    SEVEN_SPADES(Figure.SEVEN, Color.SPADES, 7),
    EIGHT_SPADES(Figure.EIGHT, Color.SPADES, 8),
    NINE_SPADES(Figure.NINE, Color.SPADES, 9),
    TEN_SPADES(Figure.TEN, Color.SPADES, 10),
    JACK_SPADES(Figure.JACK, Color.SPADES, 10),
    QUEEN_SPADES(Figure.QUEEN, Color.SPADES, 10),
    KING_SPADES(Figure.KING, Color.SPADES, 10);

    private final Figure figure;

    private final Color color;

    private final Integer value;

    BlackJackCard(final Figure figure,
                  final Color color,
                  final Integer value) {
        this.figure = figure;
        this.color = color;
        this.value = value;
    }

}
