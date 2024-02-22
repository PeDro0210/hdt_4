package com.SingletonClasses;

import com.Structures.classes.Stacks.*;
import com.Structures.Interfaces.DynamicStack;

/**
 * La clase StackFactory es una fábrica de pilas que permite crear instancias de
 * pilas dinámicas
 * basadas en diferentes implementaciones, como listas enlazadas, arreglos o
 * vectores.
 */
public class StackFactory {
    private static StackFactory instance;

    /**
     * Obtiene la instancia única de la clase StackFactory.
     * 
     * @return la instancia única de StackFactory
     */
    public static StackFactory GetInstance() {
        if (instance == null) {
            instance = new StackFactory();
        }
        return instance;
    }

    /**
     * Crea una nueva instancia de una pila dinámica basada en el tipo especificado.
     * 
     * @param type el tipo de implementación de la pila ("LL" para lista enlazada,
     *             "Array" para arreglo, "Vector" para vector)
     * @return una nueva instancia de la pila dinámica basada en el tipo
     *         especificado, o null si el tipo no es válido
     */
    public <T> DynamicStack<T> CreateStack(String type) {
        switch (type) {
            case "LL":
                return new PostFixStackLl<T>();
            case "Array":
                return new PostFixStackA<T>();
            case "Vector":
                return new PostFixStackV<T>();
            default:
                return null;
        }
    }
}