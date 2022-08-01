package com.jaitly;
import java.util.*;

public class Link_list {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(4);
        System.out.println(list);
        System.out.println(list.peek());
        System.out.println(list.get(0));
        System.out.println(list.lastIndexOf(4));
        System.out.println(list.poll());
        System.out.println(list);

    }
}
