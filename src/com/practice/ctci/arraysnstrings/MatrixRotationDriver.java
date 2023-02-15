package com.practice.ctci.arraysnstrings;

/**
 * @author Vel
 * @date 15/02/23 : 21:21
 * Question link :
 * Question name :
 * Question desc :
 */
public class MatrixRotationDriver {
    public static void main(String[] args) {

    }
}

class MatrixRotator{
    public void rotate(int[][] matrix) {
        //find transpose
        //interchange columns
        findTranspose(matrix);
        interchangeColumns(matrix);
    }


    private void findTranspose(int[][] matrix) {

        for(int row = 0; row < matrix.length; row++){
         for(int column = row + 1; column < matrix[0].length; column++){
             int temp = matrix[row][column];
             matrix[row][column] = matrix[column][row];
             matrix[column][row] = temp;
         }
        }
    }

    private void interchangeColumns(int[][] matrix) {

        for(int row = 0; row < matrix.length; row++){
            int startColumn = 0;
            int endColumn = matrix[0].length-1;

            while(startColumn < endColumn){
                int temp = matrix[row][startColumn];
                matrix[row][startColumn++] = matrix[row][endColumn];
                matrix[row][endColumn--] = temp;
            }
        }

    }

}