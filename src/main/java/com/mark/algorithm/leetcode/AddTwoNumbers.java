package com.mark.algorithm.leetcode;

import com.mark.algorithm.leetcode.base.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        int carray = 0;
        int answer = l1.val + l2.val;
        if(answer >= 10){
            carray = 1;
            result.val = answer % 10;
        }else{
            result.val = answer;
        }
        ListNode next = result;
        while(l1.next != null || l2.next !=null){
            if(l1.next == null){
                l1.next = new ListNode(0);
            }
            if(l2.next == null){
                l2.next = new ListNode(0);
            }
            answer = l1.next.val + l2.next.val + carray;
            if(answer >= 10){
                carray = 1;
                next.next = new ListNode(answer % 10);
            }else{
                next.next = new ListNode(answer);
            }
            l1 = l1.next;
            l2 = l2.next;
            next = next.next;
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        AddTwoNumbers solution = new AddTwoNumbers();
        ListNode listNode = solution.addTwoNumbers(l1, l2);
        System.out.println(listNode);
    }
}
