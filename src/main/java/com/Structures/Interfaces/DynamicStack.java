package com.Structures.Interfaces;



public interface DynamicStack<T> {
        /**
         * Agrega un elemento a la pila.
         *
         * @param value el elemento a agregar
         */
        void push(T value);

        /**
         * Remueve y devuelve el elemento superior de la pila.
         *
         * @return el elemento superior de la pila
         */
        T pop();

        /**
         * Devuelve el elemento superior de la pila sin removerlo.
         *
         * @return el elemento superior de la pila
         */
        T top();

        /**
         * Verifica si la pila está vacía.
         *
         * @return true si la pila está vacía, false de lo contrario
         */
        boolean isEmpty();
}
