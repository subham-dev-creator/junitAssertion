package com.JunitAssertion;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class UserRegistrationTest {

    //Invalid test case
    @Test
    public void InvalidFirstNameTest(){
        UserRegistration obj = new UserRegistration();
        try {
            assertTrue(obj.fNameValidation("subhabdh"));
            System.out.println("Valid First Name");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    //Valid test case
    @Test
    public void validFirstNameTest(){
        UserRegistration obj = new UserRegistration();
        try {
            assertTrue(obj.lNameValidation("Subhabdh"));
            System.out.println("Valid First Name");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    //Valid test case
    @Test
    public void ValidLastname(){
        UserRegistration obj = new UserRegistration();
        try {
            assertTrue(obj.fNameValidation("Kumar"));
            System.out.println("Valid Last Name");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    //Invalid test case
    @Test
    public void InvalidLastname(){
        UserRegistration obj = new UserRegistration();
        try {
            assertTrue(obj.fNameValidation("kumar"));
            System.out.println("Valid Last Name");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    //Valid test case
    @Test
    public void ValidEmail(){
        UserRegistration obj = new UserRegistration();
        try {
            assertTrue(obj.emailValidation("abc@gmail.com"));
            System.out.println("Valid Email");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    //Invalid test case
    @Test
    public void InvalidEmail(){
        UserRegistration obj = new UserRegistration();
        try {
            assertTrue(obj.emailValidation("abc@.com"));
            System.out.println("Valid Email");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    //Valid Mob Number
    @Test
    public void ValidMobNumber(){
        UserRegistration obj = new UserRegistration();
        try {
            assertTrue(obj.mobNumValidation("91 9949618445"));
            System.out.println("Valid Mobile Number");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    //Invalid Mob Number
    @Test
    public void InvalidMobNumber(){
        UserRegistration obj = new UserRegistration();
        try {
            assertTrue(obj.mobNumValidation("91 00949618445"));
            System.out.println("Valid Mobile Number");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    //Valid test case
    @Test
    public void ValidPassword(){
        UserRegistration obj = new UserRegistration();
        try {
            assertTrue(obj.passValidation("Abcd@464554"));
            System.out.println("Valid Password");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    //Invalid test case
    @Test
    public void InvalidPassword(){
        UserRegistration obj = new UserRegistration();
        try {
            assertTrue(obj.passValidation("abcd4564"));
            System.out.println("Valid Password");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }
}
