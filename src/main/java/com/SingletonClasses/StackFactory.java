package com.SingletonClasses;
import com.Structures.classes.PostFixStack;

public class StackFactory {
    private static StackFactory instance;
    public StackFactory GetInstance(){
        if (instance == null){
            instance = new StackFactory();
        }
        return instance;
    }
    
    public PostFixStack CreateStack(){
        return new PostFixStack();
    }

}