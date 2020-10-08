package com.codersbay;

import java.util.ArrayList;
import java.util.List;

public class GStack {
    private List<Integer> stack;

    public GStack() {
        stack = new ArrayList<>();
    }

    //adds a new element to the top of the stack
    public void push(int input) {
        this.stack.add(input);
    }

    //returns the number of elements in the stack
    public int size() {
        return this.stack.size();
    }

    //returns the last element of the stack and removes it from the stack
    public int pop() throws StackTooSmallException {
        if (this.stack.isEmpty()) {
            throw new StackTooSmallException("pop");
        }
        return this.stack.remove(this.stack.size() - 1);
    }

    //returns the last element of the stack without modifying the stack
    public int peek() throws StackTooSmallException {
        if (this.stack.isEmpty()) {
            throw new StackTooSmallException("peek");
        }
        return this.stack.get(this.stack.size() - 1);
    }

    //returns the last n elements of the stack and removes them from the stack
    public int[] pop(int n) throws StackTooSmallException {
        if (n > this.stack.size()) {
            throw new StackTooSmallException("pop");
        }
        int[] help = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            help[i] = this.stack.remove(this.stack.size() - 1);
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