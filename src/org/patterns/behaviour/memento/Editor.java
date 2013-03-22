/**
 * 
 */
package org.patterns.behaviour.memento;

/**
 * @author Purna
 * 
 */
public class Editor {

	String contents;
	EditorMemento editorMemento;
	Editor(){
		editorMemento=new EditorMemento();
	}
	public void save(String content) {
		editorMemento.setContent(contents);
		this.contents = content;
	}

	/**
	 * 
	 */
	public void restore() {
		this.contents = editorMemento.contents;

	}

}
