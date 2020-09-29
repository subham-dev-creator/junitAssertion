package com.JunitAssertion;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JnuitAssertiontest {
    @Test
    public void Testfirstname(){

        UserRegistration obj =new UserRegistration();
        boolean b1 = obj.flNameValidation("Subham");
        boolean b2 = obj.flNameValidation("subham");
        assertEquals(true,b1);
        assertEquals(false,b2);
    }
}
