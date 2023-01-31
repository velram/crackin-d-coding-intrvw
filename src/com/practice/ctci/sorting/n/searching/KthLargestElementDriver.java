package com.practice.ctci.sorting.n.searching;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Vel
 * @date 29/01/23 : 15:34
 * Question link : https://leetcode.com/problems/kth-largest-element-in-an-array/
 * Question name : Kth Largest element
 * Question desc : Find 'k'th largest element in a list
 */
public class KthLargestElementDriver {
    public static void main(String[] args) {

    }
}

class KthLargestElementFinder {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> heap = new PriorityQueue<>(k);
        for(int currentElement : nums){
            heap.add(currentElement);
            if(nums.length > k){
                heap.poll();
            }
        }
     return heap.poll();
    }
}