package com;

import com.SingletonClasses.IntoPostConvertor;
import com.Structures.Interfaces.DynamicStack;
import com.Structures.classes.Stacks.PostFixStackLl;

public class DebugginIntopost {
    public static void main(String[] args) {
        IntoPostConvertor inFix = new IntoPostConvertor();
        DynamicStack<Character> stack = new PostFixStackLl<Character>();
        String exp = "(a+b)*c";
        String result = inFix.InFixToPostFix(stack, exp);
        System.err.println(result);
    }
}
