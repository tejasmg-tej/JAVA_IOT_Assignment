package module_8;

//LeetCode 387 – First Unique Character in a String

/*
 * Given a string s, find the first non-repeating character in it and return its index. 
 * If it does not exist, return -1.
 */

import java.util.Scanner;

public class FirstUniqueCharacter {

    public static int firstUniqChar(String s) {

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        int result = firstUniqChar(s);
        System.out.println("Index of first unique character: " + result);

        sc.close();
    }
}