package linkedlist;

public class LinkedList {

    private Node head;
    private Node tail;
    private int count;

    private class Node {
        int value;
        Node nextNode;

        public Node(int value) {
            this.value = value;
        }
    }

    public void addFirst(int value){
        Node newNode = new Node(value);

        if(head == null){
            head = tail = newNode;

        }else {
        newNode.nextNode = head;
        head = newNode;
        }
        count++;
    }
    public void addLast(int value){

        Node newNode = new Node(value);
        if(head == null){
            head = tail = newNode;

        }else {
            tail.nextNode = newNode;
            tail = newNode;
        }
        count++;
    }

    public int indexOf(int value) {

        Node currentNode = head;
        int i = 0;
        while(currentNode != null){
            if(currentNode.value == value)
                return i;
            i++;
            currentNode = currentNode.nextNode;
        }
        return -1;
    }
    public Boolean contains(int value){
        return !(indexOf(value) == -1);
    }

    public void removeFirst(){

        if(head == null){
            return;
        }

        if(head == tail){
            head = tail = null;
        }else {
            Node secondNode = head.nextNode;
            head.nextNode = null;
            head = secondNode;
        }
        count--;
    }
    public void removeLast() {
        if( head == null){
            return;
        }
        if(head == tail){
            head = tail = null;
        }else {
            Node current = head;
            while (current.nextNode != tail) {
                current = current.nextNode;
            }
            current.nextNode = null;
            tail = current;
        }
        count--;
    }

    public int[] toArray() {

        if (count == 0) {
            return null;
        }

        int[] array = new int[count];
        Node current = head;
        int i = 0;
        while (current != null) {
            array[i] = current.value;
            current = current.nextNode;
            i++;
        }
        return array;
    }
    public int size(){
        return count;
    }

    public int getFirst(){
        return head.value;
    }



    //addFirst -- > O(1)
    //addLast -- > O(1)
    //indexOf() -- > O(n)
    //contains -- > O(n)
    //removeFirst -- > O(1)
    //removeLast -- > O(n)
    //toArray() -- > O(n)
    //size() -- > O(1)
}
