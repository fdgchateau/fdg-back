package com.fdg.website.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class EvenementsController {

    @GetMapping("/evenements")
    public String evenements(Model model) {
        return "evenements.html";
    }
}
