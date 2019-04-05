package com.example.damien2javaalgorithm.binarySearchTree;

/**
 * 创建一个二叉树的节点
 */
public class Node {
    public int iKey;
    public double iValue;//可以修改成其他的object类型，对象，或者数据项
    public Node leftChild;
    public Node rightChild;

    /**
     * 将该节点的详细信息打印出来
     */
    public void show(){
        System.out.print('[');
        System.out.print("iKey = " + iKey);
        System.out.print(',');
        System.out.print("iValue = " + iValue);
        System.out.print(']');
    }



}
