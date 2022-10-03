package com.practice.ctci.arraysnstrings;

/**
 * @author Vel
 * @date 19/09/22 : 23:07
 * Question link : https://leetcode.com/problems/rotate-string/
 * Question name : Rotate String
 * Question desc :
 */
public class StringRotationDriver {
    public static void main(String[] args) {

        //Test case #
        String s = "abcde";
        String goal = "cdeab";

        //Test case #
//        String s = "";
//        String goal = "";

        StringRotationTools stringRotationTools = new StringRotationTools();
        stringRotationTools.rotateString(s, goal);
    }
}

class StringRotationTools {
    public boolean rotateString(String s, String goal) {

     return (s.length() == goal.length()) &&
             (s + s).contains(goal);

    }
}
