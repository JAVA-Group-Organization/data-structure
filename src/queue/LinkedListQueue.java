package queue;

import linkedlist.LinkedList;

import java.util.Arrays;

public class LinkedListQueue {

    LinkedList linkedList = new LinkedList();

    //add -- offer
    public void enqueue(int value) {
        linkedList.addLast(value);
    }
    //remove -- poll
    public void dequeue(){
        linkedList.removeFirst();
    }

    // peek -- element
    public int peek(){
        return linkedList.getFirst();
    }

    @Override
    public String toString() {
        return Arrays.toString(linkedList.toArray());
    }

    //enqueue
    //dequeue
    //peek

}
