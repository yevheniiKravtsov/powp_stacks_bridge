package edu.kis.vh.stacks.collections;

import edu.kis.vh.stacks.IStack;

public class StackArray implements IStack {
	private int[] ITEMS = new int[12];	

	public int total = -1;
	
	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStack#push(int)
	 */
	@Override
	public void push(int i) {
		if (!isFull())
		ITEMS[++total] = i;
	}
	
	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStack#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return total == -1;
	}
	
	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStack#isFull()
	 */
	@Override
	public boolean isFull() {
		return total == 11;
	}
			
	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStack#top()
	 */
	@Override
	public int top() {
		if (isEmpty())
			return -1;
		return ITEMS[total];
	}
				
	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStack#pop()
	 */
	@Override
	public int pop() {
		if (isEmpty())
			return -1;
		return ITEMS[total--];
	}
}
