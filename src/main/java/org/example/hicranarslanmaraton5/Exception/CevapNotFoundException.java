package org.example.hicranarslanmaraton5.Exception;

public class CevapNotFoundException extends QuizException {

    public CevapNotFoundException(String message) {
        super(message);
    }

    public CevapNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
