package de.whoa.RockPaperScissors;

import lombok.Getter;
import lombok.ToString;

@ToString
public class Game {

    @Getter
    private Bet playerABet;

    @Getter
    private Bet playerBBet;

    @Getter
    private Outcome outcome;

    public Game(Bet a, Bet b) {
        playerABet = a;
        playerBBet = b;
    }

    public void eval() {
        outcome = !(playerABet.beats(playerBBet) || playerBBet.beats(playerABet)) ? Outcome.DRAW
                : (playerABet.beats(playerBBet) ? Outcome.AWINS : Outcome.BWINS);
        System.out.println(toString());
    }

}
