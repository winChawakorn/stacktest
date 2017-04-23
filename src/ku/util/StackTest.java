package ku.util;

import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * A JUnit test for testing every methods in Stack. It is created to help the
 * programmers fix the bug(s) in their Stack class.
 * 
 * @author Chawakorn Suphepre
 * @version 2017.04.23
 *
 */
public class StackTest {
	private Stack stack;

	/**
	 * Setup a stack to be tested.
	 */
	@Before
	public void setUp() {
		StackFactory.setStackType(1);
		stack = StackFactory.makeStack(2);
	}

	/**
	 * Test the method return a correctly value when a new stack is empty.
	 */
	@Test
	public void newStackIsEmpty() {
		assertTrue("isEmpty() doesn't return true when the stack is empty.",
				stack.isEmpty());
		assertFalse("isFull() doesn't return false when the stack is empty.",
				stack.isFull());
		assertEquals("size() doesn't return 0 when the stack is empty.", 0,
				stack.size());
		assertNull("peek() doesn't return null when the stack is empty.",
				stack.peek());
	}

	/**
	 * Test call pop() when the stack is empty. Test will the program throws the
	 * EmptyStackException.
	 */
	@Test(expected = java.util.EmptyStackException.class)
	public void testPopEmptyStack() {
		Assume.assumeTrue(stack.isEmpty());
		stack.pop();
	}

	/**
	 * Test the method return a correctly value when the stack is full.
	 */
	@Test
	public void stackIsFull() {
		String a = "a";
		String b = "b";
		stack.push(a);
		stack.push(b);
		assertTrue("isFull() doesn't return true when the stack is full.",
				stack.isFull());
		assertEquals(
				"Number of capacity is not equal to size() when the stack is full.",
				stack.capacity(), stack.size());
	}

	/**
	 * Test the method return a correctly value when peek the empty stack.
	 */
	@Test
	public void peekEmptyStack() {
		assertNull("peek() doesn't return null when the stack is empty",
				stack.peek());
	}

	/**
	 * Test the method return a correctly value when pop the stack.
	 */
	@Test
	public void testPop() {
		String a = "a";
		stack.push(a);
		int sizeBeforePop = stack.size();
		assertSame("pop() doesn't return the same object that recently pushed",
				a, stack.pop());
		assertEquals(
				"size() after pop() one time is not equal to size() before pop() minus 1.",
				sizeBeforePop - 1, stack.size());
	}

	/**
	 * Test push null object to the stack. Test will the program throws a
	 * correct exception.
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testPushNull() {
		Object o = null;
		stack.push(o);
	}

	/**
	 * Test push more than stack's capacity objects to the stack. Test will the
	 * program throws a correct exception.
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void overflowStack() {
		String a = "a";
		String b = "b";
		String c = "c";
		stack.push(a);
		stack.push(b);
		stack.push(c);
	}

	/**
	 * Test the method return a correctly value when push an object to the
	 * stack.
	 */
	@Test
	public void testPush() {
		String a = "a";
		stack.push(a);
		assertSame(
				"peek() doesn't return the same object that recent'y pushed.",
				a, stack.peek());
		assertEquals(
				"size() doesn't return 1 when there is one object pushed.", 1,
				stack.size());
		assertFalse(
				"isEmpty() doesn't return false when the stack is containing one object.",
				stack.isEmpty());
		assertFalse(
				"isFull() doesn't return false when there is one object in the stack and not reach the capacity.",
				stack.isFull());
		assertSame(
				"pop() doesn't return the same object that recent'y pushed.",
				a, stack.pop());
	}

	/**
	 * Test the method return a correctly value when peek the stack.
	 */
	@Test
	public void testPeek() {
		String a = "a";
		stack.push(a);
		int sizeBeforePeek = stack.size();
		int capacityBeforePeek = stack.capacity();
		assertSame(
				"peek() doesn't return the same object that recent'y pushed.",
				a, stack.peek());
		assertSame(
				"peek() doesn't return the same object that recent'y pushed.",
				a, stack.peek());
		assertEquals(
				"size() before peek() is not equal to size() after peek()",
				sizeBeforePeek, stack.size());
		assertEquals(
				"capacity() before peek() is not equal to capacity() after peek()",
				capacityBeforePeek, stack.capacity());
		assertFalse("isEmpty() doesn't return false after peek().",
				stack.isEmpty());
		assertFalse("isFull() doesn't return false after peek().",
				stack.isFull());
	}

}
