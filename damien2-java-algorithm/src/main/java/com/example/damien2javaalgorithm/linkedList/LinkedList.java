package com.example.damien2javaalgorithm.linkedList;

import sun.font.FontRunIterator;

import javax.naming.InsufficientResourcesException;

public class LinkedList<E> {

    private Node dummyhead;
    private int size;
    public LinkedList(){
        dummyhead = new Node(null, null);
        size = 0;

    }

    /**
     *
     * */
    public int getSize(){
        return size;
    }

    /**
     *
     * */
    public boolean isEmpty(){
        return size == 0;
    }



    /**
     * 在链表的index 的位置添加新的元素e
     * 在链表.中不是一个常用操作，练习用
     *
     * */
    public void add(int index,E e){
        if (index<0 || index >size){
            System.out.println();
        }

        Node prev = dummyhead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
//            Node node = new Node(e);
//            node.next = prev.next;
//            prev.next = node;

        prev.next = new Node(e, prev.next);

        size++;



    }

    /**
     *
     * */
    public void addFirst(E e){
//        Node node = new Node(e);
//        node.next = head;
//        head = node;

        add(0, e);



    }

    /**
     *
     * */
    public void addLast(E e){
        add(size, e);
    }

    /**
     * 在链表的index 的位置添加新的元素e
     * 在链表.中不是一个常用操作，练习用
     */
    public E get(int index) {

        if (index < 0 || index >= size) {
            System.out.println();
        }
        Node curr = dummyhead.next;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }

        return curr.e;
    }

    /**
     *
     * */
    public E getFirst(){
        return get(0);
    }

    /**
     *
     *
     * */
    public E getLast(){
        return get(size - 1);
    }

    /**
     *
     * */
    public void set(int index,E e){
        if(index<0 || index>=size){
            System.out.println();
        }
        Node curr = dummyhead.next;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        curr.e = e;

    }
    /**
     *
     *
     * */
    public boolean contains(E e){

        Node curr = dummyhead.next;
        while (curr != null){
            if(curr.e.equals(e)){
                return true;
            }

        }

//        for (Node curr = dummyhead.next; curr != null; curr = curr.next) {
//
//        }
        return false;

    }

    /**
     *
     * */
    public E remove(int index){
        if (index < 0 || index >= size) {
            System.out.println();
        }
        Node prev = dummyhead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;

        }
        Node retNode = prev.next;
        prev.next = retNode.next;
        retNode.next = null;
        size--;

        return retNode.e;
    }

    /**
     *
     * */
    public E removeFirst(){
        return remove(0);
    }

    /**
     *
     * */
    public E removeLast(){
        return remove(size - 1);
    }





    @Override
    public String toString() {
        return "LinkedList{" +
                "dummyhead=" + dummyhead +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.addFirst(i);
            System.out.println(linkedList);

        }

        linkedList.add(2, 666);
        System.out.println(linkedList);

        linkedList.remove(2);
        System.out.println(linkedList);

        linkedList.removeFirst();
        System.out.println(linkedList);

        linkedList.removeLast();
        System.out.println(linkedList);
    }

// ---------------------------------------------------

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
