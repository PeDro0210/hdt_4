package com.SingletonClasses;
import com.Structures.classes.Stacks.*;
import com.Structures.Interfaces.DynamicStack;

public class StackFactory {
    private static StackFactory instance;
    public static StackFactory GetInstance(){
        if (instance == null){
            instance = new StackFactory();
        }
        return instance;
    }
    
    public <T> DynamicStack<T> CreateStack(String type){
        switch (type){
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