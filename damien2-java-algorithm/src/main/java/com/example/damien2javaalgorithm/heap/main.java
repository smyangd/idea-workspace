package com.example.damien2javaalgorithm.heap;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;

public class main {

    public static void main(String[] args) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        for (int i = 0; i < 20; i++) {


            int in = (int)(Math.random()*1000);
            System.out.print(in+" ");
            if (i<10){
                priorityQueue.add(in);
            }else {
                if (priorityQueue.peek() > in) {
                    priorityQueue.remove();
                    priorityQueue.add(in);
                }
            }

        }

        for (int i = 0; i < 10; i++) {
            System.out.println(priorityQueue.peek());
            priorityQueue.remove();
        }




    }
}
