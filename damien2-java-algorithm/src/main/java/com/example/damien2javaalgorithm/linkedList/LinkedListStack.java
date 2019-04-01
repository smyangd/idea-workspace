package com.example.damien2javaalgorithm.linkedList;

import com.example.damien2javaalgorithm.stack.Stack;
import sun.jvmstat.perfdata.monitor.PerfStringVariableMonitor;

public class LinkedListStack<E> implements Stack<E> {

    private LinkedList<E> linkedList;

    public LinkedListStack(){
        linkedList = new LinkedList<E>();
    }

    /**
     * 获取栈的大小
     */
    @Override
    public int getSize() {
        return linkedList.getSize();
    }

    /**
     * 判断栈是否为空
     */
    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    /**
     * 往栈中添加元素
     *
     * @param e
     */
    @Override
    public void push(E e) {
        linkedList.addFirst(e);
    }

    /**
     * 拿出栈中元素
     */
    @Override
    public E pop() {
        return linkedList.removeFirst();
    }

    /**
     * 查看栈顶元素
     */
    @Override
    public E peek() {
        return linkedList.getFirst();
    }


    @Override
    public String toString() {
        return "LinkedListStack{" +
                "linkedList=" + linkedList +
                '}';
    }

    public static void main(String[] args) {

        LinkedListStack<Integer> linkedListStack = new LinkedListStack<>();

        for (int i = 0; i < 10; i++) {
            linkedListStack.push(i);
            System.out.println(linkedListStack);
        }

        for (int i = 0; i < 10; i++) {
            linkedListStack.pop();
            System.out.println(linkedListStack);
        }
    }
}
