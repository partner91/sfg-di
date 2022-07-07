package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.MyService;
import org.springframework.stereotype.Controller;

@Controller
public class SomeController {

    private final MyService myService;

    public SomeController(MyService myService) {
        this.myService = myService;
    }
}
