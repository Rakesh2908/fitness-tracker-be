package com.fitnesstracker.exception;

/**
 * Thrown when a requested resource does not exist (e.g. user, workout, nutrition log by id).
 * Mapped to HTTP 404 Not Found by {@link GlobalExceptionHandler}.
 */
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String message) {
        super(message);
    }

    public ResourceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
