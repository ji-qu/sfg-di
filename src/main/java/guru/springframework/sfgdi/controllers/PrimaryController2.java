package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryController2 {

    @Autowired
    @Qualifier("greetingService2Impl")
    public GreetingService2 greetingService2Impl;

    public String sayHello(){
        return greetingService2Impl.sayGreeting();
    }
}
