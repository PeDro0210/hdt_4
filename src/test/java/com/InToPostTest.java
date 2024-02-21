package com;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.SingletonClasses.IntoPostConvertor;
import com.Structures.classes.Stacks.PostFixStackLl;

public class InToPostTest {
    @Test
    public void TestingConversation() {
        IntoPostConvertor inFix = new IntoPostConvertor();
        PostFixStackLl<Character> stack = new PostFixStackLl<>();
        String exp = "a+b*c";
        String result = inFix.InFixToPostFix(stack, exp);

        assertTrue("abc*+".equals(result));
    }    
}
