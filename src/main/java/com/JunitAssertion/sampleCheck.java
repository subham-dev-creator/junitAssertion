package com.JunitAssertion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class sampleCheck {

    public boolean validateEmail(String email)
    {
        String pattern = "\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b";
        Pattern p = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(pattern);

        if(m.matches()) return  true;
        else return false;
    }

}