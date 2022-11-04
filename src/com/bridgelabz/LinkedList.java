package com.bridgelabz;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;
    public void display() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }
}
