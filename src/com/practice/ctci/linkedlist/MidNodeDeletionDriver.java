package com.practice.ctci.linkedlist;

/**
 * @author Vel
 * @date 02/10/22 : 08:45
 * Question link : https://leetcode.com/problems/delete-node-in-a-linked-list/
 * Question name : Delete Node in a Linked List
 * Question desc :
 *
 * There is a singly-linked list 'head' and we want to delete a node 'node' in it.
 *
 * You are given the node to be deleted node. You will not be given access to the first node of head.
 *
 * All the values of the linked list are unique, and it is guaranteed that the given node node is not the last node in the linked list.
 *
 * Delete the given node. Note that by deleting the node, we do not mean removing it from memory. We mean:
 *
 *     The value of the given node should not exist in the linked list.
 *     The number of nodes in the linked list should decrease by one.
 *     All the values before node should be in the same order.
 *     All the values after node should be in the same order.
 */
public class MidNodeDeletionDriver {
    public static void main(String[] args) {

        MidNodeDeletionTools midNodeDeletionTools = new MidNodeDeletionTools();
        ListNode listNode = new ListNode(3);
        midNodeDeletionTools.deleteNode(listNode);
    }
}

class MidNodeDeletionTools {
    public void deleteNode(ListNode node) {

        ListNode nextNode = node.next;
        node.val = nextNode.val; //Overrides the value.
        node.next = nextNode.next;//Overrides the next node.

    }
}