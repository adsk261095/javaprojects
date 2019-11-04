package com.github.aman;
import java.util.Collections;
import java.util.Scanner;

public class inputPractice {
    public static void swap(int a[], int i, int j){
        int t;
        t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        int t,i,j;

//        int t,n,i,j;
//        int a[] = new int [100000];
//        t = sc.nextInt();
//        while(t-- != 0){
//            n = sc.nextInt();
//            for(i=0;i<n;i++)
//                a[i] = sc.nextInt();
//
//            i=0;j=n-1;
//            while(i<j){
//                swap(a, i, j);
//                i++;
//                j--;
//            }
//            for(i=0;i<n;i++)
//                System.out.println(a[i] + " ");
//        }
        t = sc.nextInt();
        s = sc.nextLine();
        while(t-- != 0) {
            s = sc.nextLine();
            System.out.println(s.charAt(3));
            i=0;
            j=s.length();
            while(i<j){
//                s.
            }
            System.out.println(s);
        }

    }

}
