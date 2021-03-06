package edu.kis.vh.stacks;

public class StackHanoi extends stack {

public StackHanoi() {
		super();
	}

	public StackHanoi(IStack stack) {
		super(stack);
	}

int totalRejected = 0;

	public int reportRejected() {
	return totalRejected;
	}

	public void push(int in) {
	if (!isEmpty() && in > top())
		totalRejected++;
		else
			super.push(in);
	}
}
