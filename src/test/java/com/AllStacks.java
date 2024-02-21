package com;

import org.junit.Test;

import com.Structures.classes.Stacks.*;

import static org.junit.Assert.*;

public class AllStacks {

    @Test
    public void testPushAndPopll() {
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
    public void testTopll() {
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
    public void testSizell() {
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
    public void testIsEmptyll() {
        PostFixStackLl<Integer> stack = new PostFixStackLl<>();
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertFalse(stack.isEmpty());
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testPushAndPopA() {
        PostFixStackA<Integer> stack = new PostFixStackA<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.pop().intValue());
        assertEquals(2, stack.pop().intValue());
        assertEquals(1, stack.pop().intValue());
        assertTrue(stack.isEmpty());
    }

    
    @Test
    public void testTopA() {
        PostFixStackA<String> stack = new PostFixStackA<>();
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
    public void testSizeA() {
        PostFixStackA<Character> stack = new PostFixStackA<>();
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
    public void testIsEmptyA() {
        PostFixStackA<Integer> stack = new PostFixStackA<>();
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertFalse(stack.isEmpty());
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testPushAndPopV() {
        PostFixStackV<Integer> stack = new PostFixStackV<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.pop().intValue());
        assertEquals(2, stack.pop().intValue());
        assertEquals(1, stack.pop().intValue());
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testTopV() {
        PostFixStackV<String> stack = new PostFixStackV<>();
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
    public void testSizeV() {
        PostFixStackV<Character> stack = new PostFixStackV<>();
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
    public void testIsEmptyV() {
        PostFixStackV<Integer> stack = new PostFixStackV<>();
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertFalse(stack.isEmpty());
        stack.pop();
        assertTrue(stack.isEmpty());
    }

}