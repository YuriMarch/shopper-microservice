package com.letscode.exceptions;

import java.util.List;

public class ValidationException extends RuntimeException {

    private final List<String> validationErrors;

    public ValidationException(List<String> validationErrors) {
        super(String.join(", ", validationErrors));
        this.validationErrors = validationErrors;
    }

    public ValidationException(String validationErrorMessage) {
        super(validationErrorMessage);
        this.validationErrors = List.of(validationErrorMessage);
    }
}
