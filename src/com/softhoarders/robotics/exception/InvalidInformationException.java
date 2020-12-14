package com.softhoarders.robotics.exception;

public class InvalidInformationException extends RuntimeException {

    public InvalidInformationException(String message) {
        super(message);
    }

    public InvalidInformationException(String message, Throwable cause) {
        super(message, cause);
    }
}
