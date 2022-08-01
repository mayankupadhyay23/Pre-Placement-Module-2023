package com.jaitly;

public class LL {
    private Node head;
    private Node tail;
    public void insertAtFirst(int value){
        Node node = new Node(value);
         node.next = head;
         head = node;
// This case if the element to be added is the first element therefore
         if(tail == null)
         {
             tail = head;
         }
    }
    public void insertAtLast(int value)
    {
        if(tail == null)
        {
            insertAtFirst(value);
            return;
        }
       Node node = new Node(value);
       tail.next = node;
       tail = node;
    }
    public void insertAtGivenPosition(int value, int index)
    {
        int c =0;
        index = index-1;
        Node node = new Node(value);
        Node temp = head;
        Node temp2;
        while(index!=0)
        {
            temp= temp.next;
            index --;
        }
        temp2 = temp.next;
        temp.next = node;
        node.next = temp2;
    }
    public void display()
    {
        Node temp = head;
        while(temp!= null)
        {
            System.out.print(temp.value + "- > ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public void delete(int index)
    {
        Node temp = head;
        index-=2;
       while(index!=0)
       {
           temp = temp.next;
           index--;
       }
       temp.next = temp.next.next;
    }
    private class Node
    {
        private int value;
        private Node next;
// Down below, we have 2 constructor functions because we can pass values in 2 ways that is if we pass only value,
// or we can pass value
// with the next pointer
        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
        public Node(int value)
        {
            this.value = value;
        }
    }
}
