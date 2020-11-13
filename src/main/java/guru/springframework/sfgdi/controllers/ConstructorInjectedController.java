package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    // V pripade DI pomoci konstruktoru od Springu tusim verze 4.2 neni povinne uvadet anotaci @Autowired
    @Autowired
    @Qualifier("tomGreetingServiceImpl")
    private final GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("tomGreetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
