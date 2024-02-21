package com;

import com.Structures.classes.Stacks.*;
import com.Structures.Interfaces.DynamicStack;
import com.SingletonClasses.CalculatorPostFix;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * pruebas unitarias
 */
public class PostFixCalculatorTest {

    /**
     * analiza la funcionalidad del método
     */
    @Test
    public void testPostFixCalculator() {
        CalculatorPostFix calculator = new CalculatorPostFix();
        DynamicStack<Integer> stack = new PostFixStackLl<>();
        String exp = "23+5*6-";
        int result = 0; // Initialize result variable
        for (int i = 0; i < exp.length(); i++) {
            CalculatorPostFix.OperationPostFix(stack, exp.charAt(i)); // Assign the result of the method to the result variable
        }
        assertEquals(7, stack.pop().intValue());
    }

    
}
