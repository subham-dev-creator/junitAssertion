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

    @Test
    public void Testlastname(){

        UserRegistration obj =new UserRegistration();
        boolean b1 = obj.flNameValidation("Kumar");
        boolean b2 = obj.flNameValidation("kumar");
        assertEquals(true,b1);
        assertEquals(false,b2);
    }

    @Test
    public void Testemail(){

        UserRegistration obj =new UserRegistration();
        boolean b1 = obj.emailValidation("sk@.com");
        boolean b2 = obj.emailValidation("sk@gmail.com");
        assertEquals(true,b1);
        assertEquals(false,b2);
    }

    @Test
    public void Testmob(){

        UserRegistration obj =new UserRegistration();
        boolean b1 = obj.mobNumValidation("918802616474");
        boolean b2 = obj.mobNumValidation("894949181");
        assertEquals(true,b1);
        assertEquals(false,b2);
    }

    @Test
    public void Testpass(){

        UserRegistration obj =new UserRegistration();
        boolean b1 = obj.passValidation("Skpass80@");
        boolean b2 = obj.passValidation("skpass");
        assertEquals(true,b1);
        assertEquals(false,b2);
    }

}
