package com.practice.ctci.arraysnstrings;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Vel
 * @date 13/09/22 : 21:40
 * Question link : https://leetcode.com/problems/contains-duplicate/
 * Question name : Contains duplicate
 * Question desc :
 */
public class DuplicateElementDriver {
    public static void main(String[] args) {

//        int[] nums = {1,2,3,4,5,1};
        int[] nums = {8,7,3,0,23};
//        int[] nums = {1,2,3,4,5,1};
//        int[] nums = {1,2,3,4,5,1};
//        int[] nums = {1,2,3,4,5,1};
//        int[] nums = {1,2,3,4,5,1};
//        int[] nums = {1,2,3,4,5,1};
        DuplicateFinder duplicateFinder = new DuplicateFinder();
        System.out.println("Input array contains duplicate : " + duplicateFinder.containsDuplicate(nums));
    }
}

class DuplicateFinder {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> inputSet = new HashSet<>();

        for(int currentElement : nums){
            if(!inputSet.add(currentElement)){
                return true;
            }
        }
        return false;
    }
}