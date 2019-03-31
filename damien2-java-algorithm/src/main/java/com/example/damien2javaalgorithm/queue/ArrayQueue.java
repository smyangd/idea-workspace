package com.example.damien2javaalgorithm.queue;

import com.example.damien2javaalgorithm.array.Array;

public class ArrayQueue<E> implements Queue<E>{


    private Array<E> array;

    public ArrayQueue(int length){
        array = new Array<>(length);
    }


    public ArrayQueue(){
        array = new Array<>();
    }

    /**
     * 获取队列的大小
     */
    @Override
    public int getSize() {
        return array.getSize();
    }

    /**
     * 判断队列是否为空
     */
    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    /**
     * 往队列中添加元素
     *
     * @param e
     */
    @Override
    public void enqueue(E e) {
        array.addLast(e);
    }

    /**
     * 拿出队列中元素
     */
    @Override
    public E dequeue() {
        return array.deleteFirst();
    }

    /**
     * 查看队列顶元素
     */
    @Override
    public E getFront() {
        return array.getFirst();
    }

    public int getLength(){
        return array.getCapacity();
    }

    @Override
    public String toString() {
        return "ArrayQueue{" +
                "array=" + array +
                '}';
    }

    public static void main(String[] args) {
        ArrayQueue<Integer> queue = new ArrayQueue<>();
        for (int i = 0; i <  10; i++) {
            queue.enqueue(i);
            System.out.println(queue.toString());

            if(i != 0 && i % 3 == 0){
                queue.dequeue();

            }
        }
//        System.out.println(queue.toString());
//
//        System.out.println(queue.dequeue());
//
//        System.out.println(queue.toString());
//
//        System.out.println(queue.dequeue());
//
//        System.out.println(queue.toString());


    }
}
