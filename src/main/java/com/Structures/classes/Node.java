package com.Structures.classes;


/**
 * Clase que representa un nodo en una estructura de datos enlazada.
 * Cada nodo contiene un dato de tipo T y una referencia al siguiente nodo.
 *
 * @param <T> el tipo de dato almacenado en el nodo
 */
public class Node<T> {
    public T data;
    public Node<T> next;

    /**
     * Constructor que crea un nuevo nodo con el dato especificado.
     *
     * @param data el dato a almacenar en el nodo
     */
    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

