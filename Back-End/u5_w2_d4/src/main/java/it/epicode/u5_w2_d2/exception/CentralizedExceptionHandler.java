package it.epicode.u5_w2_d2.exception;

import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class CentralizedExceptionHandler extends RuntimeException {
    public CentralizedExceptionHandler(String message) {
        super(message);
    }
}
