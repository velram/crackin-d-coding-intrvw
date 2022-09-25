package com.practice.ctci.arraysnstrings;

/**
 * @author Vel
 * @date 24/09/22 : 20:15
 * Question link :
 * Question name : One Edit away
 * Question desc :
 */
public class OneAwayDriver {
    public static void main(String[] args) {

        //Test case #1 Happy flow (modify one)- PASS
//        String input = "pale";
//        String goal = "pake";

        //Test case#2 - Add one char - PASS
//        String input = "pale";
//        String goal = "pales";


        //Test case#3 delete one char -

//        String input = "pale";
//        String goal = "pae";

        //Test case#4 same length - multiple modifications - PASS

//        String input = "abcde";
//        String goal = "fghij";


        //Test case#5 multiple removals - PASS

//        String input = "efghijklmn";
//        String goal = "efgh";

        //Test case#6 Mutliple add - PASS

//        String input = "wxyze";
//        String goal = "wxyzeklmnop";


        //Test case#7 - insert @ middle - PASS

//        String input = "hello";
//        String goal = "hewllo";

        //Test case#8 - same strings (false)- PASS
//        String input = "hello";
//        String goal = "olleh";


        //Test case#9 -
        String input = "";
        String goal = "";

        //Test case#
        //String input = "";
        //String goal = "";

        //Test case#
        //String input = "";
        //String goal = "";

        OneEditFinder oneEditFinder = new OneEditFinder();
        System.out.println("OneEditAway : " + oneEditFinder.isOneEditAway(input, goal));

    }
}

class OneEditFinder {
    public boolean isOneEditAway(String input, String goal){

        if(!(input.length() == goal.length() || input.length()+1 == goal.length()
             || input.length()-1 == goal.length())){
            return false;
        }

        int[] charFrequency = new int[26];


        for(char currentChar : input.toCharArray()){
            charFrequency[currentChar - 'a']++;
        }

        for(char currentChar: goal.toCharArray()){
            charFrequency[currentChar - 'a']--;
        }

        int distance = 0;

        for(int loopIndex = 0; loopIndex < charFrequency.length; loopIndex++){
            if(charFrequency[loopIndex] != 0){
                distance++;
            }
        }

        return distance == 1 || distance == 2;
    }
}