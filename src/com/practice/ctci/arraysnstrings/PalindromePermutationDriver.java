package com.practice.ctci.arraysnstrings;

/**
 * @author Vel
 * @date 10/02/23 : 10:37
 * Question link : https://leetcode.com/problems/palindrome-permutation/
 * Question name : Palindrome permutation
 * Question desc :
 */
public class PalindromePermutationDriver {
    public static void main(String[] args) {

        String input = "abab";

        PalindromePermutationFinder palindromePermutationFinder = new PalindromePermutationFinder();
        boolean canFormPalindrome = palindromePermutationFinder.canFormPalindrome(input);

        System.out.println(input + "can form palindrome : " + canFormPalindrome);
    }
}

class PalindromePermutationFinder {
    public boolean canFormPalindrome(String input){

        if(input.length() == 1){
            return true;
        }

        return canFormPalindrome(computeFrequency(input));
    }

    private boolean canFormPalindrome(int[] frequencyTable) {

        int oddCount = 0;

        for(int currentElement : frequencyTable){
          if(currentElement % 2 != 0){
              oddCount++;
              if(oddCount > 1){
                  return false;
              }
          }
        }

        return oddCount <= 1;
    }

    public int[] computeFrequency(String input) {

        int[] frequencyTable = new int[26];

        for(char currentElement : input.toCharArray()){
            frequencyTable[currentElement - 'a']++;
        }

        return frequencyTable;
    }

}
