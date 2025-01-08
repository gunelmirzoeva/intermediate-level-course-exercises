package intermediate;

import java.util.Scanner;

/*
16.	Task 16: Binary Search
○	Description: Given a sorted array, write a program to perform binary search to find a specific number.
○	Input: A sorted array and a number to search (e.g., [1, 3, 5, 7, 9] and 5).
○	Output: Whether the number is in the array (e.g., "5 is in the array").

 */
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        boolean found = false;
        int low = 0, high = arr.length - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] == target) {
                found = true;
                break;
            }
            else if(arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        if(found) {
            System.out.println(target + " is in the array");
        } else {
            System.out.println(target + " is not in the array");
        }
    }
}
