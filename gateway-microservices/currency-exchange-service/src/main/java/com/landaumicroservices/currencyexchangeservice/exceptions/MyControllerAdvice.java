package com.landaumicroservices.currencyexchangeservice.exceptions;

import org.apache.http.protocol.HTTP;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpStatusCodeException;

import javax.servlet.http.HttpServletResponse;

@RestController
@ControllerAdvice
public class MyControllerAdvice {

    @ExceptionHandler(value = {CustomException.class, RuntimeException.class})
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public ErrorDetail handle(HttpStatusCodeException res, Exception e){
        return new ErrorDetail(res.getStatusCode().value(),e.getMessage());
    }

}
