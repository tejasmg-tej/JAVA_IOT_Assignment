package module_9;
//LeetCode 22 – Generate Parentheses

/*
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 */
import java.util.*;

public class GenerateParentheses {
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    public static void backtrack(List<String> result, String current, int open, int close, int n) {

        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }
        if (open < n) {
            backtrack(result, current + "(", open + 1, close, n);
        }
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, n);
        }
    }
    public static void main(String[] args) {
        int n = 3;
        List<String> result = generateParenthesis(n);
        System.out.println(result);
    }
}