package es.ulpgc.game;

import es.ulpgc.deck.BlackJackCard;
import es.ulpgc.deck.Deck;
import es.ulpgc.players.Croupier;
import es.ulpgc.players.Player;
import es.ulpgc.players.PlayerAbstract;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameService {

    public PlayerAbstract[] getWinners(Player player1, Player player2, Player player3, Croupier croupier, Deck deck) {
        List<PlayerAbstract> players = List.of(player1, player2, player3, croupier);
        List<BlackJackCard> cards = deck.getCards();
        List<PlayerAbstract> winners = new ArrayList<>();
        for (int i = 0; i < players.size(); i++) {
            PlayerAbstract player = players.get(i);
            if (!player.hasBlackJack()) {
                BlackJackCard card = cards.get(i);
                player.addCard(card);
            }
            if (player.hasBlackJack()) {
                winners.add(player);
            }
        }
        return winners.toArray(new PlayerAbstract[0]);
    }



}
