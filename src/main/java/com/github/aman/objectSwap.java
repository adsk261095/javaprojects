package com.github.aman;

public class objectSwap {
    private int value;
    objectSwap(int value){
        this.value = value;
    }
    static void change(objectSwap t){
        t.value = 100;
    }
    static void swap(objectSwap t1, objectSwap t2){
        objectSwap temp;
        temp = t1;
        t1=t2;
        t2=temp;
    }
    public static void main(String[] args) {
        objectSwap o1 = new objectSwap(10);
        objectSwap o2 = new objectSwap(20);
//        change(o1);
        swap(o1, o2);
        System.out.println(o1.value + " " + o2.value);
//        objectSwap temp;
//        temp = o1;
//        o1 = o2;
//        o2 = temp;
//        System.out.println(o1.value + " " + o2.value);

    }
}
