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
        List<PlayerAbstract> players = List.of(player1, player2, player3);
        List<BlackJackCard> cards = deck.getCards();
        List<PlayerAbstract> winners = new ArrayList<>();
        addCardsToCroupier(croupier, cards);
        findWinners(croupier, players, winners);
        return winners.toArray(new PlayerAbstract[0]);
    }

    private void addCardsToCroupier(Croupier croupier, List<BlackJackCard> cards) {
        int cardNumber = 0;
        while (croupier.getPointsNumber() < 17) {
            BlackJackCard card = cards.get(cardNumber);
            croupier.addCard(card);
            cardNumber++;
        }
    }

    private void findWinners(Croupier croupier, List<PlayerAbstract> players, List<PlayerAbstract> winners) {
        players.forEach(p -> {
            if (p.hasBlackJack() && !croupier.hasBlackJack()) {
                winners.add(p);
            } else if (p.getPointsNumber() <= 21 && croupier.getPointsNumber() < p.getPointsNumber()) {
                winners.add(p);
            }
        });
    }

}
