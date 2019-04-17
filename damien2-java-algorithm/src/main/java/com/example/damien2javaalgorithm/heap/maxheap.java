package com.example.damien2javaalgorithm.heap;

import com.example.damien2javaalgorithm.array.Array;

import java.awt.*;
import java.util.Random;

public class maxheap<E extends Comparable<E>> {


    private Array<E> data;

    public maxheap(int capacity){
        data = new Array<>(capacity);
    }


    public maxheap(){
        data = new Array<>();
    }

    //对数组进行堆化
    public maxheap(E[] arr){
        data = new Array<>(arr);
        for (int i = parent(arr.length-1); i >=0 ; i--) {
            siftdown(i);
        }
    }


    public int size(){
        return data.getSize();
    }

    public boolean isEmpty(){
        return data.isEmpty();
    }

    private int parent(int index){
        if(index==0){
            System.out.println("exception");
        }
        return (index - 1) / 2;
    }

    private int leftchild(int index){
        return index * 2 + 1;
    }

    private int rightchild(int index){
        return index * 2 + 2;
    }


    public void add(E e){
        data.addLast(e);
        siftup(data.getSize()-1);
    }

    private void siftup(int k){

        while (k>0 && data.get(parent(k)).compareTo(data.get(k)) < 0){

            data.swap(k,parent(k));
            k = parent(k);
        }

    }

    //查看最大元素
    public E findmax(){
        if (data.getSize() == 0) {
            System.out.println("exception");
        }
        return data.get(0);
    }

    public E extractmax(){
        E ret = findmax();

        data.swap(0,data.getSize()-1);
        data.deleteLast();
        siftdown(0);

        return ret;
    }

    private void siftdown(int k){
        while (leftchild(k) < data.getSize()) {
            int j = leftchild(k);
            if (j + 1 < data.getSize() && data.get(j + 1).compareTo(data.get(j)) > 0) {
                j = rightchild(k);
            }
            if (data.get(k).compareTo(data.get(j)) >= 0) {
                break;
            }
            data.swap(k, j);
            k = j;
        }
    }

    public E replace(E e){
        E ret = findmax();
        data.set(0, e);
        siftdown(0);
        return ret;
    }

    @Override
    public String toString() {
        return "maxheap{" +
                "data=" + data +
                '}';
    }

    public static void main(String[] args) {
        int n = 1000;

        maxheap<Integer> maxheap = new maxheap<Integer>();

        Random random = new Random();
        for (int i = 0; i < n; i++) {
            maxheap.add(random.nextInt(Integer.MAX_VALUE));
        }

        System.out.println(maxheap);

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = maxheap.extractmax();
            System.out.print(arr[i]);
            System.out.print("-");
        }


    }


}
