package editorDeTexto;

public class EditorTexto {
	private String content;

	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public EditorTextoMemento save() {
		return new EditorTextoMemento(content);
	}
	
	public void restore (EditorTextoMemento memento) {
		content = memento.getState();
	}
}
