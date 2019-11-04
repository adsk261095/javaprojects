package com.github.aman;

//public class ExceptionHandeling {
//    int getNumber(int a){
//        try{
//            return 20/a;
//        }
//        catch (ArithmeticException e){
//            e.printStackTrace();
//            return a++;
//        }
//        finally {
//            System.out.println("inside finally");
//            a=20;
//        }
////        return 10;
//    }
//    public static void main(String[] args) {
//        ExceptionHandeling e = new ExceptionHandeling();
//        System.out.println(e.getNumber(0));
//    }
//
//}


public class ExceptionHandeling {
    static int a = 10;
    static{
        System.out.println("this is a static block");
    }
    {
        System.out.println("this is a initialization block");
    }
    ExceptionHandeling(int a){
        ExceptionHandeling.a  =a;
        System.out.println("this is inside constructor");
    }
    public static void main(String[] args) {
        ExceptionHandeling e1 = new ExceptionHandeling(10);
        ExceptionHandeling e2 = new ExceptionHandeling(20);
        System.out.println(e1.a + "  " + e2.a);
//        e1.a = 20;
//        System.out.println(e1.a + "  " + e2.a);
    }
}