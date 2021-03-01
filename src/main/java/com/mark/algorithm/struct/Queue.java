package com.mark.algorithm.struct;

import java.util.Stack;

/**
 * A queue implement by two stacks
 */
public class Queue {

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public Queue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int i) {
        stack1.push(i);
    }

    public int pop() {
        if (!stack2.empty()) {
            return stack2.pop();
        }
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        queue.push(4);
        queue.push(5);
        queue.push(6);

        System.out.println(queue.pop());
        System.out.println(queue.pop());
    }
}
