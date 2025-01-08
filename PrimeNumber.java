package intermediate;

import java.util.Scanner;

/*
12. Task 12: Prime Number
○ Description: Take a number from the user and write a program to check if the number is a prime number.
○ Input: An integer (e.g., 7).
○ Output: Whether the number is prime or not (e.g., "7 is a prime number").

 */
public class PrimeNumber {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(isPrime(number) ? number + " is a prime number" : number + " is not a prime number");
    }
}
