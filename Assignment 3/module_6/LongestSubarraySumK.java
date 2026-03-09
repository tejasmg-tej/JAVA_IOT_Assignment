package module_6;

import java.util.HashMap;

public class LongestSubarraySumK {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        int k = 6;

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (sum == k) {
                maxLen = i + 1;
            }

            if (map.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - map.get(sum - k));
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        System.out.println("Longest subarray length with sum " + k + " is: " + maxLen);
    }
}