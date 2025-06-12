package queue;

import java.util.Arrays;

public class ArrayQueue {

    int[] items;
    int rear; //index of rear element
    int front; //index of front element
    int count;

    public ArrayQueue(int size) {
        items = new int[size];
    }

    public void enqueue(int value){
        if(items.length == count){
            return;
        }
        items[rear] = value;
        rear = (rear + 1)% items.length;
        count++;
    }
    public void dequeue(){
        if(count == 0){
            return;
        }
        items[front] = 0;
        front = (front + 1) % items.length;
        count--;
    }
    public int peek(){
        return items[front];
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}

//Enqueue -- > O(1)
//Dequeue -- > O(1)
//Peek -- > O(1)