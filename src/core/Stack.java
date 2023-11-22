package core;

import java.util.ArrayList;

public class Stack implements IStack {
	
	private ArrayList<Object> elm;
	
	Stack(){
		elm = new ArrayList<Object>();
	}
	
	@Override
	public boolean isEmpty() {
		if(elm.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int getSize() {
		return elm.size();
	}

	@Override
	public void push(Object elm) {
		if (!isFull()) {
			this.elm.add(elm);
		}
	}

	@Override
	public Object top() {
		for (int i=0; i<elm.size(); i++) {
			if (i == elm.size()-1) {
				return elm.get(i);
			}
			else {
				continue;
			}
		}
		return 0;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public Object pop() {
		Object temp = null;
		for (int i=0; i<elm.size(); i++) {
			if (i == elm.size()-1) {
				temp = elm.get(i);
				elm.remove(i);
				return temp;
			}
			else {
				continue;
			}
		}
		return null;
	}

}