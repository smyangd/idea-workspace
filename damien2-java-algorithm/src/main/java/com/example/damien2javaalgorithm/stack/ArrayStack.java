package com.example.damien2javaalgorithm.stack;

import com.example.damien2javaalgorithm.array.Array;

public class ArrayStack<E> implements Stack<E>{



    Array<E> array;
    /**
     *
     * */
    public ArrayStack(int length){
        array = new Array<>(length);
    }

    /**
     *
     * */
    public ArrayStack(){
        array = new Array<>();
    }

    /**
     *
     *
     * */
    public int getLength(){
        return array.getCapacity();
    }

    /**
     * 获取栈的大小
     */
    @Override
    public int getSize() {
        return array.getSize();
    }

    /**
     * 判断栈是否为空
     */
    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    /**
     * 往栈中添加元素
     *
     * @param e
     */
    @Override
    public void push(E e) {
        array.addLast(e);
    }

    /**
     * 拿出栈中元素
     */
    @Override
    public E pop() {
        return array.deleteLast();
    }

    /**
     * 查看栈顶元素
     */
    @Override
    public E peek() {
        return array.getLast();
    }

    @Override
    public String toString() {
        return "ArrayStack{" +
                "array=" + array +
                '}';
    }

    public static void main(String[] args) {

        ArrayStack<Integer> stack = new ArrayStack<>();

        for (int i = 0; i < 10; i++) {
            stack.push(i);
            System.out.println(stack);
        }

    }

}


