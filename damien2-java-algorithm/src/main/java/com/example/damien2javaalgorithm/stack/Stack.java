package com.example.damien2javaalgorithm.stack;

public interface Stack<E> {

    /**
    * 获取栈的大小
    * */
    int getSize();
    /**
     *判断栈是否为空
     * */
    boolean isEmpty();
    /**
     *往栈中添加元素
     * */
    void push(E e);
    /**
     *拿出栈中元素
     * */
    E pop();
    /**
     *查看栈顶元素
     * */
    E peek();
}
