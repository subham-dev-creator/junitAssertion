package com.JunitAssertion;

public class ConstantPattern {
    public static final String CONST_PAT_FIRST_NAME = "^[A-Z][a-z]{2,}";
    public static final String CONST_PAT_LAST_NAME = "^[A-Z][a-z]{2,}";
    public static final String CONST_PAT_EMAIL = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";;
    public static final String CONST_PAT_MOB_NUM = "[0-9]{2}+[0-9]{10}";
    public static final String CONST_PAT_PASSWORD = "(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}";

}
