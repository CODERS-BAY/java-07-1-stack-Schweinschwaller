package com.codersbay;

public class StackTooSmallException extends Exception {
    public StackTooSmallException(String errorMessage) {
        super("StackTooSmallException: " + errorMessage);
    }
}
