package com.example.damien2javaalgorithm.binarySearchTree;

import java.util.*;

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


    //前序遍历非递归实现
    public void preOrderNR(){
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node curr = stack.pop();
            System.out.println(curr.e);

            if (curr.right != null) {
                stack.push(curr.right);
            }

            if (curr.left != null) {
                stack.push(curr.left);
            }

        }
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


    //二分搜索树的层序遍历
    public void levelOrder(){
        Queue<Node> queue = new LinkedList<>();
        ((LinkedList<Node>) queue).add(root);
        while (!queue.isEmpty()) {
            Node curr = queue.remove();
            System.out.println(curr.e);
            if (curr.left != null) {
                ((LinkedList<Node>) queue).add(curr.left);
            }

            if (curr.right != null) {
                ((LinkedList<Node>) queue).add(curr.right);
            }
        }
    }


    //寻找二分搜索书的做小元素
    public E minimum(){
        if (size == 0) {
            System.out.println();
        }
        return minimum(root).e;
    }

    private Node minimum(Node node){
        if (node.left == null) {
            return node;
        }
        return minimum(node.left);
    }


    //寻找二分搜索书的做大元素
    public E maximum(){
        if (size == 0) {
            System.out.println();
        }
        return maximum(root).e;
    }

    private Node maximum(Node node){
        if (node.right == null) {
            return node;
        }
        return maximum(node.right);
    }


    //删除二分搜索树最小元素
    public E removeMIN(){
        E ret = minimum();
        root = removeMIN(root);
        return ret;
    }

    private Node removeMIN(Node node){

        if (node.left == null){
            Node rightNode = node.right;
            node.right = null;
            size--;
            return rightNode;
        }

        node.left=removeMIN(node.left);
        return node;

    }

    //删除二分搜索树的指定任意元素
    public void remove(E e){
        root = remove(root, e);
    }

    private Node remove(Node node ,E e){
        if (node == null) {
            return null;
        }

        if (e.compareTo(node.e) < 0) {
            node.left = remove(node.left, e);
            return node;
        }else if (e.compareTo(node.e) >0){
            node.right = remove(node.right, e);
            return node;
        }else{

            if (node.left == null) {
                Node rightNode = node.right;
                node.right = null;
                size--;
                return rightNode;
            }

            if (node.right == null) {
                Node leftNode = node.left;
                node.left = null;
                size--;
                return leftNode;
            }

            Node successor = minimum(node.right);
            successor.right = removeMIN(node.right);
            successor.left = node.left;

            node.left = node.right = null;
            return successor;
        }

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

        for (int i = 0; i < 10; i++) {

            binarySreachTree.add2((int)(Math.random()*100));

        }
//        binarySreachTree.add2(10);
//        binarySreachTree.add2(3);
//        binarySreachTree.add2(4);
//        binarySreachTree.add2(5);
//        binarySreachTree.add2(19);
//        binarySreachTree.add2(8);

        System.out.println(binarySreachTree);

        System.out.println(binarySreachTree.contains(3));
        System.out.println(binarySreachTree.contains(13));


        //binarySreachTree.preOrder();
        binarySreachTree.inOrder();
        //binarySreachTree.postOrder();

        //binarySreachTree.preOrderNR();
        //binarySreachTree.levelOrder();
        System.out.println("--------------------");
        System.out.println(binarySreachTree.minimum());
        System.out.println(binarySreachTree.maximum());

        binarySreachTree.removeMIN();

        //System.out.println(binarySreachTree);

        System.out.println("--------------------");
        binarySreachTree.inOrder();

        //Queue queue = new LinkedList<>();

        Set set = new HashSet();
    }



}
