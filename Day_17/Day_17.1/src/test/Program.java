package test;

import java.lang.Thread.State;

public class Program 
{
	public static void main(String[] args)
	{
		State[] states = State.values();
		for (State state : states) 
		{
			System.out.println(state.name()+"	"+state.ordinal());
		}
	}
}