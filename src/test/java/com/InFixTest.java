package com;

import static org.junit.Assert.assertTrue;

import com.SingletonClasses.IntoPostConvertor;
import com.Structures.classes.Stacks.PostFixStackLl;

import org.junit.Test;


public class InFixTest {
    @Test
    public void StringConvertionTest()
    {
        IntoPostConvertor inFix = new IntoPostConvertor();
        PostFixStackLl<Character> stack = new PostFixStackLl<>();
        String exp = "a+b*c";
        String result = inFix.InFixToPostFix(stack, exp);
        assertTrue(result.equals("abc*+"));
    }
}
