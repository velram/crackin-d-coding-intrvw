package com.practice.ctci.arraysnstrings;

/**
 * @author Vel
 * @date 16/09/22 : 23:27
 * Question link : https://leetcode.com/problems/valid-anagram/
 * Question name : Valid Anagram / Check permutations
 * Question desc :
 */
public class PermutationDriver {
    public static void main(String[] args) {

        String firstString = "anagram";
        String secondString = "nagaram";
//        String firstString = "abcd"; //Test case #2 - Not anagram - PASS
//        String secondString = "nagaram";

        PermutationChecker permutationChecker = new PermutationChecker();
        System.out.println("Is Anagram : " + permutationChecker.isAnagram(firstString, secondString));
    }
}

/**
 * Approach :
 * 1. Count frequency of characters of s1 & store in an individual array
 * 2. Count frequency of characters of s. Reduce the count in freq array
 * 3. If the count is != 0 means, the char is not present in string
 * 4. Immediately quit the loop & return false;
 * 5. If loop is successfully completed,
 */
class PermutationChecker {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        int[] charFrequency = new int[26];

        for(char currentChar : s.toCharArray()){
            charFrequency[currentChar - 'a']++;
        }

        for(int loopIndex = 0; loopIndex < t.length(); loopIndex++){
            if(--charFrequency[t.charAt(loopIndex) - 'a'] < 0){
                return false;
            }
        }

        return true;
    }
}
