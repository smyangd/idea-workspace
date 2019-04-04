package com.example.damien2javaalgorithm.linkedList;

public class 递归删除链表中等于给定值val的所有节点 {


    public ListNode removeElements(ListNode head, int val, int depth) {

        String depthString = depthString(depth);
        System.out.print(depthString);
        System.out.println("call: remove" +val +"in: "+head);
        if (head == null) {
            System.out.print(depthString);
            System.out.println("return: " + head);
            return null;
        }
        ListNode res = removeElements(head.next, val, depth + 1);
        System.out.print(depthString);
        System.out.println("after remove: " + val+": " +res);
        if (head.val == val) {
            return res;
        } else {
            head.next = res;
        }
        return head;
    }

    private String depthString(int depth){
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            res.append(i);
        }
        return res.toString();
    }

    public static void main(String[] args) {

            ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(6);
        listNode.next.next.next = new ListNode(4);

            //System.out.println(删除链表中等于给定值val的所有节点.removeElements(listNode, 1));
        System.out.println((new 递归删除链表中等于给定值val的所有节点()).removeElements(listNode, 6, 0));

        }



}
