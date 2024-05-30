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
        for (int i : stack) {
            res += i + " ";
        }
        return res;
    }

    public void sortStack() {
        Stack<Integer> sortedStack = new Stack<>();
        Stack<Integer> temp = new Stack<>();
        while (!this.stack.isEmpty()) {
            int current = this.stack.pop();
            while (!sortedStack.isEmpty() && sortedStack.peek() > current) {
                this.stack.push(sortedStack.pop());
            }
            sortedStack.push(current);
        }
        while (!sortedStack.isEmpty()) {
            temp.push(sortedStack.pop());
        }

        while (!temp.isEmpty()) {
            this.stack.push(temp.pop());
        }
    }



}
