// Print Sum of Elements in an Array by taking user Input

import java.util.Scanner;
public class SumOfElements
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Declare the array
        int[] arr = new int[n];

        // Input elements into the array
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Calculate the sum of elements
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        // Print the result
        System.out.println("The sum of the elements in the array is: " + sum);

        sc.close();
    }
}
