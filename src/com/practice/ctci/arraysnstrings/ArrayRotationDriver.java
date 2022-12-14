package com.practice.ctci.arraysnstrings;

/**
 * @author Vel
 * @date 14/09/22 : 23:11
 * Question link : https://leetcode.com/problems/rotate-image/
 * Question name : Rotate image (Matrix - anti-clockwise rotation)
 * Question desc :
 */
public class ArrayRotationDriver {
    public static void main(String[] args) {
        
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};//Test case #1
//        int[][] matrix = {{}};//Test case #
//        int[][] matrix = {{}};//Test case #
//        int[][] matrix = {{}};//Test case #
//        int[][] matrix = {{}};//Test case #

        ArrayRotator arrayRotator = new ArrayRotator();
        arrayRotator.rotate(matrix);
    }
}

class ArrayRotator {
    public void rotate(int[][] matrix) {
        //Find Transpose matrix
        //Swap columns
        transpose(matrix);
        swapColumns(matrix);
    }

    public void transpose(int[][] matrix){
        for(int row = 0; row < matrix.length; row++){
            for(int column = row + 1; column < matrix.length; column++){
                    int temp = matrix[row][column];
                    matrix[row][column] = matrix[column][row];
                    matrix[column][row] = temp;
            }
        }
    }

    public void swapColumns(int[][] matrix){
        for(int row = 0; row < matrix.length; row++){
           int leftColumn = 0;
           int rightColumn = matrix.length -1;
           while(leftColumn < rightColumn){
               int temp = matrix[row][leftColumn];
               matrix[row][leftColumn++] = matrix[row][rightColumn];
               matrix[row][rightColumn--] = temp;
           }
        }
    }
}
