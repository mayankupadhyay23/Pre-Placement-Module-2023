package com.jaitly;
import java.util.Scanner;

public class twosum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array" );
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in the array");
        for (int i=0;i<=n-1;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value of the target");
        int target=sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if((arr[i]+arr[j])==target)
                {
                    System.out.println("Index's are"+ i + j);
                }
            }
        }


    }
}
