package intermediate;

import java.util.Scanner;

/*
11.	Task 11: Palindrome
○	Description: Take a string from the user and write a program to check if
    the characters in the string read the same forward and backward.
○	Input: A string (e.g., "racecar").
○	Output: Whether the string is a palindrome or not (e.g., "racecar is a palindrome").

 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder reversedStr = new StringBuilder(str);
        reversedStr.reverse();
        if(str.equals(reversedStr.toString())){
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
}
