package com.example.damien2javaalgorithm.set;

import com.example.damien2javaalgorithm.linkedList.LinkedList;

public class LinkedListSet<E> implements Set<E> {

    private LinkedList list;

    public LinkedListSet(){
        list = new LinkedList();
    }



    @Override
    public void add(E e) {
        if (!list.contains(e)){
            list.addFirst(e);
        }
    }

    @Override
    public void remove(E e) {
        //list.re
    }

    @Override
    public boolean contains(E e) {
        return list.contains(e);
    }

    @Override
    public int getSize() {
        return list.getSize();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return "LinkedListSet{" +
                "list=" + list +
                '}';
    }

    public static void main(String[] args) {
        LinkedListSet linkedListSet = new LinkedListSet();
        (linkedListSet).add(1);
        (linkedListSet).add(1);
        (linkedListSet).add(1);
        (linkedListSet).add(1);
        (linkedListSet).add(1);
        (linkedListSet).add(1);


        System.out.println(linkedListSet);
    }
}
