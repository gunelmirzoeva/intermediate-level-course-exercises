package intermediate;

import java.util.Scanner;

/*
15.	Task 15: Matrix Addition
○	Description: Given two matrices, write a program to calculate their sum.
○	Input: Two matrices (e.g., [[1,2],[3,4]] and [[5,6],[7,8]]).
○	Output: The sum of the matrices (e.g., [[6,8],[10,12]]).

 */
public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] matrix1 = new int[n][n];
        int [][] matrix2 = new int[n][n];
        //first matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        //second matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
        int [][] sum = new int[n][n];
        //sum
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        //printing
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

    }
}
