package stack;

import java.util.Arrays;

public class ArrayStack {

    int[] items;
    int count;

    public ArrayStack(int size) {
        items = new int[size];
    }

    public void push(int item){
        if(items.length == count)
            throw new StackOverflowError();

        items[count++]  = item;
    }

    public int pop(){

        if(count == 0){
            throw new IllegalStateException();
        }
        return items[--count];
    }

    public int peek(){
        if(count == 0){
            throw new IllegalStateException();
        }
        return items[count-1];
    }

    public Boolean isEmpty(){
        return count == 0;
    }

    public void print(){
        int[] stackItems = new int[count];
        for (int i = 0; i < count; i++ )
            stackItems[i] = items[i];
        System.out.println(Arrays.toString(stackItems));
    }



    //push -- > O(1)
    //pop -- > O(1)
    //peek -- > 0(1)
    //isEmpty -- > o(1)
}
