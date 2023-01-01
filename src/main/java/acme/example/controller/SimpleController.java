package acme.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleController {
    private static final String HOME_FORM = "homeForm";
    private static final String PUBLIC_FORM = "publicForm";
    private static final String PRIVATE_FORM = "privateForm";

    @GetMapping("/home")
    public String showHome() {
        return HOME_FORM;
    }

    @GetMapping("/public")
    public String showPublic() {
        return PUBLIC_FORM;
    }

    @GetMapping("/private")
    public String showPrivate() {
        return PRIVATE_FORM;
    }
}
