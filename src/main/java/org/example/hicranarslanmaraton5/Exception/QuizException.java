package org.example.hicranarslanmaraton5.Exception;

public class QuizException extends RuntimeException {

    public QuizException(String message) {
        super(message);
    }

    public QuizException(String message, Throwable cause) {
        super(message, cause);
    }
}
