package com.Structures.classes;

import com.Structures.Interfaces.DynamicStack;
import java.util.LinkedList;


public class PostFixStack<T>  implements DynamicStack<T>{

    public LinkedList<T> stack;

    public PostFixStack(){
        this.stack = new LinkedList<T>();
    }   

    @Override
    public void push(T value) {
        stack.addFirst(value);
        
    }

    @Override
    public T pop() {
        if (stack.isEmpty()) {
            throw new RuntimeException("El PostFixStack está vacío");
        }
        return stack.removeFirst();
    }

    @Override
    public T top() {
        try {
            if (!stack.isEmpty()) {
                return stack.getFirst();
            }
            throw new RuntimeException("El PostFixStack está vacío");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        return null; 
    }

    public int size(){
        return stack.size();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }


}