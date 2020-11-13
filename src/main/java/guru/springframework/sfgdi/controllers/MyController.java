package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/*
Controller pro ukazku, jak rucne ziskat komponentu ze Spring contextu (v SfgDiApplication)
 */

@Controller
public class MyController {

    public String sayHello() {
        System.out.println("Hello World");
        return "Hi folks";
    }
}
