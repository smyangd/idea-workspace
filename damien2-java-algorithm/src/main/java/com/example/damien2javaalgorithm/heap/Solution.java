package com.example.damien2javaalgorithm.heap;


import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.LinkedList;

/**
 *
 *给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
 *
 * 示例 1:
 *
 * 输入: nums = [1,1,1,2,2,3], k = 2
 * 输出: [1,2]
 *
 *
 * */
class Solution {

    private class Freq implements Comparable<Freq>{

        @Override
        public int compareTo(Freq o) {
            return this.freq - o.freq;
        }

        int e;
        int freq;

        public Freq(int e ,int freq){
            this.e=e;
            this.freq=freq;
        }

        public int getE() {
            return e;
        }

        public void setE(int e) {
            this.e = e;
        }

        public int getFreq() {
            return freq;
        }

        public void setFreq(int freq) {
            this.freq = freq;
        }

//        @Override
//        public int compareTo(Solution.Freq o) {
//            if(this.freq < o.freq){
//                return 1;
//            }else if(this.freq > o.freq){
//                return -1;
//            }else{
//                return 0;
//            }
//
//        }
    }
    public List<Integer> topKFrequent(int[] nums, int k) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int num :nums){
            if (map.containsKey(num)) {
                map.put(num,map.get(num)+1);

            }else{
                map.put(num, 1);
            }

        }

        PriorityQueue<Freq> priorityQueue = new PriorityQueue<Freq>();
        for (int key : map.keySet()) {
            if (priorityQueue.size()<k) {
                priorityQueue.add(new Freq(key,map.get(key)));

            }else if(map.get(key) > priorityQueue.peek().getFreq()){
                priorityQueue.remove();
                priorityQueue.add(new Freq(key,map.get(key)));
            }
        }

        LinkedList<Integer> res = new LinkedList<>();
        while (!priorityQueue.isEmpty()){
            int in = priorityQueue.remove().e;
            System.out.println(in);
            res.addLast(in);
        }
        return res;

    }


    public static void main(String[] args) {
        int[] in = {1,1,3,3,3,4,5,6,6,6,6,6,6,6};

        List<Integer> integers = (new Solution()).topKFrequent(in, 3);
        System.out.println(integers);
    }
}