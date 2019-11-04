package com.github.aman;

public class StringFunction {
    public static void main(String[] args) {
        String s = "aman";
        String r = "AMAN";
        r = r.toLowerCase();
        System.out.println(r==s);
        String b = "Aman";
        String k = s;
        System.out.println(s.equals(b));
        System.out.println(k == s);
        System.out.println(s == b);
    }
}
