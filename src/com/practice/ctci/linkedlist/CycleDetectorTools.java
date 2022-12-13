package com.practice.ctci.linkedlist;

/**
 * @author Vel
 * @date 12/12/22 : 21:59
 * Question link : https://leetcode.com/problems/linked-list-cycle/
 * Question name : Linked list cycle
 * Question desc :
 */
public class CycleDetectorTools {
    public static void main(String[] args) {

    }
}

class LinkedListCycleDetector {
    public boolean hasCycle(ListNode head) {

        if(head == null){
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while(slow != fast){
            if(fast == null || fast.next == null){
                return false;
            }

            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }
}
