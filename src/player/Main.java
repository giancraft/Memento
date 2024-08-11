package player;

public class Main {

	public static void main(String[] args) {
		Player player = new Player();
        GameCaretaker caretaker = new GameCaretaker(player);

        player.set(1, 100, 500);
        caretaker.save();
        caretaker.printState();
        
        System.out.println();

        player.set(2, 80, 700);
        caretaker.save();
        caretaker.printState();

        System.out.println();
        
        player.set(3, 60, 900);
        caretaker.printState();

        System.out.println();
        
        caretaker.restore();
        caretaker.printState();

        System.out.println();
        
        caretaker.restore();
        caretaker.printState();
	}

}
