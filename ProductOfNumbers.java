package intermediate;
/*
14.	Task 14: Product of Numbers
○	Description: Take several numbers from the user and write a program to calculate the product of these numbers.
○	Input: A list of integers (e.g., [2, 3, 4]).
○	Output: The product of the numbers (e.g., 24).

 */
import java.util.Scanner;
public class ProductOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int product = 1;
        while(sc.hasNextInt()) {
            int n = sc.nextInt();
            product *= n;
        }
        System.out.println(product);
    }
}
