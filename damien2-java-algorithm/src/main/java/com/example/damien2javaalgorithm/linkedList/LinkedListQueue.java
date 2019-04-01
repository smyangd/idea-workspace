package com.example.damien2javaalgorithm.linkedList;

import com.example.damien2javaalgorithm.queue.Queue;

public class LinkedListQueue<E> implements Queue<E> {

    private Node head;
    private Node tail;
    private int size;

    public LinkedListQueue() {
        this.head = null;
        this.tail = tail;
        size = 0;
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
        return size == 0;
    }

    /**
     * 往队列中添加元素
     *
     * @param e
     */
    @Override
    public void enqueue(E e) {
        if (tail == null) {
            tail = new Node(e);
            head = tail;
        }else{
            tail.next = new Node(e);
            tail = tail.next;
        }
        size++;
    }

    /**
     * 拿出队列中元素
     */
    @Override
    public E dequeue() {
        if (isEmpty()){
            System.out.println();
        }
        Node retNode = head;
        head = head.next;
        retNode.next = null;

        if (head == null) {
            tail = null;
        }
        size--;

        return retNode.e;
    }

    /**
     * 查看队列顶元素
     */
    @Override
    public E getFront() {
        if (isEmpty()){
            System.out.println();
        }
        return head.e;
    }

    @Override
    public String toString() {
        return "LinkedListQueue{" +
                "head=" + head +
                ", tail=" + tail +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        LinkedListQueue<Integer> linkedListQueue = new LinkedListQueue<>();
        for (int i = 0; i < 10; i++) {
            linkedListQueue.enqueue(i);
            System.out.println(linkedListQueue.toString());

            if (i != 0 && i % 3 == 0) {
                linkedListQueue.dequeue();

            }
        }
    }



        /**
         *
         *
         * */
    private class Node{
        E e;
        Node next;

        public Node(E e,Node next){
            this.e = e;
            this.next = next;
        }

        public Node(E e){
            this.e = e;
            this.next = null;
        }

        public Node(){
            this(null,null);
        }

        @Override
        public String toString() {
            return "Node{" +
                    "e=" + e +
                    ", next=" + next +
                    '}';
        }

    }
}
