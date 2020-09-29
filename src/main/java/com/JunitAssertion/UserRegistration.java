package com.JunitAssertion;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
     boolean flNameValidation(String s){
        String pattern = "[A-Z]{1}[a-z]{2,}";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(s);
        if(m.matches()) return  true;
        else return false;
    }

    boolean emailValidation(String s){
        String pattern = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        Pattern p = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(s);

        if(m.matches()) return  true;
        else return false;
    }


    boolean mobNumValidation(String s){
        String pattern="[0-9]{2}+[0-9]{10}";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(s);

        if(m.matches()) return  true;
        else return false;
    }

    boolean passValidation(String s){
        String pattern="(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(s);

        if(m.matches()) return true;
        else return false;
    }

}