package org.sergei.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public String getMessage() {
        return "{\"message\":\"Got it! Hello from service!\"}";
    }

}
