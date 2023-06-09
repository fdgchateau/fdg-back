package com.fdg.website.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fdg.website.form.UserForm;

import ch.qos.logback.core.model.Model;

@Controller
public class ContactController {
    @GetMapping("/contacts")
    public String contacts(Model model) {
        return "contacts.html";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(UserForm userForm) {
        return "index";
    }


}
