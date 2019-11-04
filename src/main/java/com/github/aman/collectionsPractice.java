package com.github.aman;
import java.util.*;

public class collectionsPractice {
    private void hashmap(){
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("aman", 20);

        System.out.println(map.get("aman"));
        System.out.println(map.containsKey("aman"));
    }
    private void arraylist(){
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i = 0; i<10;i ++)
            a.add(i);
        int i=0, j=a.size()-1;
        while(i<j){
            Collections.swap(a,i,j);
            i++;
            j--;

        }
        for(i = 0; i<a.size(); i++){
            System.out.println(a.get(i));
        }
        System.out.println(a.size());
        System.out.println(a.get(0).getClass().getName());
        System.out.println(a.isEmpty());
        a.clear();
        System.out.println(a.isEmpty());
    }
    private void array(){
        int a[] = new int[100];
        for(int i=0; i<a.length; i++)
            a[i]=(a.length - i);
        Arrays.sort(a);
        for(int j : a){
            System.out.println(j);
        }

        System.out.println(a.length);

    }
    public static void main(String[] args) {
        collectionsPractice c = new collectionsPractice();
//        c.hashmap();
        c.arraylist();
//        c.array();
    }
}
