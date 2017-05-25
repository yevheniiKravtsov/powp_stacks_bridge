package edu.kis.vh.stacks;

import edu.kis.vh.stacks.collections.StackList;

public class stack {
	
	private IStack stack;

	public stack(IStack stack) {
		super();
		this.stack = stack;
	}

	public stack() {
		super();
		stack = new StackList();
	}

	public void push(int i) {
		stack.push(i);
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}

	public boolean isFull() {
		return stack.isFull();
	}

	public int top() {
		return stack.top();
	}

	public int pop() {
		return stack.pop();
	}
	
	//Uzyqajac interfejsu mozemy korzystac zamiennie z klas StackArray i StackList
	
	//F3 wskazuje nam na deklaracje metode w interfejsie. Ctrl+przycisk tez wskazuje nam na implementacje metode
	
}
