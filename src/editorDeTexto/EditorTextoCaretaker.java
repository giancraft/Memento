package editorDeTexto;

import java.util.Stack;

public class EditorTextoCaretaker {
	private Stack<EditorTextoMemento> undoStack = new Stack<>();
    private Stack<EditorTextoMemento> redoStack = new Stack<>();
    private EditorTexto editor;
    
    public EditorTextoCaretaker(EditorTexto editor) {
    	this.editor = editor;
    }
    
    public void write(String content) {
        undoStack.push(editor.save());
        editor.setContent(content);
        redoStack.clear();
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            redoStack.push(editor.save());
            editor.restore(undoStack.pop());
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            undoStack.push(editor.save());
            editor.restore(redoStack.pop());
        }
    }

    public void printContent() {
        System.out.println("Content: " + editor.getContent());
    }
}
