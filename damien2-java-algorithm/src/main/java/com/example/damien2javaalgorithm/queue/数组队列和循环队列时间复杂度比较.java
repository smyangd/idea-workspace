package com.example.damien2javaalgorithm.queue;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Random;

public class 数组队列和循环队列时间复杂度比较 {

    private static double testqueue(Queue<Integer> queue, int opCount) {

        long starttime = System.nanoTime();

        for (int i = 0; i < opCount; i++) {
            queue.enqueue((new Random()).nextInt(Integer.MAX_VALUE));
        }
        for (int i = 0; i < opCount; i++) {
            queue.dequeue();
        }

        long endtime = System.nanoTime();
        return (endtime - starttime) / 1000000000.0;

    }

    public static void main(String[] args) {

        ArrayQueue arrayQueue = new ArrayQueue();
        System.out.println(testqueue(arrayQueue, 100000));

        LoopQueue loopQueue = new LoopQueue();
        System.out.println(testqueue(loopQueue, 100000));

    }
}
