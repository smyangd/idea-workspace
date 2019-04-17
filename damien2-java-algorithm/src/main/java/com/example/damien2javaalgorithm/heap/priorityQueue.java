package com.example.damien2javaalgorithm.heap;

import com.example.damien2javaalgorithm.queue.Queue;

public class priorityQueue<E extends Comparable<E>> implements Queue<E> {


    private maxheap<E> maxheap;

    public priorityQueue(){
        maxheap = new maxheap<>();
    }

    /**
     * 获取队列的大小
     */
    @Override
    public int getSize() {
        return maxheap.size();
    }

    /**
     * 判断队列是否为空
     */
    @Override
    public boolean isEmpty() {
        return maxheap.isEmpty();
    }

    /**
     * 往队列中添加元素
     *
     * @param e
     */
    @Override
    public void enqueue(E e) {
        maxheap.add(e);
    }

    /**
     * 拿出队列中元素
     */
    @Override
    public E dequeue() {
        return maxheap.extractmax();
    }

    /**
     * 查看队列顶元素
     */
    @Override
    public E getFront() {
        return maxheap.findmax();
    }
}
