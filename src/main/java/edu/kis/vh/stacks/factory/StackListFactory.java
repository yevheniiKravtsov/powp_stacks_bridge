package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.stack;
import edu.kis.vh.stacks.collections.StackArray;
import edu.kis.vh.stacks.collections.StackList;

public class StackListFactory implements IstacksFactory {

	@Override
	public stack GetStandardStack() {
		return new stack(new StackList());
	}

	@Override
	public stack GetFalseStack() {
		return new stack(new StackArray());
	}

	@Override
	public StackFIFO GetFIFOStack() {
		return new StackFIFO(new StackList());
	}

	@Override
	public StackHanoi GetHanoiStack() {
		return new StackHanoi(new StackList());
	}

}
