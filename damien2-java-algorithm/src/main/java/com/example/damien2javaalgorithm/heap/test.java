package com.example.damien2javaalgorithm.heap;

import java.awt.*;
import java.beans.IntrospectionException;
import java.util.Random;

public class test {

    private static double testheap(Integer[] testdata,boolean isheapofy){

        long starttime = System.nanoTime();

        maxheap<Integer> maxheap;

        if (isheapofy) {

            maxheap = new maxheap<>(testdata);
        }else {
            maxheap = new maxheap<>();
            for (int num : testdata) {
                maxheap.add(num);

            }
        }


        long endtime = System.nanoTime();

        return (endtime-starttime)/ 10000000000.0;
    }


    public static void main(String[] args) {
        int n = 1000000;

        Random random = new Random();
        Integer[] testdata = new Integer[n];
        for (int i = 0; i < n; i++) {
            testdata[i] = random.nextInt(Integer.MAX_VALUE);

        }

        double time1 = testheap(testdata, false);
        System.out.println(time1);

        double time2 = testheap(testdata, true);
        System.out.println(time2);
    }
}
