package com.example.damien2javaalgorithm.queue;

import java.util.Arrays;

public class LoopQueue<E> implements Queue<E> {

    private E[] data;
    private int front;
    private int tail;
    private int size;

    public LoopQueue(int length){
        data = (E[])new Object[length+1];
        front = 0;
        tail = 0;
        size  = 0;
    }

    public LoopQueue(){
        this(10);
    }

    public int getCapacity(){
        return data.length - 1;

    }

    /**
     * 获取队列的大小
     */
    @Override
    public int getSize() {
        return size;
    }

    /**
     * 判断队列是否为空
     */
    @Override
    public boolean isEmpty() {
        return front == tail;
    }

    /**
     * 往队列中添加元素
     *
     * @param e
     */
    @Override
    public void enqueue(E e) {

        if ((tail + 1) % data.length == front){
            resize(getCapacity() * 2);

        }
        data[tail] = e;
        tail = (tail + 1) % data.length;
        size++;
    }

    public void resize(int newCapacity){
        E[] newData = (E[])new Object[newCapacity + 1];
        for (int i = 0; i < size; i++) {
            newData[i] = data[(front + i) % data.length];

        }
        data = newData;
        front = 0;
        tail = size;
    }

    /**
     * 拿出队列中元素
     */
    @Override
    public E dequeue() {

        if (isEmpty()){

        }
        E ret = data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size--;
        if (size == getCapacity() / 4 && getCapacity() / 2 !=0){
            resize(getCapacity() / 2);
        }
        return ret;
    }

    /**
     * 查看队列顶元素
     */
    @Override
    public E getFront() {

        return data[front];
    }

    @Override
    public String toString() {
        return "LoopQueue{" +
                "data=" + Arrays.toString(data) +
                ", front=" + front +
                ", tail=" + tail +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        LoopQueue<Integer> queue = new LoopQueue<>();
        for (int i = 0; i < 30; i++) {
            queue.enqueue(i);
            System.out.println(queue.toString());

            if (i != 0 && i % 3 == 0) {
                queue.dequeue();

            }
        }
    }
}
