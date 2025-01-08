package intermediate;

import java.util.Scanner;

/*
19.	Task 19: Quick Sort
○	Description: Write a program to sort an array using the quick sort algorithm.
○	Input: An array (e.g., [34, 7, 23, 32, 5, 62]).
○	Output: The sorted array (e.g., [5, 7, 23, 32, 34, 62]).

 */
public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot_location = partition(arr, low, high);
            quickSort(arr, low, pivot_location - 1);
            quickSort(arr, pivot_location + 1, high);
        }
    }
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        quickSort(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
