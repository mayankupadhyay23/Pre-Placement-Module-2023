package com.jaitly;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.io.*;
class Sub {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int T=sn.nextInt();

        for(int a=0;a<T;a++){
            int N=sn.nextInt();
            String s=sn.next();
            int res=0;
            ArrayList<Integer> ds=new ArrayList<Integer>();
            getSubsequence(res,ds,"",s,N,0);

            System.out.println(Collections.max(ds));
        }
    }

    public static void getSubsequence(int res,ArrayList<Integer> ds,String l, String str, int n, int ind){
        if(ind>=n){

            char []ch= (l.toCharArray());
            Arrays.sort(ch);

            System.out.print(l);
            System.out.println(new String(ch));
            String temp= new String(ch);
            System.out.println(l.equals(temp));

            if(l.equals(temp)){
                ds.add(temp.length());

                return;
            }
            return;

        }

        getSubsequence(res,ds,l+str.charAt(ind),str,n,ind+1);
        getSubsequence(res,ds,l,str,n,ind+1);
    }
}
