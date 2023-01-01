package acme.example.controller;

import acme.example.service.SimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleController {
    private static final String HOME_FORM = "homeForm";
    private static final String PUBLIC_FORM = "publicForm";
    private static final String PRIVATE_FORM = "privateForm";

    private final SimpleService simpleService;

    @Autowired
    public SimpleController(SimpleService simpleService) {
        this.simpleService = simpleService;
    }

    @GetMapping("/home")
    public String showHome(Model model) {
        model.addAttribute(simpleService.getMessage(null));

        return HOME_FORM;
    }

    @GetMapping("/public")
    public String showPublic(Model model) {
        model.addAttribute(simpleService.getMessage("public"));

        return PUBLIC_FORM;
    }

    @GetMapping("/private")
    public String showPrivate(Model model) {
        model.addAttribute(simpleService.getMessage("private"));

        return PRIVATE_FORM;
    }
}
