package controller;

import domain.model.ScoreBoard;

public class Controller {
    private ScoreBoard scoreBoard;

    public Controller(String player1, String player2) {
        this.scoreBoard = new ScoreBoard(player1, player2);
    }

    public void increaseScoreForPlayer(String name) {
        this.scoreBoard.increaseScoreForPlayer(name);
    }

    public String getScoreForPlayer(String name) {
        return this.scoreBoard.getScoreNameForPlayer(name);
    }
}
