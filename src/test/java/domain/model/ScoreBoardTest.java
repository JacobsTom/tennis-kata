package domain.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScoreBoardTest {

    private ScoreBoard scoreBoard;
    private static final String A = "A";
    private static final String B = "B";

    @Before
    public void setup() {
        this.scoreBoard = new ScoreBoard(A, B);
    }

    @Test
    public void givenStartOfGame_thenScoresAreLove() {
        assertEquals("love", this.scoreBoard.getScoreNameForPlayer(A));
        assertEquals("love", this.scoreBoard.getScoreNameForPlayer(B));
    }

    @Test
    public void givenPlayerScoresOnce_thenScoreIsFifteen() {
        scoreBoard.increaseScoreForPlayer(A);

        assertEquals("fifteen", this.scoreBoard.getScoreNameForPlayer(A));
        assertEquals("love", this.scoreBoard.getScoreNameForPlayer(B));
    }

    @Test
    public void givenPlayerScoresTwice_thenScoreIsThirty() {
        scoreBoard.increaseScoreForPlayer(A);
        scoreBoard.increaseScoreForPlayer(A);

        assertEquals("thirty", this.scoreBoard.getScoreNameForPlayer(A));
        assertEquals("love", this.scoreBoard.getScoreNameForPlayer(B));
    }

    @Test
    public void givenPlayerScoresThrice_thenScoreIsForty() {
        scoreBoard.increaseScoreForPlayer(A);
        scoreBoard.increaseScoreForPlayer(A);
        scoreBoard.increaseScoreForPlayer(A);

        assertEquals("forty", this.scoreBoard.getScoreNameForPlayer(A));
        assertEquals("love", this.scoreBoard.getScoreNameForPlayer(B));
    }

    @Test
    public void givenPlayerScoresFourTimes_thenScoreIsWinner() {
        scoreBoard.increaseScoreForPlayer(A);
        scoreBoard.increaseScoreForPlayer(A);
        scoreBoard.increaseScoreForPlayer(A);
        scoreBoard.increaseScoreForPlayer(A);

        assertEquals("winner", this.scoreBoard.getScoreNameForPlayer(A));
        assertEquals("loser", this.scoreBoard.getScoreNameForPlayer(B));
    }

    @Test
    public void givenPlayersBothScoresFourTimes_thenScoreIsDeuce() {
        scoreBoard.increaseScoreForPlayer(A);
        scoreBoard.increaseScoreForPlayer(A);
        scoreBoard.increaseScoreForPlayer(A);
        scoreBoard.increaseScoreForPlayer(A);

        scoreBoard.increaseScoreForPlayer(B);
        scoreBoard.increaseScoreForPlayer(B);
        scoreBoard.increaseScoreForPlayer(B);
        scoreBoard.increaseScoreForPlayer(B);

        assertEquals("deuce", this.scoreBoard.getScoreNameForPlayer(A));
        assertEquals("deuce", this.scoreBoard.getScoreNameForPlayer(B));
    }

    @Test
    public void givenPlayerGetsAdvantage_thenScoreIsAdvantage() {
        scoreBoard.increaseScoreForPlayer(A);
        scoreBoard.increaseScoreForPlayer(A);
        scoreBoard.increaseScoreForPlayer(A);

        scoreBoard.increaseScoreForPlayer(B);
        scoreBoard.increaseScoreForPlayer(B);
        scoreBoard.increaseScoreForPlayer(B);

        scoreBoard.increaseScoreForPlayer(A);

        assertEquals("advantage", this.scoreBoard.getScoreNameForPlayer(A));
        assertEquals("disadvantage", this.scoreBoard.getScoreNameForPlayer(B));
    }
}
