package com.fdg.website.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class LiveController {

    @GetMapping("/live")
    public String live(Model model) {
        return "live.html";
    }
}
