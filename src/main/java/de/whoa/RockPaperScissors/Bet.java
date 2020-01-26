package de.whoa.RockPaperScissors;

public enum Bet {

    ROCK, PAPER, SCISSORS;
    private Bet beats;

    static {
        ROCK.beats = SCISSORS;
        PAPER.beats = ROCK;
        SCISSORS.beats = PAPER;
    }

    public boolean beats(Bet bet){
        return this.beats == bet;
    }
}
