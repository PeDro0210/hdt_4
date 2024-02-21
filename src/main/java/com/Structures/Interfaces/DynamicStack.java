package com.Structures.Interfaces;

public interface DynamicStack <T> {
    void push(T value);
    T pop();
    T top();
    boolean isEmpty();

}