package de.whoa;

import de.whoa.RockPaperScissors.Bet;
import de.whoa.RockPaperScissors.Game;
import de.whoa.RockPaperScissors.Outcome;

import java.util.EnumMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RockPaperScissorsRunner {

    public static void main(String[] args) {

        Bet[] PlayerBBet = new Bet[]{Bet.ROCK, Bet.PAPER, Bet.SCISSORS};
        Random rand = new Random();

        Map<Outcome, Long> aggregatedResults = Stream
                .generate(() -> new Game(Bet.ROCK, PlayerBBet[rand.nextInt(PlayerBBet.length)])).limit(100)
                .peek(Game::eval)
                .collect(Collectors.groupingBy(Game::getOutcome, Collectors.counting()));

        System.out.printf("100 games resulted in %d draws, %d wins for player a and %d wins for player b%n",
                aggregatedResults.get(Outcome.DRAW), aggregatedResults.get(Outcome.AWINS), aggregatedResults.get(Outcome.BWINS));

    }

}
