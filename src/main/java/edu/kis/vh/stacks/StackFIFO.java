package edu.kis.vh.stacks;

public class StackFIFO extends stack {

	public stack temp = new stack();
	
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
}
