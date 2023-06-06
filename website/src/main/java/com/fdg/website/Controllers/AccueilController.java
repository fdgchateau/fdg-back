package com.fdg.website.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;


@Controller
public class AccueilController {

    @GetMapping("/")
    public String accueil(Model model) {
        return "accueil.html";
    }
}


