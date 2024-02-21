package com.SingletonClasses;

import com.Structures.classes.PostFixStack;
public class IntoPostConvertor {
    private int Preced(char ch){
        switch (ch){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return -1;
    }

    public String InFixToPostFix(PostFixStack<Character> stack, String exp){
        String result = "";
        for (Character item : exp.toCharArray()){
            switch (item) {
                case '+':
                case '-':
                case '*':
                case '/':
                    if (!stack.isEmpty() && Preced(item) <= Preced(stack.top())){
                        result += stack.pop();
                    }
                    stack.push(item);
                    break;
                case '(':
                    stack.push(item);
                    break;
                case ')':
                    if (!stack.isEmpty() && stack.top() != '('){
                        result += stack.pop();
                    }
                    stack.pop();
                    break;
                default:
                    result += item;
                    break;
            }
        }
        return result;
    }
}
