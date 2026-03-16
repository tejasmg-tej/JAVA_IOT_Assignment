package module_8;

//LeetCode 136 – Single Number using XOR

/*
 * Given a non-empty array of integers nums, every element appears twice except for one. 
 * Find that single one.
 */
public class SingleNumber {

    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result = result ^ num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        int ans = singleNumber(nums);
        System.out.println("Single number is: " + ans);
    }
}