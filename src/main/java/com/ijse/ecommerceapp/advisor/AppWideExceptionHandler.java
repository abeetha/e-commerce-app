package com.ijse.ecommerceapp.advisor;

import com.ijse.ecommerceapp.exception.NotFoundException;
import com.ijse.ecommerceapp.util.mappers.StandardResponse;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppWideExceptionHandler {
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<StandardResponse> handleNotFoundException(NotFoundException e){
        return new ResponseEntity<StandardResponse>(
            new StandardResponse(404,"ERROR ",e.getMessage()), HttpStatus.NOT_FOUND);

    }
}
