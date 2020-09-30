package com.JunitAssertion;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
     boolean flNameValidation(String s) throws UserRegistrationException {
        String pattern = "[A-Z]{1}[a-z]{2,}";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(s);
        if(m.matches()) return  true;
        else throw new UserRegistrationException("Invalid First Name ");
    }

    boolean emailValidation(String s) throws UserRegistrationException {
        String pattern = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        Pattern p = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(s);

        if(m.matches()) return  true;
        else throw new UserRegistrationException("Invalid Last Name ");
    }


    boolean mobNumValidation(String s) throws UserRegistrationException {
        String pattern="[0-9]{2}+[0-9]{10}";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(s);

        if(m.matches()) return  true;
        else throw new UserRegistrationException("Invalid Mobile Number ");
    }

    boolean passValidation(String s) throws UserRegistrationException {
        String pattern="(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(s);

        if(m.matches()) return true;
        else  throw new UserRegistrationException("Invalid PassWord ");
    }

}