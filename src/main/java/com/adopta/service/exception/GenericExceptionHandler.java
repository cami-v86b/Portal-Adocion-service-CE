package com.adopta.service.exception;

import com.adopta.service.utils.GenericResponse;
import com.adopta.service.utils.Global;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice

public class GenericExceptionHandler {
    @ExceptionHandler
    public GenericResponse genericExceptionHandler(Exception ex) {
        return new GenericResponse("exception",-1, Global.OPERACION_ERRONEA,ex.getMessage());
}
}
