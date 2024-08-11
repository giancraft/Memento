package player;

public class PlayerMemento {
	private final int level;
    private final int healthPoints;
    private final int score;

    public PlayerMemento(int level, int healthPoints, int score) {
        this.level = level;
        this.healthPoints = healthPoints;
        this.score = score;
    }

    public int getLevel() {
        return level;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getScore() {
        return score;
    }

}
