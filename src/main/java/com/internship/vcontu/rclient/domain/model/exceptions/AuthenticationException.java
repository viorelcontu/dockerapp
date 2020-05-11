package com.internship.vcontu.rclient.domain.model.exceptions;

import org.springframework.web.client.HttpStatusCodeException;

import static org.springframework.http.HttpStatus.UNAUTHORIZED;

public class AuthenticationException extends HttpStatusCodeException {

    public AuthenticationException() {
        super(UNAUTHORIZED, "Authentication failed: wrong, missing or inactive user token");
    }
}
