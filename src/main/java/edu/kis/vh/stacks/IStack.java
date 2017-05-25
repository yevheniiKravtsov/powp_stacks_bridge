package edu.kis.vh.stacks;

public interface IStack {

	public int STACK_EMPTY = -1;

	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

}