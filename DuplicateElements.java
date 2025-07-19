// Remove Duplicate Elements From An Array By Taking User Input

import java.util.Scanner;
public class DuplicateElements
{
    public static void main(String[] args)
    {
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

        // Remove duplicates
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int k = 0; k < j; k++) {
                if (arr[i] == temp[k]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                temp[j++] = arr[i];
            }
        }

        // Print the result
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }

        sc.close();
    }
}
