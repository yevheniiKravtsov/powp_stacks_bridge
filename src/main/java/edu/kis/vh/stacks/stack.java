package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackList;

public class stack {
	
	private StackList stackList;

	public stack(StackList stackList) {
		super();
		this.stackList = stackList;
	}

	public stack() {
		super();
		stackList = new StackList();
	}

	public void push(int i) {
		stackList.push(i);
	}

	public boolean isEmpty() {
		return stackList.isEmpty();
	}

	public boolean isFull() {
		return stackList.isFull();
	}

	public int top() {
		return stackList.top();
	}

	public int pop() {
		return stackList.pop();
	}
	
	
	
}
