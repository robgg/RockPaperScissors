package de.whoa.RockPaperScissors;

import org.junit.Test;

import static de.whoa.RockPaperScissors.Bet.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestGame {

    @Test
    public void testAWins(){

        Game underTest = new Game(ROCK, SCISSORS);
        underTest.eval();
        assertThat(underTest.getOutcome(), is(equalTo(Outcome.AWINS)));
        //assertThat the bet yields the same result
        assertThat(underTest.getOutcome() == Outcome.AWINS, is(equalTo(ROCK.beats(SCISSORS))));

        underTest = new Game(PAPER, ROCK);
        underTest.eval();
        assertThat(underTest.getOutcome(), is(equalTo(Outcome.AWINS)));
        //assertThat the bet yields the same result
        assertThat(underTest.getOutcome() == Outcome.AWINS, is(equalTo(PAPER.beats(ROCK))));

        underTest = new Game(SCISSORS, PAPER);
        underTest.eval();
        assertThat(underTest.getOutcome(), is(equalTo(Outcome.AWINS)));
        //assertThat the bet yields the same result
        assertThat(underTest.getOutcome() == Outcome.AWINS, is(equalTo(SCISSORS.beats(PAPER))));
    }

    @Test
    public void testBWins(){

        Game underTest = new Game(ROCK, PAPER);
        underTest.eval();
        assertThat(underTest.getOutcome(), is(equalTo(Outcome.BWINS)));
        //assertThat the bet yields the same result
        assertThat(underTest.getOutcome() == Outcome.BWINS, is(equalTo(PAPER.beats(ROCK))));

        underTest = new Game(PAPER, SCISSORS);
        underTest.eval();
        assertThat(underTest.getOutcome(), is(equalTo(Outcome.BWINS)));
        //assertThat the bet yields the same result
        assertThat(underTest.getOutcome() == Outcome.BWINS, is(equalTo(SCISSORS.beats(PAPER))));

        underTest = new Game(SCISSORS, ROCK);
        underTest.eval();
        assertThat(underTest.getOutcome(), is(equalTo(Outcome.BWINS)));
        //assertThat the bet yields the same result
        assertThat(underTest.getOutcome() == Outcome.BWINS, is(equalTo(ROCK.beats(SCISSORS))));
    }

    @Test
    public void testDraws(){

        Game underTest = new Game(ROCK, ROCK);
        underTest.eval();
        assertThat(underTest.getOutcome(), is(equalTo(Outcome.DRAW)));
        //assertThat the bet yields the same result
        assertThat(underTest.getOutcome() == Outcome.AWINS || underTest.getOutcome() == Outcome.BWINS,
                is(equalTo(ROCK.beats(ROCK))));

        underTest = new Game(PAPER, PAPER);
        underTest.eval();
        assertThat(underTest.getOutcome(), is(equalTo(Outcome.DRAW)));
        //assertThat the bet yields the same result
        assertThat(underTest.getOutcome() == Outcome.AWINS || underTest.getOutcome() == Outcome.BWINS,
                is(equalTo(PAPER.beats(PAPER))));

        underTest = new Game(SCISSORS, SCISSORS);
        underTest.eval();
        assertThat(underTest.getOutcome(), is(equalTo(Outcome.DRAW)));
        //assertThat the bet yields the same result
        assertThat(underTest.getOutcome() == Outcome.AWINS || underTest.getOutcome() == Outcome.BWINS,
                is(equalTo(SCISSORS.beats(SCISSORS))));
    }

}
