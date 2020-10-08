package com.codersbay;

import java.util.ArrayList;
import java.util.List;

public class GStack {
    private List<Integer> stack;

    public GStack() {
        stack = new ArrayList<>();
    }

    public void push(int input) {
        this.stack.add(input);
    }

    public int size() {
        return this.stack.size();
    }

    public int pop() throws StackTooSmallException {
        if (this.stack.isEmpty()) {
            throw new StackTooSmallException("pop");
        }

        return this.stack.remove(this.stack.size() - 1);

    }

    public int peek() throws StackTooSmallException {
        if (this.stack.isEmpty()) {
            throw new StackTooSmallException("peek");
        }
        return this.stack.get(this.stack.size() - 1);
    }

    public int[] pop(int n) throws StackTooSmallException {
        if (n > this.stack.size()) {
            throw new StackTooSmallException("pop");
        }
        int[] help = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            help[i] = this.stack.get(this.stack.size() - 1);
            this.stack.remove(this.stack.size() - 1);
        }
        return help;
    }

    @Override
    public String toString() {
        String help = "";
        for (int i = 0; i < this.stack.size() - 1; i++) {
            help += this.stack.get(i).toString() + ", ";
        }
        help += this.stack.get(this.stack.size() - 1).toString();
        return help;
    }
}