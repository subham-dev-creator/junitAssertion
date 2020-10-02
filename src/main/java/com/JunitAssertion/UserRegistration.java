package com.JunitAssertion;

import java.util.Scanner;
import java.util.regex.*;

@FunctionalInterface
interface validationUser{
    boolean validate(String msg);
}

public class UserRegistration {
     boolean fNameValidation(String s) throws UserRegistrationException {
         validationUser firstNameValid = (fName) -> (Pattern.compile(ConstantPattern.CONST_PAT_FIRST_NAME).matcher(fName).matches());
        if(firstNameValid.validate(s)) return  true;
        else throw new UserRegistrationException("Invalid First Name ");
    }

    boolean lNameValidation(String s) throws UserRegistrationException {
         validationUser lastNameValid = (lName) -> (Pattern.compile(ConstantPattern.CONST_PAT_LAST_NAME).matcher(lName).matches());
        if(lastNameValid.validate(s)) return  true;
        else throw new UserRegistrationException("Invalid Last Name ");
    }

    boolean emailValidation(String s) throws UserRegistrationException {
         validationUser emailValid = (email) -> (Pattern.compile(ConstantPattern.CONST_PAT_EMAIL).matcher(email).matches());
         if(emailValid.validate(s)) return  true;
         else throw new UserRegistrationException("Invalid email ");
    }

    boolean mobNumValidation(String s) throws UserRegistrationException {
         validationUser mobValid = (mob) -> (Pattern.compile(ConstantPattern.CONST_PAT_MOB_NUM).matcher(mob).matches());
        if(mobValid.validate(s)) return  true;
        else throw new UserRegistrationException("Invalid Mobile Number ");
    }

    boolean passValidation(String s) throws UserRegistrationException {
        validationUser passValid = (pass) -> (Pattern.compile(ConstantPattern.CONST_PAT_PASSWORD).matcher(pass).matches());
        if(passValid.validate(s)) return true;
        else  throw new UserRegistrationException("Invalid PassWord ");
    }
}