package com.Mvc.UserService.exception;

public class ResourceNotFoundException extends RuntimeException {
    //extra properties that you want to  manage
    public ResourceNotFoundException() {
        super("resource not found on server!!");
    }

    public ResourceNotFoundException(String message) {
 super(message);
    }
}
