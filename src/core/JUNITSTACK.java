package core;

import junit.framework.TestCase;

public class JUNITStack extends TestCase {
	
	
	public void testCreateNewEmptyStack() {

		Stack s1 = new Stack();
		int size = s1.getSize();
		
		assertEquals(0, size);
		boolean empty = s1.isEmpty();
		assertTrue(empty);
	}
	
	public void testPushElmToTop() {

		Stack s1 = new Stack();
		s1.push(1);
		int size = s1.getSize();
		assertEquals(1,size);
		boolean empty = s1.isEmpty();
		assertFalse(empty);
		
	}
	
	public void LastInFirstOut() {
		
		Stack stack = new Stack();


        stack.push(1);
        stack.push(2);
        stack.push(3);

        
        System.out.println("Stack: " + stack.peek());

    
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);


        System.out.println("Stack: " + stack.peek());
        

	}
	


}