package com.jaitly;
import java.util.Scanner;
public class class2 {
    public static void main(String[] args) {
        LL obj = new LL();
        Scanner sc = new Scanner(System.in);

        System.out.println();


        //Inserting at Last
        obj.insertAtLast(3);
        obj.insertAtLast(5);
        obj.insertAtLast(8);
        obj.insertAtLast(63);
        obj.insertAtLast(222);
        obj.insertAtLast(300);


        obj.insertAtGivenPosition(43,3);
        obj.display();
        obj.delete(4);
        obj.display();
    }
}
