package domain.model;

public class Player {
    private String name;
    private int score;
    private String scoreName;

    public Player(String name) {
        setName(name);
        setScore(0);
        setScoreName("love");
    }

    public void increaseScore() {
        this.score++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getScoreName() {
        return scoreName;
    }

    public void setScoreName(String scoreName) {
        this.scoreName = scoreName;
    }
}
