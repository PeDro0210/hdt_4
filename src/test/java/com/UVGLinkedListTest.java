package com;

import org.junit.Test;

import com.Structures.classes.UVGLinkedList;

import static org.junit.Assert.*;

public class UVGLinkedListTest {

    @Test
    public void testAdd() {
        UVGLinkedList<Integer> list = new UVGLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(3, list.size());
    }

    @Test
    public void testRemoveLast() {
        UVGLinkedList<String> list = new UVGLinkedList<>();
        list.add("Hello");
        list.add("World");
        list.add("!");
        String removed = list.removeLast();
        assertEquals("!", removed);
        assertEquals(2, list.size());
    }

    
    @Test
    public void testPrintNodes() {
        UVGLinkedList<Character> list = new UVGLinkedList<>();
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        list.add('e');
        list.add('f');
        list.add('g');
        list.add('h');
        list.add('i');
        list.add('j');
        list.add('k');
        list.add('l');
        list.add('m');
        list.add('n');
        list.add('o');
        list.add('p');
        list.add('q');
        list.add('r');
        list.add('s');
        list.add('t');
        list.add('u');
        list.add('v');
        list.add('w');
        list.add('x');
        list.add('y');
        list.add('z');
        list.printNodes();
    }
}