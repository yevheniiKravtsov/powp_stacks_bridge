package edu.kis.vh.stacks;

import edu.kis.vh.stacks.collections.StackList;

public class StackFIFO extends stack {

	public IStack temp = new StackList();
	
	public StackFIFO() {
		super();
	}

	public StackFIFO(IStack stack) {
		super(stack);
	}

	@Override
	public int pop() {
		while (!isEmpty())
		
		temp.push(super.pop());
		
		int ret = temp.pop();
		
		while (!temp.isEmpty())
	
		push(temp.pop());
		
		return ret;
	}
	//FIFO to jest kolejka, czyli lepiej wykorzystać stackList
}
