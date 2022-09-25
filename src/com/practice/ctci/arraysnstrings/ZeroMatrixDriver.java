package com.practice.ctci.arraysnstrings;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Vel
 * @date 18/09/22 : 19:10
 * Question link : https://leetcode.com/problems/set-matrix-zeroes/
 * Question name : Set Matrix zeroes
 * Question desc : Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
 * You must do it in place.
 */
public class ZeroMatrixDriver {
    public static void main(String[] args) {

    }
}

/**
 * Approach :
 *  1. Collect the row & columns containing zeroes
 *    (one complete traversal of entire- m*n matrix)
 *  2. One more time - traverse the matrix (entire)
 *  3. Check if the row / column is present in the set.
 *  4. If present, mark the cell as zero
 *  S.C - O(m*n)
 *  T.C - O(m*n)
 */
class ZeroMatrixTools {
    public void setZeroes(int[][] matrix) {

        Set<Integer> zeroValueRows = new HashSet<Integer>();
        Set<Integer> zeroValueColumns = new HashSet<Integer>();

        //Collect the row & column indices
        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[0].length; column++){
                if(matrix[row][column] == 0){
                    zeroValueRows.add(row);
                    zeroValueRows.add(column);
                }
            }
        }

        //check the indices and mark the cell as zero.

        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[0].length; column++){
                if(zeroValueRows.contains(row) || zeroValueColumns.contains(column)){
                    matrix[row][column] = 0;
                }
            }
        }

    }
}

