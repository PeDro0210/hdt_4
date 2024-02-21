package com.Structures.classes;

import com.Structures.Interfaces.UVGList;

/**
 * Esta clase representa una lista enlazada genérica.
 * Implementa la interfaz UVGList.
 *
 * @param <T> el tipo de elementos almacenados en la lista.
 */
public class UVGLinkedList<T> implements UVGList<T> {

    public Node<T> head;

    public UVGLinkedList() {
        this.head = null;
    }

    /**
     * Agrega un elemento al inicio de la lista.
     *
     * @param value el elemento a agregar.
     */
    @Override
    public void add(T value) {
        Node<T> newNode = new Node<T>(value);
        newNode.next = head;
        head = newNode;
    }

    /**
     * Elimina y devuelve el último elemento de la lista.
     *
     * @return el último elemento de la lista, o null si la lista está vacía.
     */
    @Override
    public T removeLast() {
        if (head == null) {
            return null;
        }
        T value = head.data;
        head = head.next;
        return value;
    }

    /**
     * Imprime los elementos de la lista en orden.
     */
    public void printNodes() {
        Node<T> current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    /**
     * Devuelve el tamaño actual de la lista.
     *
     * @return el número de elementos en la lista.
     */
    public int size() {
        int count = 0;
        Node<T> current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    /**
     * Devuelve el primer elemento de la lista.
     *
     * @return el primer elemento de la lista.
     */
    public T getHead() {
        return head.data;
    }
}