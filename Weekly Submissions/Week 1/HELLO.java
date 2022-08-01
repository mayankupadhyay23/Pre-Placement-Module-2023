package com.jaitly;

import java.util.Scanner;

public class HELLO {
    public static void main(String[] args) {
       int [] arr = {10,9,2,5,3,7,101,18};
       int n=5;
       prntfibs(n);

    }
    static void prntfibs(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
             sum = 0+i+sum;
            System.out.print(sum+"+");
        }

    }
}

