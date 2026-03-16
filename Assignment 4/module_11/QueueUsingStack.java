package module_11;

//LeetCode 232 – Implement Queue using Stacks

import java.util.Stack;

class QueueUsingStack {
    Stack<Integer> s1;
    Stack<Integer> s2;
    public QueueUsingStack() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    public void push(int x) {
        s1.push(x);
    }
    public int pop() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
    public int peek() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }
    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
    public static void main(String[] args) {
        QueueUsingStack q = new QueueUsingStack();

        q.push(1);
        q.push(2);
        System.out.println(q.peek());  
        System.out.println(q.pop());   
        System.out.println(q.empty()); 
    }
}