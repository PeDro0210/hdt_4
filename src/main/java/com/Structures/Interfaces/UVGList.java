package com.Structures.Interfaces;

    /**
     * Interfaz que define las operaciones básicas de una lista.
     * @param <T> el tipo de elementos que contendrá la lista.
     */
public interface UVGList<T> {
    /**
     * Agrega un elemento a la lista.
     * @param value el valor del elemento a agregar.
     */
    void add(T value);


    
    /**
     * Remueve y devuelve el último elemento de la lista.
     * @return el último elemento de la lista.
     */
    T removeLast();
}