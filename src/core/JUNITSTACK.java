package core;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

//https://github.com/Kittithara6509611544/TDD6509611544.git

public class JUNITStack extends TestCase {
	

	@Test
	public void testCreateNewEmptyStack() {
		Stack s1 = new Stack(20);
		int size = s1.getSize();
		
		assertEquals(0, size);
		assertTrue(s1.isEmpty());
	}
	
	@Test
	public void testPushStack() throws Exception {
		Stack s1 = new Stack(20);
		s1.push(1);
		int top = s1.getTop();
		assertEquals(1, top);
	}
	
	@Test
	public void testLastInFirstOut() throws Exception {
		Stack s1 = new Stack(20);
		s1.push(1);
		int pop = s1.pop();
		assertEquals(1, pop);
		
		for(int i=0;i<10;i++) {
			s1.push(i);
		}
		
		for(int i=9;i<0;i--) {
			pop = s1.pop();
			assertEquals(i, pop);
		}
	}
	
	@Test
	public void testPushLimitedSizeStack() throws Exception {
		Stack s1 = new Stack(20);
		for(int i=0;i<20;i++) {
			s1.push(i);
		}
		assertThrows(Exception.class, 
				()->{
					s1.push(1);
				}
				);
	}

}