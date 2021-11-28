package es.ulpgc.game;

import es.ulpgc.deck.BlackJackCard;
import es.ulpgc.deck.Deck;
import es.ulpgc.players.Croupier;
import es.ulpgc.players.Player;
import es.ulpgc.players.PlayerAbstract;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.IntStream;

@Service
public class Game {

    public PlayerAbstract[] getWinners(Player player1, Player player2, Player player3, Croupier croupier, Deck deck) {
        List<PlayerAbstract> players = List.of(player1, player2, player3, croupier);
        List<BlackJackCard> cards = deck.getCards();
        IntStream.of(1, cards.size())
                .forEach(
                        i -> {
                            PlayerAbstract player = players.get(i);
                            if (!player.hasBlackJack()) {
                                if (player.isCroupier()) {
                                    Croupier player4 = (Croupier) player;
                                    if (player4.canGetCard()) {
                                        addCard(cards, i, player);
                                    }
                                } else {
                                    addCard(cards, i, player);
                                }

                            }
                        }
                );


        return null;
    }

    private void addCard(List<BlackJackCard> cards, int i, PlayerAbstract player) {
        BlackJackCard card = cards.get(i);
        player.addCard(card);
    }

}
