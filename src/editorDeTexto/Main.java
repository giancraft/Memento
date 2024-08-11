package editorDeTexto;

public class Main {

	public static void main(String[] args) {
		EditorTexto editor = new EditorTexto();
		EditorTextoCaretaker caretaker = new EditorTextoCaretaker(editor);
		
		 caretaker.write("Hello, World!\n");
	     caretaker.printContent();

	     caretaker.write("Hello, Design Patterns!\n");
	     caretaker.printContent();

	     caretaker.undo();
	     caretaker.printContent();

	     caretaker.redo();
	     caretaker.printContent();
	}

}
