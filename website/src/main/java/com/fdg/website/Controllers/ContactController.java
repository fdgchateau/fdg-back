package com.fdg.website.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.fdg.website.form.UserForm;

@Controller
public class ContactController {
    @GetMapping("/contacts")
    public String contacts(Model model) {
        model.addAttribute("userForm", new UserForm());
        return "contacts.html";
    }

  @PostMapping("/contacts")
    public String processForm(@ModelAttribute("userForm") UserForm userForm) {
       
        return "redirect:/contacts"; 
    }


}
