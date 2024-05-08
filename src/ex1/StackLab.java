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
}
