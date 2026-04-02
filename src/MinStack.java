import java.util.*;

class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    void push(int x) {
        stack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek())
            minStack.push(x);
    }

    void pop() {
        if (stack.pop().equals(minStack.peek()))
            minStack.pop();
    }

    int getMin() {
        return minStack.peek();
    }
}