package com.fdg.website.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class ActionsControllers {

    @GetMapping("/actions")
    public String actions(Model model) {
        return "actions.html";
    }
}
