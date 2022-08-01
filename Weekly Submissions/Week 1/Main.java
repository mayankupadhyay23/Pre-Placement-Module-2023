package com.jaitly;
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0);
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int c=0;
            if(x<y)
            {
                int diff = y-x;
                System.out.println(diff);
            }
            else if(x>y)
            {
                if(y%2 != 0)
                {
                    while(x!=y)
                    {
                        y+=2;
                        c++;
                    }
                    System.out.println(c);
                }
                if((y%2) == 0)
                {
                    x=x+1;
                    c++;
                    while(x!=y)
                    {
                        y+=2;
                        c++;
                    }
                    System.out.println(c);
                }
            }
            else
            {
                System.out.println(0);
            }
            t--;
        }
    }
}


