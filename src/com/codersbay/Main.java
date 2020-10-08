package com.codersbay;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GStack stack = new GStack();

        //PUSH and POP TEST
        System.out.println("push and pop test:");
        System.out.println("push 0-9");
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        System.out.println(stack.toString());

        System.out.println("pop " + (stack.size() / 2));
        // Try bercause of the exception
        int[] helpArray = new int[stack.size() / 2];
        try {
            helpArray = stack.pop(stack.size() / 2);
        } catch (StackTooSmallException e) {
            e.printStackTrace();
        }
        System.out.println(stack.toString());
        System.out.print("return value: ");
        System.out.println(Arrays.toString(helpArray));
        System.out.println("pop one element");
        int helpInt = 0;
        try {
            helpInt = stack.pop();
        } catch (StackTooSmallException e) {
            e.printStackTrace();
        }
        System.out.println(stack.toString());
        System.out.println("return value: " + helpInt);

        //SIZE TEST
        System.out.println("size test");
        System.out.println(stack.toString());
        System.out.println("size " + stack.size());

        //PEEK TEST
        System.out.println("peek test");
        try {
            System.out.println("peek: " + stack.peek());
        } catch (StackTooSmallException e) {
            e.printStackTrace();
        }


    }
}