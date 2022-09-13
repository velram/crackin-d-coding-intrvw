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