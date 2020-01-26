package de.whoa.RockPaperScissors;

import org.junit.Test;

import static de.whoa.RockPaperScissors.Bet.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestBets {

    @Test
    public void testBets(){
        assertThat(ROCK.beats(SCISSORS), is(true));
        assertThat(ROCK.beats(ROCK), is(false));
        assertThat(ROCK.beats(PAPER), is(false));

        assertThat(SCISSORS.beats(PAPER), is(true));
        assertThat(SCISSORS.beats(SCISSORS), is(false));
        assertThat(SCISSORS.beats(ROCK), is(false));

        assertThat(PAPER.beats(ROCK), is(true));
        assertThat(PAPER.beats(PAPER), is(false));
        assertThat(PAPER.beats(PAPER), is(false));
    }
}
