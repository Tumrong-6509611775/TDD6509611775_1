package core;

import junit.framework.TestCase;

public class JUNITStack extends TestCase {
	
	public void testCreateNewEmptyStack() {
		
		Stack s1= new Stack();
		int size = s1.getSize();
		
		assertEquals(0, size);
		assertTrue(s1.isEmpty());
				
	}
	
	public void testPushElmToTop() {
		
		Stack s1 = new Stack();
		assertFalse(s1.isFull());
		s1.push(1);
	
		assertEquals(1, s1.top());
		
	}
	
	public void testLastInFirstOut() {
		
		Stack s1 = new Stack();
		s1.push(new Integer(1));
		Object top = s1.top();
		int size = s1.getSize();
		
		assertEquals(1, s1.pop());
		assertEquals(size-1, s1.getSize());
	}
	
	
}
  