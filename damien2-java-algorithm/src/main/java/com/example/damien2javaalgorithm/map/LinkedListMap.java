package com.example.damien2javaalgorithm.map;

public class LinkedListMap<K,V> implements Map<K,V> {

    private Node dummyHead;
    private int size;

    public LinkedListMap(){
        dummyHead = new Node();
        size = 0;
    }

    private Node getNode(K key){
        Node curr = dummyHead.next;
        while (curr != null) {
            if (curr.key.equals(key)) {
                return curr;
            }else{
                curr = curr.next;
            }

        }
        return null;
    }


    @Override
    public void add(K key, V value) {

        Node node = getNode(key);
        if (node == null) {
            dummyHead.next = new Node(key,value,dummyHead.next);
            size++;
        }else{
            node.value = value;
        }
    }

    @Override
    public V remove(K key) {

        Node prev = dummyHead;
        while (prev.next != null) {
            if (prev.next.key.equals(key)) {
                break;
            }
            prev = prev.next;
        }

        if (prev.next != null) {
            Node delNode = prev.next;
            prev.next = delNode.next;
            delNode.next = null;
            size--;
            return delNode.value;
        }
        return null;
    }

    @Override
    public boolean contains(K key) {
        return getNode(key) != null;
    }

    @Override
    public V get(K key) {
        Node node = getNode(key);
        return node == null ? null : node.value;
    }

    @Override
    public void set(K key, V value) {
        Node node = getNode(key);
        if (node == null) {
            System.out.println();

        }else{
            node.value = value;
        }

    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }



    private class Node{

        K key;
        V value;
        Node next;

        Node(K key,V value,Node next){
            this.key = key;
            this.value = value;
            this.next = next;
        }

        Node(K key){
            this.key = key;
            this.value = null;
            this.next = null;
        }

        Node(){
            this.key = null;
            this.value=null;
            this.next = null;
        }


        @Override
        public String toString() {
            return "Node{" +
                    "key=" + key +
                    ", value=" + value +
                    ", next=" + next +
                    '}';
        }
    }

}
