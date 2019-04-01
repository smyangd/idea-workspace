package com.example.damien2javaalgorithm.linkedList;


import com.example.damien2javaalgorithm.stack.ArrayStack;
import com.example.damien2javaalgorithm.stack.Stack;

import java.util.Random;

public class 链表栈与数组栈的性能比较 {

    private static double testStack(Stack<Integer> Stack, int opCount) {


        long starttime = System.nanoTime();

        for (int i = 0; i < opCount; i++) {
            Stack.push((new Random()).nextInt(Integer.MAX_VALUE));
        }
        for (int i = 0; i < opCount; i++) {
            Stack.pop();
        }

        long endtime = System.nanoTime();
        return (endtime - starttime) / 1000000000.0;

    }

    public static void main(String[] args) {

        LinkedListStack linkedListStack = new LinkedListStack();
        System.out.println(testStack(linkedListStack, 100000));

        ArrayStack arrayStack = new ArrayStack();
        System.out.println(testStack(arrayStack, 100000));

    }
}
