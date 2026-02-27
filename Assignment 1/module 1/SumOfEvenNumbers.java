package javaAssignments;


public class SumOfEvenNumbers {
    public static void main(String[] args) {

        int i = 102;      // first even number
        int sum = 0;

        while (i <= 200) {
            sum = sum + i;
            i = i + 2;   // move to next even number
        }

        System.out.println("Sum of even numbers from 1 to 100 is: " + sum);
    }
}