package com.github.aman;

class base{
    void display(){
        System.out.println("this is from base");
    }
}
public class polymorphism extends base{
    void display(){
        System.out.println("this is from derived");
    }
    public static void main(String[] args) {
        base b1 = new polymorphism();
        b1.display();
    }
}
