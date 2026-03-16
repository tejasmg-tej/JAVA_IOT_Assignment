package module_9;

//LeetCode 78 – Subsets

/*Given an integer array nums of unique elements, 
 * return all possible subsets (the power set).
 * 
 */
import java.util.*;

public class SubsetsExample {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }

    public static void backtrack(int[] nums, int start, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));
        for (int i = start; i < nums.length; i++) {
            current.add(nums[i]);            
            backtrack(nums, i + 1, current, result); 
            current.remove(current.size() - 1); 
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = subsets(nums);
        System.out.println(result);
    }
}
