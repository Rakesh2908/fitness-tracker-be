package com.fitnesstracker.exception;

/**
 * Thrown when a request is invalid (e.g. validation failure, duplicate resource, business rule violation).
 * Mapped to HTTP 400 Bad Request by {@link GlobalExceptionHandler}.
 */
public class BadRequestException extends RuntimeException {

    public BadRequestException(String message) {
        super(message);
    }

    public BadRequestException(String message, Throwable cause) {
        super(message, cause);
    }
}
