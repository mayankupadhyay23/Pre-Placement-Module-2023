package com.jaitly;
import java.util.*;

public class Ranked {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int [] scores = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
    }
}
