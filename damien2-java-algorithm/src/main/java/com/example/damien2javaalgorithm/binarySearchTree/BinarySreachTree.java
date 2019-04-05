package com.example.damien2javaalgorithm.binarySearchTree;

public class BinarySreachTree<E extends Comparable<E>> {

    private class Node{

        public E e;
        public Node left;
        public Node right;

        public Node(E e){
            this.e = e;
            left = null;
            right = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "e=" + e +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    private Node root;
    private int size;

    public BinarySreachTree(){
        root = null;
        size = 0;
    }

    public int size(){
        return size;

    }

    public boolean isEmpty(){
        return size == 0;
    }

    //向二分搜索树中添加新的元素e
    public void add(E e){

        if (root == null) {
            root = new Node(e);
            size++;
        }else{
            add(root, e);
        }

    }

    public void add2(E e){

        root = add2(root, e);

    }

    //向以node为根的二分搜索树中插入元素e，递归算法
    private void add(Node node,E e){
        if (e.equals(node.e)) {
            return;
        } else if (e.compareTo(node.e) < 0 && node.left == null) {
            node.left = new Node(e);
            size++;
            return;
        } else if (e.compareTo(node.e) > 0 && node.right == null) {
            node.right = new Node(e);
            size++;
            return;
        }

        if (e.compareTo(node.e) < 0) {
            add(node.left, e);
        }else{
            add(node.right, e);
        }
    }

    //返回插入新节点后二分搜索书的根
    private Node add2(Node node,E e){
        if (node == null) {
            size++;
            return new Node(e);
        }

        if (e.compareTo(node.e) < 0) {
            node.left = add2(node.left, e);
        }else{
            node.right = add2(node.right, e);
        }

        return node;
    }


    public boolean contains(E e){
        return contains(root, e);
    }


    public boolean contains(Node node, E e) {
        if(node == null){
            return false;
        }
        if (e.compareTo(node.e) == 0){
            return true;
        }else if(e.compareTo(node.e) <0){
            return contains(node.left, e);
        }else{
            return contains(node.right, e);
        }

    }



    //二分搜索树的前序遍历

    public void preOrder(){
        preOrder(root);
    }

    private void preOrder(Node node){
        if (node == null) {
            return;
        }
        System.out.println(node.e);
        preOrder(node.left);
        preOrder(node.right);
    }


    //中序遍历
    public void inOrder(){
        inOrder(root);

    }

    private void inOrder(Node node){

        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.println(node.e);
        inOrder(node.right);

    }

    //后序遍历
    public void postOrder(){
        postOrder(root);
    }

    private void postOrder(Node node){

        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.e);
    }



    @Override
    public String toString() {
        return "BinarySreachTree{" +
                "root=" + root +
                ", size=" + size +
                '}';
    }



    public static void main(String[] args) {


        BinarySreachTree<Integer> binarySreachTree = new BinarySreachTree<>();

//        binarySreachTree.add(10);
//        binarySreachTree.add(3);
//        binarySreachTree.add(19);
//        binarySreachTree.add(8);

        binarySreachTree.add2(10);
        binarySreachTree.add2(1);
        binarySreachTree.add2(2);
        binarySreachTree.add2(3);
        binarySreachTree.add2(4);
        binarySreachTree.add2(5);
        binarySreachTree.add2(19);
        binarySreachTree.add2(8);

        System.out.println(binarySreachTree);

        System.out.println(binarySreachTree.contains(3));
        System.out.println(binarySreachTree.contains(13));


        //binarySreachTree.preOrder();
        //binarySreachTree.inOrder();
        binarySreachTree.postOrder();
    }



}
