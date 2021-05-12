package com.springframework.sfgpetclinic.controllers;

import com.springframework.sfgpetclinic.services.GreetingService;

public class PropertyInjectedController {

    GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayHello();
    }
}
