package domain.model;

public class ScoreBoard {

    private Player player1;
    private Player player2;

    public ScoreBoard(String name1, String name2) {
        this.player1 = new Player(name1);
        this.player2 = new Player(name2);
    }

    public String getScoreNameForPlayer(String name) {
        return getPlayer(name).getScoreName();
    }

    public void increaseScoreForPlayer(String name) {
        Player player = getPlayer(name);
        player.increaseScore();
        int score = player.getScore();

        if (score == 1) {
            player.setScoreName("fifteen");
        } else if (score == 2) {
            player.setScoreName("thirty");
        } else if (score == 3) {
            player.setScoreName("forty");
        } else if (score >= 4) {
            int otherScore = getOtherPlayer(name).getScore();
            Player other = getOtherPlayer(name);
            if (score == otherScore) {
                player.setScoreName("deuce");
                other.setScoreName("deuce");
            } else if (score == otherScore + 1) {
                player.setScoreName("advantage");
                other.setScoreName("disadvantage");
            } else if (score >= otherScore + 2) {
                player.setScoreName("winner");
                other.setScoreName("loser");
            }
        }

    }

    private Player getPlayer(String name) {
        if (this.player1.getName().equals(name)) {
            return player1;
        } else {
            return player2;
        }
    }

    private Player getOtherPlayer(String name) {
        if (!this.player1.getName().equals(name)) {
            return player1;
        } else {
            return player2;
        }
    }



}
