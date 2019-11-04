package com.github.aman;

public class testing {
    static boolean fix(boolean b){
        b = true;
        return b;
    }
    public static void main(String[] args) {
        boolean b = false;
        boolean a = fix(b);
        System.out.print(a + " " + b);
    }
}
