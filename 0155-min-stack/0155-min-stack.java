import java.util.Stack;

public class MinStack {
    private Stack<Integer> nums; // Stack to store elements
    private Stack<Integer> minStack; // Stack to store the minimum elements

    public MinStack() {
        nums = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        nums.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        if (!nums.isEmpty()) {
            if (nums.peek().equals(minStack.peek())) {
                minStack.pop();
            }
            nums.pop();
        }
    }

    public int top() {
        if (!nums.isEmpty()) {
            return nums.peek();
        } else {
            throw new IllegalStateException("Stack is empty");
        }
    }

    public int getMin() {
        if (!minStack.isEmpty()) {
            return minStack.peek();
        } else {
            throw new IllegalStateException("Stack is empty");
        }
    }
}
