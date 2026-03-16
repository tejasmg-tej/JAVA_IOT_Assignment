package module_8;

//LeetCode 191 – Number of 1 Bits

/*
 * Given a positive integer n, 
 * write a function that returns the number of set bits in 
 * its binary representation (also known as the Hamming weight).
 */
import java.util.Scanner;

public class NumberOfOneBits {
    public static int hammingWeight(int n) {
        int count = 0;

        while (n > 0) {
            count += (n & 1);  
            n = n >> 1;        
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int result = hammingWeight(n);
        System.out.println("Number of set bits: " + result);
        sc.close();
    }
}