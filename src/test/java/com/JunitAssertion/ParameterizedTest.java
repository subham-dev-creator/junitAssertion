package com.JunitAssertion;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParameterizedTest {

    private String inputEmail;
    private boolean expectedResult;
    private sampleCheck obj;

    @Before
    public void initialize(){
        obj = new sampleCheck();
    }

    public ParameterizedTest(String email, Boolean result)
    {
        this.inputEmail = email;
        this.expectedResult = result;
    }
    @Parameterized.Parameters
    public static Collection sampleEmails() {
        return Arrays.asList(new Object[][] {
                {"abc@yahoo.com", true },
                {"abc-100@yahoo.com",true},
                {"abc-100@yahoo.com",true},
                {"abc.100@yahoo.com",true},
                {"abc111@abc.com",true},
                {"abc-100@abc.net",true},
                {"abc.100@abc.com.au",true},
                {"abc@1.com",true},
                {"abc@gmail.com.com",true},
                {"abc+100@gmail.com",true},
                {"abc",false},
                {"abc@.com.my",false},
                {"abc123@gmail.a",false},
                {"abc123@.com",false},
                {"abc123@.com.com",false},
                {".abc@abc.com",false},
                {"abc()*@gmail.com",false},
                {"abc@%*.com",false},
                {"abc..2002@gmail.com",false},
                {"abc.@gmail.com",false},
                {"abc@abc@gmail.com",false},
                {"abc@gmail.com.1a",false},
                {"abc@gmail.com.aa.au,",false}

        });
    }


    @Test
    public void test() {
        System.out.println("Parameterized email is "+inputEmail);
        assertEquals(expectedResult, obj.validateEmail(inputEmail));
    }

}