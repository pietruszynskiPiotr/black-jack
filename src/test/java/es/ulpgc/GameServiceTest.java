package es.ulpgc;


import es.ulpgc.deck.BlackJackCard;
import es.ulpgc.deck.Deck;
import es.ulpgc.game.GameService;
import es.ulpgc.players.Croupier;
import es.ulpgc.players.Player;
import es.ulpgc.players.PlayerAbstract;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;

import static es.ulpgc.deck.BlackJackCard.*;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@SpringBootTest(classes = {GameService.class})
@RunWith(SpringRunner.class)
public class GameServiceTest {

    @Autowired
    private GameService gameService;

    @Test
    public void getWinners_givenPlayer1BJPlayer2NoBJSelectsCardNoBJPlayer3NoBJSelectsCardNoBJCroupierNoBJLessThanSeventeenSelectsCardNoBJ_shouldPlayer1Wins() {
        // given
        Player player1 = new Player(Set.of(JACK_CLUBS, ACE_CLUBS));
        Player player2 = new Player(Set.of(TEN_DIAMONDS, FIVE_DIAMONDS, SIX_DIAMONDS));
        Player player3 = new Player(Set.of(THREE_HEARTS, SIX_HEARTS, ACE_HEARTS, THREE_CLUBS, ACE_DIAMONDS, KING_HEARTS));
        Croupier croupier = new Croupier(Set.of(NINE_SPADES, SEVEN_SPADES));

        Deck deck = new Deck(new BlackJackCard[]{
                FIVE_SPADES, FOUR_SPADES, KING_SPADES, TWO_SPADES
        });

        // when
        PlayerAbstract[] actualWinners = gameService.getWinners(player1, player2, player3, croupier, deck);

        // then
        PlayerAbstract[] expectedWinners = new PlayerAbstract[]{player1};
        assertEquals(1, actualWinners.length);
        assertArrayEquals(expectedWinners, actualWinners);
    }

    @Test
    public void getWinners_givenPlayer1NoBJSelectsBJPlayer2NoBJSelectsBJPlayer3NoBJSelectsCardNoBJCroupierNoBJLessThanSeventeenSelectsCardNoBJ_shouldPlayer1AndPlayer3Wins() {
        // given
        Player player1 = new Player(Set.of(TEN_CLUBS, KING_CLUBS));
        Player player2 = new Player(Set.of(TEN_DIAMONDS, TWO_DIAMONDS, SIX_DIAMONDS));
        Player player3 = new Player(Set.of(EIGHT_CLUBS, EIGHT_HEARTS, FIVE_HEARTS));
        Croupier croupier = new Croupier(Set.of(FIVE_SPADES, TEN_SPADES));
        Deck deck = new Deck(new BlackJackCard[]{
                ACE_HEARTS, THREE_HEARTS, KING_SPADES, TWO_SPADES
        });

        // when
        PlayerAbstract[] actualWinners = gameService.getWinners(player1, player2, player3, croupier, deck);

        // then
        PlayerAbstract[] expectedWinners = new PlayerAbstract[]{player1, player3};
        assertEquals(2, actualWinners.length);
        assertArrayEquals(expectedWinners, actualWinners);
    }

}
