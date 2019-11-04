package com.github.aman;

public class garbageCollector {
    final int value;
    garbageCollector(int value){
        this.value = value;
    }
    private int getValue(){
        return this.value;
    }
    public void finalize(){
        System.out.println("finalize called for garbageCollector object");
    }
    public static void main(String[] args) {
        garbageCollector g1 = new garbageCollector(5);
        garbageCollector g2 = new garbageCollector(10);
        garbageCollector g3 = g1;
        System.out.println(g1.getValue());
        System.out.println(g3.getValue());
        System.out.println(g2.getValue());
        g1 = null;
        g3 = g2 = null;

        /**
         * IF we call finalize method explicitely on
         * an object then finalize method will be called
         * but object wouldn't be destroyed
         */
        String s = "aman";
        s = null;
        /**
         * Finalize method of garbageCollector will be
         * called just twice, one for g1 and other for g2
         * for string reference s, string's class finalize will be
         * called and not that of garbageCollector class
         */
        /**
         * since g3 is still referring to object pointed by
         * g1, therefore since all the references of that object
         * are not removed, that object will not be destroyed as of now
         */
        //telling jvm to run garbage collector
        System.gc();
    }
}
