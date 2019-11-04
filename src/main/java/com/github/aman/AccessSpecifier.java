package com.github.aman;

class abc{
    public int a = 5;
}
public class AccessSpecifier extends abc {
    void access(){
        System.out.println(a);
    }
    public static void main(String[] args) {
//        abc obj = new abc();
        AccessSpecifier obj = new AccessSpecifier();
        obj.access();
    }
}
