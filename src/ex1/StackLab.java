package ex1;

import java.util.Stack;

public class StackLab implements LIFO{

    private Stack<Integer> stack;

    public StackLab() {
        stack = new Stack<Integer>();
    }

    @Override
    public void push(int value) {
        stack.push(value);
    }

    @Override
    public int pop() {
        return stack.pop();
    }

    @Override
    public String toString() {
        String res = "";
        for (Integer i : stack) {
            res += i + " ";
        }
        return res;
    }

    public static Stack<Integer> sortStack(Stack<Integer> stack) {
        Stack<Integer> sortedStack = new Stack<>();

        while (!stack.isEmpty()) {
            int current = stack.pop();
            while (!sortedStack.isEmpty() && sortedStack.peek() > current) {
                stack.push(sortedStack.pop());
            }
            sortedStack.push(current);
        }
        while (!sortedStack.isEmpty()) {
            stack.push(sortedStack.pop());
        }
        return stack;
    }



}
