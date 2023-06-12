package com.fdg.website.Controllers;

import org.springframework.web.bind.annotation.PostMapping;

import com.fdg.website.form.UserForm;

import ch.qos.logback.core.model.Model;

public class UserController {
    

    @PostMapping("/submitForm")
    public String submitForm(UserForm userForm, Model model) {
        // Traitement des données du formulaire
        if (userForm.validateForm()) {
            userForm.processForm();
            //model.addAttribute("successMessage", "Le formulaire a été soumis avec succès.");
        } else {
            //model.addAttribute("errorMessage", "Le formulaire est invalide.");
        }
        return "ok";
    }

}