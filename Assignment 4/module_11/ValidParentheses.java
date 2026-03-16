package module_11;

//LeetCode 20 – Valid Parentheses

import java.util.Stack;
public class ValidParentheses {
    static boolean isValid(String s){
        Stack<Character> stack=new Stack<>();
        for (char c:s.toCharArray()){
            if (c=='(' || c=='[' || c=='{'){
                // Push opening braces onto the stack
                stack.push(c);
            }
            else {
                if (stack.empty()){
                    return false;
                }
                char top=stack.pop();
                if (c==')' && top != '(') return false;
                if (c=='}' && top != '{') return false;
                if (c==']' && top != '[') return false;
            }
        }
        return stack.empty();   //The string is a valid Parenthesis
    }
    public static void main(String[] args) {
        String s1="{[()]}";
        String s2="{]{](]";
        System.out.println(s1+" -->"+(isValid(s1) ? "Valid":"Invalid"));
        System.out.println(s2+" -->"+(isValid(s2) ? "Valid":"Invalid"));
    }
}