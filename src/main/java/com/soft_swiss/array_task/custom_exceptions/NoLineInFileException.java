package com.soft_swiss.array_task.custom_exceptions;

public class NoLineInFileException extends RuntimeException {
    public NoLineInFileException(String errorMessage) {
        super(errorMessage);
    }
}
