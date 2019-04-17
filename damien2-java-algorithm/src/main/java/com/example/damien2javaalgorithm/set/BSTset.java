package com.example.damien2javaalgorithm.set;

import com.example.damien2javaalgorithm.binarySearchTree.BinarySreachTree;

public class BSTset<E extends Comparable<E>> implements Set<E> {

    private BinarySreachTree<E> bst;

    public BSTset(){
        bst = new BinarySreachTree<E>();
    }

    @Override
    public void add(E e) {
        bst.add(e);
    }

    @Override
    public void remove(E e) {
        bst.remove(e);
    }

    @Override
    public boolean contains(E e) {
        return bst.contains(e);
    }

    @Override
    public int getSize() {
        return bst.size();
    }

    @Override
    public boolean isEmpty() {
        return bst.isEmpty();
    }

    @Override
    public String toString() {
        return "BSTset{" +
                "bst=" + bst +
                '}';
    }

    public static void main(String[] args) {
        BSTset BSTset = new BSTset();
        (BSTset).add(1);
        (BSTset).add(1);
        (BSTset).add(1);
        (BSTset).add(1);
        (BSTset).add(1);
        (BSTset).add(1);


        System.out.println(BSTset);
    }
}
