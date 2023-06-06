package com.fdg.website.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class MembresController {
    
    @GetMapping("/membres")
    public String membres(Model model) {
        return "membres.html";
    }
}
