package com.Structures.classes;

import com.Structures.Interfaces.UVGList;

public class UVGLinkedList<T> implements UVGList<T> {

    private Node<T> head;

    public UVGLinkedList() {
        this.head = null;
    }

    @Override
    public void add(T value) {
        Node<T> newNode = new Node<T>(value);
        newNode.next = head;
        head = newNode;

    }

    @Override
   
    public T removeLast() {
        if (head == null) {
            return null;
        }
        T value = head.data;
        head = head.next;
        return value;
    }


    public void printNodes() {
        Node<T> current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public int size() {
        int count = 0;
        Node<T> current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }



}