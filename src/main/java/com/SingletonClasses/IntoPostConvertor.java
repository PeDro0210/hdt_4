package com.SingletonClasses;


import com.Structures.Interfaces.DynamicStack;
public class IntoPostConvertor {
        // Function to check precedence of operators
    private int precedence(char c) {
            switch (c) {
                case '+':
                case '-':
                    return 1;
                case '*':
                case '/':
                    return 2;
                case '^':
                    return 3;
            }
            return -1;
        }
    
        // Function to convert infix expression to postfix expression
    public String InFixToPostFix(DynamicStack<Character> st, String s) {
            StringBuilder result = new StringBuilder();
    
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                
                if (Character.isLetterOrDigit(c))
                    result.append(c);

                
                else if (c == '(')
                    st.push('(');

                
                else if (c == ')') {
                    while (!st.isEmpty() && st.top() != '(') {
                        result.append(st.pop());
                    }
                    st.pop();
                }

            
                else {
                    while (!st.isEmpty() && precedence(c) <= precedence(st.top())) {
                        result.append(st.pop());
                    }
                    st.push(c);
                }
            }

            while (!st.isEmpty()) {
                result.append(st.pop());
            }

            return result.toString();
        }
}

