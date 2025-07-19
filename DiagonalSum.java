// 3 X 3 MAatrix Diagonal Sum By Taking User Input

import java.util.Scanner;
public class DiagonalSum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // Declare a 3x3 matrix
        int[][] matrix = new int[3][3];

        // Input elements into the matrix
        System.out.println("Enter elements for a 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Calculate the sum of the diagonals
        int diagonalSum = 0;
        for (int i = 0; i < 3; i++) {
            diagonalSum += matrix[i][i]; // Primary diagonal
            diagonalSum += matrix[i][2 - i]; // Secondary diagonal
        }

        // Since the center element is counted twice in a 3x3 matrix, subtract it once
        diagonalSum -= matrix[1][1];

        // Print the result
        System.out.println("The sum of the diagonals is: " + diagonalSum);

        sc.close();
    }

}
