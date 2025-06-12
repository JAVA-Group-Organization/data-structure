import queue.ArrayQueue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        queue.LinkedListQueue linkedListQueue = new queue.LinkedListQueue();
//        linkedListQueue.enqueue(2);
//        linkedListQueue.enqueue(3);
//        linkedListQueue.enqueue(4);
//        System.out.println(linkedListQueue);
//        System.out.println(linkedListQueue.peek());
//        linkedListQueue.dequeue();
//        System.out.println(linkedListQueue);
//        System.out.println(linkedListQueue.peek());

        ArrayQueue arrayQueue = new ArrayQueue(5);
        arrayQueue.enqueue(10);
        arrayQueue.enqueue(20);
        arrayQueue.enqueue(30);
        arrayQueue.enqueue(40);
        arrayQueue.enqueue(50);
        System.out.println(arrayQueue.peek());
        System.out.println(arrayQueue);
        arrayQueue.dequeue();
        arrayQueue.enqueue(60);

        System.out.println(arrayQueue.peek());
        System.out.println(arrayQueue);

        System.out.println("debug");
    }
}