import queue.ArrayQueue;
import stack.ArrayStack;

import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(5);


        stack.push(10);
        stack.push(20);
        stack.push(10);
        stack.push(20);
        stack.push(10);
        stack.push(20);

        stack.print();
        System.out.println(stack.pop());
        stack.print();
        System.out.println(stack.peek());
        stack.print();
    }




}