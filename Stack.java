/*
 * stack-LIFO
 * (undo) 
 */

package stack;

import java.util.Stack;

public class TextEditorHistory {
	protected Stack<String> history;

	public TextEditorHistory() {
		history = new Stack<String>();
	}

	public void addToHistory(String currentVersion) {
		history.push(currentVersion);
	}

	public boolean canUndo() {		 // if empty, we cannot perform undo
		return !history.isEmpty();  // return true if history is not empty
	}

	public String undo() {
		if (!canUndo()) { 			// if canUndo is false. It means if history(Stack) is empty
			return null;
		}
		return history.pop();		// Pop - Removes the object at the top of this stack and returns thatobject as the value of this function
	}
}
