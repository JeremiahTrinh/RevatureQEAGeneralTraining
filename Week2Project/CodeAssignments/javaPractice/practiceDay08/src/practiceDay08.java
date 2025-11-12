/*
Originally created: 11/12/2025
Version: 1.0.0

TODO
Print a 2D Array: Write a program to initialize and print the elements of a given 2D integer array (matrix).
Sum of Elements: Calculate the sum of all elements in a 2D array.
Find Maximum/Minimum: Find the maximum or minimum element within a 2D array.
Row/Column Sums: Calculate the sum of elements for each individual row and each individual column in a 2D array.
Transpose Matrix: Given a matrix, find its transpose (swap rows and columns).
Matrix Addition: Add two matrices of the same dimensions.
 */

// package statement goes here

import java.util.Scanner;
import java.util.Random;

public class practiceDay08 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter bounds for a 2D array: ");
        int num_rows = scanner.nextInt();
        int num_cols = scanner.nextInt();

        // Initialize a 2D array with given inputs; generating random values to initialize the array
        long seed = 12345L;
        Random seedRandomizer = new Random(seed);
        int [][]arr1 = generateSampleMatrix(num_rows, num_cols, seedRandomizer.nextLong());
        // Print the 2D array
        System.out.println("arr1:");
        print(arr1);

        // Calc and print the sum of all elements
        int sumArr1 = sum(arr1);
        System.out.println("Sum of all elements: " + sumArr1);

        // Calc and print the sum of elements for each individual row
        int []sumRows = sumRows(arr1);
        System.out.print("Sums of each row: [");
        for (int i = 0; i < sumRows.length; i++){
            System.out.print(sumRows[i]);
            if (i < sumRows.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Calc and print the sum of elements for each individual column
        int []sumCols = sumCols(arr1);
        System.out.print("Sums of each column: [");
        for (int i = 0; i < sumCols.length; i++){
            System.out.print(sumCols[i]);
            if (i < sumCols.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Find and display the transpose of the 2D array
        int [][]arr1Transpose = transpose(arr1);
        System.out.println("arr1 Transposed:");
        print(arr1Transpose);

        // Generate another sample matrix
        int [][]arr2 = generateSampleMatrix(num_rows, num_cols, seedRandomizer.nextLong());
        System.out.println("\narr2:");
        print(arr2);
        // Add and print the result of adding two matrices
        int [][]arrSum = add(arr1, arr2);
        System.out.println("\narrSum:");
        print(arrSum);
    }


    public static int[][] generateSampleMatrix(int rows, int cols, long seed){
        final int SAMPLE_BOUND_EXCLUSIVE = 10;
        int [][]matrix = new int[rows][cols];
        Random random = new Random(seed); // Seeding the random object for repeatable results

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                // Generate a random value between 0 and 9 (bound is exclusive)
                matrix[i][j] = random.nextInt(SAMPLE_BOUND_EXCLUSIVE);
            }
        }

        return matrix;
    }

    public static void print(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            System.out.print("|");
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public static int sum(int[][] matrix){
        int sum = 0;
        for (int[] arr : matrix){
            for (int num : arr){
                sum += num;
            }
        }
        return sum;
    }

    public static int[] sumRows(int[][] matrix){
        int[] sums = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                sums[i] += matrix[i][j];
            }
        }
        return sums;
    }

    public static int[] sumCols(int[][] matrix){
        int[] sums = new int[matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++){
            for (int j = 0; j < matrix.length; j++){
                sums[i] += matrix[j][i];
            }
        }
        return sums;
    }

    public static int[][] transpose(int[][] matrix) {
        // Get the dimensions of the original matrix
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Create a new matrix with swapped dimensions for the transpose
        int[][] transposedMatrix = new int[cols][rows];

        // Iterate through the original matrix and populate the transposed matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2){
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }
}