package com;

import java.io.IOException;

import com.SingletonClasses.*;
import com.Structures.Interfaces.DynamicStack;
public class App 
{
    public static void main( String[] args )
    {
        TxtLoader loader = new TxtLoader("InfixData.txt");
        String[] data = loader.loadFile();

        IntoPostConvertor inFix = new IntoPostConvertor();
        StackFactory stackFactory = new StackFactory();
        DynamicStack<Character> stack;      

        System.out.println("Cual Tipo de Stack desea usar?");
        System.out.println("1. Array");
        System.out.println("2. Linked List");
        System.out.println("3. Vector");

        int stackType = 0;
        try {
            stackType = System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

        switch(stackType) {
            case 1:
                stack = stackFactory.CreateStack("Array");
                break;
            case 2:
                stack = stackFactory.CreateStack("LL");
                break;
            case 3:
                stack = stackFactory.CreateStack("Vector");
                break;
            default:
                stack = stackFactory.CreateStack("Array");
                break;
        }

        for (String exp : data) {
            String result = inFix.InFixToPostFix(stack, exp);
            System.out.println(result);
        }


    }
}
