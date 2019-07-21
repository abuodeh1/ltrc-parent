package com.etech.workflow.exception;

import org.springframework.http.HttpStatus;

public class PassWordException extends BaseException {

    public PassWordException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getStatusCode() {
        return HttpStatus.FORBIDDEN;
    }
}
