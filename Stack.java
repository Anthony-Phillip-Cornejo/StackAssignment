/**
 * This is the class to implement a stack.
 * 
 * The stack should hold string data and have a constructor with one
 * integer parameter (the size of the stack).
 *
 * You have the freedom to choose how to implement your stack using any
 * of the data structures we have already studied (arrays, ArrayLists,
 * linked lists, binary trees, etc.).
 * 
 * @author Michael Ida
 *
 */
public class Stack implements StackInterface {

	// Set up the basic elements of your data structure here.
	
	/*
	 * This is the constructor for the Stack class.  Notice
	 * there is one integer parameter (the size of the stack).
	 */
	String[] stackArray;
	
	public Stack(int size) {
		stackArray = new String[size];
	}
	
	public boolean push(String record) {
		for(int i = 0; i < stackArray.length; i++){
			if(stackArray[i] == null) {
				stackArray[i] = record;
				return true;
			}			
		}
		return false;
	}
	
	public String pop() {
		for(int i = 0; i < stackArray.length - 1; i++) {
			if(stackArray[i+1] == null) {
				String returnn = stackArray[i]; 
				stackArray[i] = null;
				return returnn;
			} 
		}
		String returnnn = stackArray[stackArray.length - 1];
		stackArray[stackArray.length - 1] = null;
		return returnnn;
	}
	
	public void printStack() {
		for(int i = stackArray.length - 1; i > -1; i--) {
			if(stackArray[i] == null) {
				//do nothing
			} else {
				System.out.println(stackArray[i]);
			}
		}
	}
	
}
