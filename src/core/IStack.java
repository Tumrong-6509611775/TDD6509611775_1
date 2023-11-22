package core;

public interface IStack {
		boolean isFull();
		boolean isEmpty();
		int  getSize();
		void push(int elm);
		Stack top();
}
