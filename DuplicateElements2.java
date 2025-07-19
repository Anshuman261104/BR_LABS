// Print Duplicate elements from an array by taking  user input

import java.util.Scanner;
public class DuplicateElements2
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

        // Print duplicate elements
        System.out.println("Duplicate elements in the array:");
        boolean foundDuplicate = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    foundDuplicate = true;
                    break; // Break to avoid printing the same duplicate multiple times
                }
            }
        }

        if (!foundDuplicate) {
            System.out.println("No duplicate elements found.");
        }

        sc.close();
    }
}
