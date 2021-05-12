package com.springframeworkguru.sftdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImp implements GreetingService{
    @Override
    public String sayHello() {
        return "Hello from service";
    }
}
