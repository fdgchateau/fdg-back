package com.fdg.website.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccueilController {

    @RequestMapping("/accueil")
    public String accueil(Model model) {
        return "accueil";
    }
}


