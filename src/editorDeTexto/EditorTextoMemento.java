package editorDeTexto;

public class EditorTextoMemento {
	private final String state;
	
	public EditorTextoMemento(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}
}
