package javaAssignments;

import java.util.Scanner;

public class FactorialRecursion {

    // Recursive method to calculate factorial
    public static long factorial(int n) {
        if (n == 0 || n == 1) {   // Base case
            return 1;
        }
        else {
            return n * factorial(n - 1);   // Recursive call
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("Factorial of " + num + " is: " + factorial(num));
        }

        sc.close();
    }
}
