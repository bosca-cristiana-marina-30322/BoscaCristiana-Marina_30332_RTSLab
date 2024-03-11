package LabSession1;

import java.util.Scanner;
public class ex2 {
        public static void main(String[] args) {
            int[][] matrix1 = {
                    {2, 3, 1},
                    {7, 1, 6},
                    {9, 2, 4}
            };
            int[][] matrix2 = {
                    {8, 5, 3},
                    {3, 9, 2},
                    {2, 7, 3}
            };

            // Print the matrix
            System.out.println("Matrix1:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matrix1[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Matrix2:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matrix2[i][j] + " ");
                }
                System.out.println();
            }
            int[][] addMatrix = new int[3][3];

            // Add the matrices
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    addMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }

            // Print the result matrix
            System.out.println("Result of matrix addition:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(addMatrix[i][j] + " ");
                }
                System.out.println();
            }
            int[][] multMatrix = new int[3][3];

            // Multiply the matrices
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {
                        multMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }

            // Print the result matrix
            System.out.println("Result of matrix multiplication:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(multMatrix[i][j] + " ");
                }
                System.out.println();
            }
}}



