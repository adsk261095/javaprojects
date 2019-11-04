package com.github.aman;
class sharedResource{
    String name;
    sharedResource(String name){
        this.name = name;
    }
    synchronized void test1(sharedResource s2){
        System.out.println(Thread.currentThread().getName() + " using " + this.name);

        /**
         Now in order to create a deadlock scenario
         s1(which is locked by t1)will try to access s2
         (which is locked by t2)
         */
        try {
            Thread.currentThread().sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        s2.test2(this);
    }
    synchronized void test2(sharedResource s1){
        System.out.println(Thread.currentThread().getName() + " using " + this.name);

        /**
         Now in order to create a deadlock scenario
         s2(which is locked by t2)will try to access s1
         (which is locked by t1)
         */
        try {
            Thread.currentThread().sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        s1.test1(this);
    }
}
class threadClass extends Thread{
    sharedResource s1, s2;
    threadClass(sharedResource s1, sharedResource s2){
        this.s1 = s1;
        this.s2 = s2;
    }
    public void run(){
        if(Thread.currentThread().getName() == "thread 1")
            s1.test1(s2);
        else
            s2.test2(s1);

    }
}
public class deadlock {
    public static void main(String[] args) {

        final sharedResource s1, s2;
        s1 = new sharedResource("sr 1");
        s2 = new sharedResource("sr 2");
        threadClass t1 = new threadClass(s1, s2);
        threadClass t2 = new threadClass(s1, s2);

        t1.setName("thread 1");
        t2.setName("thread 2");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
