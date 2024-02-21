package com;

import org.junit.Test;

import com.Structures.classes.Stacks.PostFixStackLl;

import static org.junit.Assert.*;

public class PostFixStackTest {

    @Test
    public void testPushAndPop() {
        PostFixStackLl<Integer> stack = new PostFixStackLl<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.pop().intValue());
        assertEquals(2, stack.pop().intValue());
        assertEquals(1, stack.pop().intValue());
        assertTrue(stack.isEmpty());
    }

    
    @Test
    public void testTop() {
        PostFixStackLl<String> stack = new PostFixStackLl<>();
        stack.push("Hello");
        stack.push("World");
        stack.push("!");
        assertEquals("!", stack.top());
        stack.pop();
        assertEquals("World", stack.top());
        stack.pop();
        assertEquals("Hello", stack.top());
        stack.pop();
        assertNull(stack.top());
    }

    @Test
    public void testSize() {
        PostFixStackLl<Character> stack = new PostFixStackLl<>();
        assertEquals(0, stack.size());
        stack.push('a');
        stack.push('b');
        stack.push('c');
        assertEquals(3, stack.size());
        stack.pop();
        assertEquals(2, stack.size());
        stack.pop();
        stack.pop();
        assertEquals(0, stack.size());
    }

    @Test
    public void testIsEmpty() {
        PostFixStackLl<Integer> stack = new PostFixStackLl<>();
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertFalse(stack.isEmpty());
        stack.pop();
        assertTrue(stack.isEmpty());
    }
}