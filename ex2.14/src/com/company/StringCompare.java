package com.company;

public class StringCompare {
    static void f(boolean b) {
        if (b == true) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    static void stringTest(String s, String t) {
        f(s == t);
        f(s.equals(t));
        f(t.equals(s));
        f(s != t);
    }
}