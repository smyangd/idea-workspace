package com.example.damien2javaalgorithm.linkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class 删除链表中等于给定值val的所有节点 {
    public ListNode removeElements(ListNode head, int val) {

        ListNode dummyhead = new ListNode(-1);
        dummyhead.next = head;
        ListNode prev = dummyhead;
        while (prev.next != null) {
            if (prev.next.val == val) {

                prev.next = prev.next.next;

            }else{
                prev = prev.next;
            }
        }
        return dummyhead.next;
    }


    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
//        listNode.next = new ListNode(2);
//        listNode.next.next = new ListNode(6);
//        listNode.next.next.next = new ListNode(4);

        //System.out.println(删除链表中等于给定值val的所有节点.removeElements(listNode, 1));
        System.out.println((new 删除链表中等于给定值val的所有节点()).removeElements(listNode, 1));

    }
}