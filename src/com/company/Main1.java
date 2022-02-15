package com.company;
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        int arraysize = arraysize();
        int [] first = new int [arraysize];
        kelet(first ,arraysize);
        pelet(first, arraysize);

    }

    public static int arraysize(){
        Scanner s = new Scanner(System.in);
        System.out.println(" give me the size of the array");
        int arraysize = s.nextInt();
        return arraysize;
    }
    public static void kelet( int [] x, int arraysize) {
        Scanner input=new Scanner(System.in);
        for(int i=0; i<arraysize; i++) {
            System.out.println("enter item "+i);
            x[i]=input.nextInt();
        }
    }
    public static void pelet(int [] ar, int arraysize) {
        System.out.println("The numbers in array:");
        for(int i=0; i<arraysize; i++)
            System.out.println("item number "+i+" is "+ar[i]);
    }
}

