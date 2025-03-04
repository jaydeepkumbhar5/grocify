package com.grocify.usermgmt.exception.handler;



import com.grocify.commonlibs.model.response.GrocifyErrorResponse;
import com.grocify.usermgmt.exception.InvalidCredentialsException;
import com.grocify.usermgmt.exception.InvalidRequestException;
import com.grocify.usermgmt.exception.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice         /* used for global exception handling and 
providing centralized error handling for @RestController-based applications. 
It helps keep your controllers clean by moving exception-handling logic 
into a separate class */

public class GrocifyExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<GrocifyErrorResponse> handleUserNotFoundException(UserNotFoundException exception) {
        return new ResponseEntity<>(GrocifyErrorResponse.builder().message(exception.getMessage()).errorCode(HttpStatus.NOT_FOUND.value()).build(), HttpStatusCode.valueOf(HttpStatus.NOT_FOUND.value()));
    }					/* why here only <>  */

    @ExceptionHandler(InvalidCredentialsException.class)
    public ResponseEntity<GrocifyErrorResponse> handleUserInvalidPassword(InvalidCredentialsException exception) {
        return new ResponseEntity<>(GrocifyErrorResponse.builder().message(exception.getMessage()).errorCode(HttpStatus.UNAUTHORIZED.value()).build(), HttpStatusCode.valueOf(HttpStatus.UNAUTHORIZED.value()));
    }

    @ExceptionHandler(InvalidRequestException.class)
    public ResponseEntity<GrocifyErrorResponse> handleInvalidRequestException(InvalidRequestException exception) {
        return new ResponseEntity<>(GrocifyErrorResponse.builder().message(exception.getMessage()).errorCode(HttpStatus.BAD_REQUEST.value()).build(), HttpStatusCode.valueOf(HttpStatus.BAD_REQUEST.value()));
    }
}
