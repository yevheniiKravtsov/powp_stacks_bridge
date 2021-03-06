package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.stack;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;
import edu.kis.vh.stacks.factory.StackArrayFactory;
import edu.kis.vh.stacks.factory.StackListFactory;

class StacksDemo {

	public static void main(String[] args) {
		defaultStacksFactoryTest();
		stackArrayFactoryTest();
		stackListFactoryTest();
	}
	public static void defaultStacksFactoryTest() {
		System.out.println("DefaultStacksFactory\n");
		DefaultStacksFactory factory = new DefaultStacksFactory();
		
		stack[] stacks = { factory.GetStandardStack(), factory.GetFalseStack(),
				factory.GetFIFOStack(), factory.GetHanoiStack()};
		
		for (int i = 1; i < 15; i++)
			for (int j = 0; j < 3; j++)
				stacks[j].push(i);
			
			java.util.Random rn = new java.util.Random();
			for (int i = 1; i < 15; i++)
				stacks[3].push(rn.nextInt(20));
			
			for (int i = 0; i < stacks.length; i++) {
				while (!stacks[i].isEmpty())
					System.out.print(stacks[i].pop() + "  ");
					System.out.println();
			}
		
		System.out.println("total rejected is "
				+ ((StackHanoi) stacks[3]).reportRejected());
		
	}
	public static void stackArrayFactoryTest() {
		System.out.println("StackArrayFactory\n");
		StackArrayFactory factory = new StackArrayFactory();
		
		stack[] stacks = { factory.GetStandardStack(), factory.GetFalseStack(),
				factory.GetFIFOStack(), factory.GetHanoiStack()};
		
		for (int i = 1; i < 15; i++)
			for (int j = 0; j < 3; j++)
				stacks[j].push(i);
			
			java.util.Random rn = new java.util.Random();
			for (int i = 1; i < 15; i++)
				stacks[3].push(rn.nextInt(20));
			
			for (int i = 0; i < stacks.length; i++) {
				while (!stacks[i].isEmpty())
					System.out.print(stacks[i].pop() + "  ");
					System.out.println();
			}
		
		System.out.println("total rejected is "
				+ ((StackHanoi) stacks[3]).reportRejected());
		
	}
	public static void stackListFactoryTest() {
		System.out.println("StackListFactory\n");
		StackListFactory factory = new StackListFactory();
		
		stack[] stacks = { factory.GetStandardStack(), factory.GetFalseStack(),
				factory.GetFIFOStack(), factory.GetHanoiStack()};
		
		for (int i = 1; i < 15; i++)
			for (int j = 0; j < 3; j++)
				stacks[j].push(i);
			
			java.util.Random rn = new java.util.Random();
			for (int i = 1; i < 15; i++)
				stacks[3].push(rn.nextInt(20));
			
			for (int i = 0; i < stacks.length; i++) {
				while (!stacks[i].isEmpty())
					System.out.print(stacks[i].pop() + "  ");
					System.out.println();
			}
		
		System.out.println("total rejected is "
				+ ((StackHanoi) stacks[3]).reportRejected());
		
	}
}