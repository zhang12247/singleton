package StackTr;

import java.util.Stack;

public class AntMinStack {
    private Stack<Integer> stack = new Stack<>();

    private Stack<Integer> mstack = new Stack<>();

    public void push(int data) {
        stack.push(data);

        if (mstack.empty()) {
            mstack.push(data);
        } else {
            Integer min = mstack.peek();
            if (min != null && min.intValue() > data) {
                mstack.push(data);
            }
        }
    }

    public int pop() {
        Integer data = stack.pop();
        if (data != null && !mstack.empty() && data.intValue() == mstack.peek()) {
            mstack.pop();
        }
        return data;
    }

    public int min() {
        return mstack.peek();
    }

    public boolean empty() {
        return stack.empty();
    }
}
