package player;

public class Player {
	private int level;
    private int healthPoints;
    private int score;

    public void set(int level, int healthPoints, int score) {
        this.level = level;
        this.healthPoints = healthPoints;
        this.score = score;
    }

    public PlayerMemento save() {
        return new PlayerMemento(level, healthPoints, score);
    }

    public void restore(PlayerMemento memento) {
        this.level = memento.getLevel();
        this.healthPoints = memento.getHealthPoints();
        this.score = memento.getScore();
    }

    @Override
    public String toString() {
        return "Player [level=" + level + ", healthPoints=" + healthPoints + ", score=" + score + "]";
    }
}
