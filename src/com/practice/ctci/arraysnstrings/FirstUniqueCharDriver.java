package com.practice.ctci.arraysnstrings;

/**
 * @author Vel
 * @date 15/09/22 : 22:36
 * Question link :
 * Question name :
 * Question desc :
 */
public class FirstUniqueCharDriver {
    public static void main(String[] args) {

    }
}

class FirstUniqueCharFinder {
    public int findFirstUniqeChar(String s) {

        int[] characterFrequency = new int[26];

        for(char currentElement : s.toCharArray()){
         characterFrequency[currentElement - 'a']++;
        }

        for(int loopIndex = 0; loopIndex < s.length(); loopIndex++){
            if(characterFrequency[s.charAt(loopIndex) - 'a'] == 1){
                return loopIndex;
            }
        }

        return -1;
    }
}
