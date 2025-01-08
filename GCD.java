package intermediate;

import java.util.Scanner;

/*
20.	Task 20: GCD (Greatest Common Divisor)
○	Description: Write a program to calculate the greatest common divisor (GCD) of two numbers.
○	Input: Two integers (e.g., 56 and 98).
○	Output: The greatest common divisor (e.g., 14).

 */
public class GCD {
    public static int gcd(int num1, int num2) {
        while (num2 != 0) {
            if (num1 > num2) {
                num1 = num1 % num2;
            } else {
                num2 = num2 % num1;
            }
        }
        return num1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(gcd(num1, num2));
    }
}
