package intermediate;
/*
13.	Task 13: Search Number in Array
○	Description: Given an array, write a program to check if a specific number exists in the array.
○	Input: An array and a number to search (e.g., [4, 7, 9] and 7).
○	Output: Whether the number is in the array (e.g., "7 is in the array").

 */
import java.util.Scanner;

public class SearchNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter specific Number: ");
        int specificNum = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == specificNum) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(specificNum + " is in the array");
        }
        else {
            System.out.println(specificNum + " is not in the array");
        }
    }
}
