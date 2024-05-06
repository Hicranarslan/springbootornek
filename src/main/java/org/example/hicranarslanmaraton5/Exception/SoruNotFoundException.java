package org.example.hicranarslanmaraton5.Exception;

public class SoruNotFoundException extends QuizException {

    public SoruNotFoundException(String message) {
        super(message);
    }

    public SoruNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
