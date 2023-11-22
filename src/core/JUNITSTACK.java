package core;

import junit.framework.TestCase;

public class JUNITSTACK extends TestCase {
	
	public void testCreateNewEmptyStack() {
		
		Stack s1 = new Stack();
		int size = s1.getSize();
		
		assertEquals(0, size);
		assertTrue(s1.isEmpty());
		
	}
	
	public void testPushElmToTop() {
		
		Stack s1 = new Stack();
		
	}
}
