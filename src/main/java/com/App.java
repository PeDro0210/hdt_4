package com;

import java.io.IOException;

import com.SingletonClasses.*;
import com.Structures.Interfaces.DynamicStack;
/**
 * Esta clase representa la aplicación principal que realiza la conversión de expresiones infix a postfix
 * y evalúa las expresiones postfix utilizando diferentes tipos de pilas.
 */
public class App 
{
    public static void main( String[] args )
    {
        TxtLoader loader = new TxtLoader("InfixData.txt");
        String[] data = loader.loadFile();

        IntoPostConvertor inFix = new IntoPostConvertor();
        StackFactory stackFactory = StackFactory.GetInstance();
        DynamicStack<Character> stackletters;      
        DynamicStack<Integer> stackexpresions;

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
                stackletters = stackFactory.CreateStack("Array");
                stackexpresions = stackFactory.CreateStack("Array");
                break;
            case 2:
                stackletters = stackFactory.CreateStack("LL");
                stackexpresions = stackFactory.CreateStack("LL");
                break;
            case 3:
                stackletters = stackFactory.CreateStack("Vector");
                stackexpresions = stackFactory.CreateStack("Vector");
                break;
            default:
                stackletters = stackFactory.CreateStack("Array");
                stackexpresions = stackFactory.CreateStack("Array");
                break;
        }

        for (String exp : data) {
            String result = inFix.InFixToPostFix(stackletters, exp);
            System.out.println("Infix: " + exp);
            System.out.println("Postfix: " + result);
            for (int i = 0; i < result.length(); i++) {
                CalculatorPostFix.OperationPostFix(stackexpresions, result.charAt(i));
            }
            System.out.println("Resultado: " + stackexpresions.pop());
        }


    }
}
