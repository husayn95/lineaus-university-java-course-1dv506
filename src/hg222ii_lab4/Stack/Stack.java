package hg222ii_lab4.Stack;

import java.util.Iterator;

public interface Stack {
	int size(); 				// Current stack size
	boolean isEmpty(); 			// True if stack is empty
	void push(Object element) throws Exception; 		// Add element at top of stack
	Object pop() throws Exception; 				// Return and remove top element,
						// exception if stack is empty.
	Object peek() throws Exception; 				// Return (without removing) top element,
						// exception if stack is empty.
	Iterator<Object> iterator(); 		// Element iterator
}
