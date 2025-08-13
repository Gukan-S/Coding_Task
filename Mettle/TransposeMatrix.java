//Given a 2D integer array matrix, return the transpose of the matrix.
//        Explanation:
//The transpose of a matrix is the matrix flipped over its main diagonal, switching
//the matrix's row and column indices.
//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//Output: [[1,4,7],[2,5,8],[3,6,9]]

        package Mettle;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        Transpose(arr);
    }
    static void Transpose(int[][] arr){
        int rows = arr.length;
        int cols = arr[0].length;

        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = arr[i][j];
            }
        }
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}
