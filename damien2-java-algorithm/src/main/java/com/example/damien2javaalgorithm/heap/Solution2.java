package com.example.damien2javaalgorithm.heap;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Comparator;


/**
 *
 * 使用PriorityQueue实现大顶堆
 * PriorityQueue默认是一个小顶堆，然而可以通过传入自定义的Comparator函数来实现大顶堆。
 * 如下代码实现了一个初始大小为11的大顶堆。
 * 这里只是简单的传入一个自定义的Comparator函数，就可以实现大顶堆了。
 *
 *
 *
 * */
public class Solution2 {
   public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
       ArrayList<Integer> result = new ArrayList<Integer>();
       int length = input.length;
       if(k > length || k == 0){
           return result;
       }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
 
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        for (int i = 0; i < length; i++) {
            if (maxHeap.size() != k) {
                maxHeap.offer(input[i]);
            } else if (maxHeap.peek() > input[i]) {
                Integer temp = maxHeap.poll();
                temp = null;
                maxHeap.offer(input[i]);
            }
        }

       System.out.println(maxHeap);
       for (int i = 0; i < 8; i++) {

           result.add(maxHeap.poll());
       }

        return result;
    }

    public static void main(String[] args) {
        int[] in = {4,5,9,6,10,7,3,8,1};

        ArrayList<Integer> integers = (new Solution2()).GetLeastNumbers_Solution(in, 9);
        System.out.println(integers);

    }
}