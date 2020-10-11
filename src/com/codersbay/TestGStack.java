package com.codersbay;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestGStack {

    @Test
    public void testPushAndSize() {
        GStack stack = new GStack();
        stack.push(10);
        assertEquals(stack.size(), 1);
        stack.push(12);
        assertEquals(stack.size(), 2);
        stack.push(10);
        assertEquals(stack.size(), 3);
    }

    @Test
    public void testPopPeekAndPop() throws StackTooSmallException {
        GStack stack = new GStack();
        stack.push(10);
        stack.push(12);
        stack.push(10);
        assertEquals(stack.size(), 3);
        assertEquals(stack.pop(), 10);
        stack.push(11);
        stack.push(12);
        stack.push(13);
        int[] popTest = stack.pop(3);
        assertEquals(popTest[0], 11);
        assertEquals(popTest[1], 12);
        assertEquals(popTest[2], 13);
    }

    @Test
    public void testStackTooSmallException() {
        GStack stack = new GStack();
        assertThrows(StackTooSmallException.class, () -> {
            stack.pop();
        });
        assertThrows(StackTooSmallException.class, () -> {
            stack.peek();
        });
        assertThrows(StackTooSmallException.class, () -> {
            stack.pop(10);
        });
    }

}
