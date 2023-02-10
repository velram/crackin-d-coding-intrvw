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

        //Calculate frequency table
        int[] frequencyTable = calculateFrequencyTable(input);
        //Find isValidPalindrome
        return isValidPalindrome(frequencyTable);
    }

    private boolean isValidPalindrome(int[] frequencyTable) {

        int oneCounter = 0;

        for(int currentElement : frequencyTable){
            if(currentElement > 1){
                return false;
            }

            if(currentElement == 1){
                oneCounter++;
            }
        }

        return oneCounter <= 1;
    }

    public int[] calculateFrequencyTable(String input) {

        int[] frequencyTable = new int[26];

        for(char currentElement : input.toCharArray()){
            if(frequencyTable[currentElement - 'a'] == 0){
                frequencyTable[currentElement - 'a']++;
            }
            else {
                frequencyTable[currentElement - 'a']--;
            }
        }

        return frequencyTable;
    }

}
