package com.github.aman;

class parent{
    private String name;
    parent(String name){
        this.name = name;
    }
    public void show(){
        System.out.println("Name is: " + this.name);
    }
}

class child extends parent{
    private int age;
    child(String name, int age){
        super(name);
        this.age = age;
    }

    public void show(){
        super.show();
        System.out.println("Age is : " + this.age);
    }
}
public class inheritance {
    public static void main(String[] args) {
//        child c1 = new child("Aman", 24);
//        c1.show();
        String s = "aman is a good boy";
        String[] a = s.split(" ");
        for (String r:a
             ) {
            System.out.println(r);
        }

        int i = 0, j = s.length();
        char c;
//        while(i<j){
//            c = s[i];
//            s[i] = s[j];
//            s[j] = c;
//        }
    }
}
