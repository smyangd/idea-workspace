package com.example.damien2javaalgorithm.queue;

public interface Queue<E> {

    /**
    * 获取队列的大小
    * */
    int getSize();
    /**
     *判断队列是否为空
     * */
    boolean isEmpty();
    /**
     *往队列中添加元素
     * */
    void enqueue(E e);
    /**
     *拿出队列中元素
     * */
    E dequeue();
    /**
     *查看队列顶元素
     * */
    E getFront();
}
