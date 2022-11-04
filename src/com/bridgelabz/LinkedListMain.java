package com.bridgelabz;

import org.junit.jupiter.api.Test;

public class LinkedListMain {
    @Test
    public void searchLinkedListToFindNode() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.push(70);
        linkedList.push(56);
        linkedList.insert(30);
        linkedList.display();
        System.out.println();

        if(linkedList.search(30) != null ){
            System.out.println("Data found");
        }
        else{
            System.out.println("Data not found");
        }
    }
}