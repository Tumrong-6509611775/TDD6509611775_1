package core;


public class Stack implements IStack {
	
	int size;
	int max;
	int[] arr;
	
	public Stack(int size) {
		this.size = 0;
		this.max = size;
		arr = new int[size];
	}

	@Override
	public boolean isEmpty() {
		boolean empty = size == 0; 
		return empty;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public int getTop() {
		// TODO Auto-generated method stub
		return arr[size-1];
	}

	@Override
	public void push(int elm) throws Exception {
		if(this.isFull()) {
			throw new Exception("Stack is full");
		}
		arr[size] = elm;
		this.size++;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return max == size;
	}

	@Override
	public int pop() {
		size--;
		int bubble = arr[size];
		arr[size] = 0;
		return bubble;
	}
	
	

}