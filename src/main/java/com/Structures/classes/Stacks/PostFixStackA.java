package com.Structures.classes.Stacks;

import com.Structures.Interfaces.DynamicStack;
import java.util.ArrayList;

/**
 * Implementación de una pila dinámica utilizando una lista enlazada.
 * Esta clase representa una pila en la cual los elementos se agregan y eliminan
 * siguiendo el principio de LIFO (Last In, First Out).
 * Permite realizar operaciones como agregar elementos, eliminar elementos,
 * obtener el elemento en la cima de la pila, obtener el tamaño de la pila
 * y verificar si la pila está vacía.
 *
 * @param <T> el tipo de elementos que se almacenarán en la pila
 */
public class PostFixStackA<T> implements DynamicStack<T> {

    public ArrayList<T> stack;

    /**
     * Crea una nueva instancia de PostFixStack.
     * Inicializa la lista enlazada interna utilizada para almacenar los elementos
     * de la pila.
     */
    public PostFixStackA() {
        this.stack = new ArrayList<T>();
    }

    /**
     * Agrega un elemento a la cima de la pila.
     *
     * @param value el elemento a agregar
     */
    @Override
    public void push(T value) {
        stack.add(value);
    }

    /**
     * Elimina y devuelve el elemento en la cima de la pila.
     *
     * @return el elemento en la cima de la pila
     * @throws RuntimeException si la pila está vacía
     */
    @Override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("La pila PostFixStack está vacía");
        }
        return stack.remove(stack.size() - 1);
    }

    /**
     * Devuelve el elemento en la cima de la pila sin eliminarlo.
     *
     * @return el elemento en la cima de la pila
     * @throws RuntimeException si la pila está vacía
     */
    @Override
    public T top() {
        try {
            if (isEmpty() == false) {
                return stack.get(stack.size() - 1);
            }
            throw new RuntimeException("La pila PostFixStack está vacía");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Devuelve el tamaño actual de la pila.
     *
     * @return el tamaño de la pila
     */
    public int size() {
        return stack.size();
    }

    /**
     * Verifica si la pila está vacía.
     *
     * @return true si la pila está vacía, false de lo contrario
     */
    @Override
    public boolean isEmpty() {
        return stack.size() == 0;
    }
}