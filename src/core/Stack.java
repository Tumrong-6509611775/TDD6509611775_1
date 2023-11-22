package core;

import java.util.ArrayList;
import java.util.List;

public class Stack implements IStack {
	
	arr = new int[size];
	
	public Stack() {
		this.items = new ArrayList<>();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public void push(int i) {
		arr[getSize()] = i;
	}

	@Override
	public Stack top() {
		return (Stack) items;
	}

}
