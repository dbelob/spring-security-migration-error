package acme.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleController {
    @GetMapping("/home")
    public String home() {
        return "home";
    }
}
