package player;

import java.util.Stack;

public class GameCaretaker {
	private Stack<PlayerMemento> saveStates = new Stack<>();
    private Player player;

    public GameCaretaker(Player player) {
        this.player = player;
    }

    public void save() {
        saveStates.push(player.save());
    }

    public void restore() {
        if (!saveStates.isEmpty()) {
            player.restore(saveStates.pop());
        }
    }

    public void printState() {
        System.out.println(player);
    }
}
