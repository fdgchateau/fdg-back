package com.fdg.website.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fdg.website.Entities.UserEntity;
import com.fdg.website.Repositories.UserRepository;

import jakarta.validation.Valid;


@Controller
@RequestMapping("")
public class UserController {

<<<<<<< HEAD
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/contacts-form")
    public String submitForm(@Valid @ModelAttribute("user") UserEntity user,
                             BindingResult bindingResult,
                             Model model) {

        if (bindingResult.hasErrors()) {
            // Des erreurs de validation ont été trouvées, renvoyez-les à la vue
            model.addAttribute("user", user);
            return "contacts"; // Nom de votre modèle HTML pour le formulaire
=======
    @PostMapping("/submitForm")
    public String submitForm(UserForm userForm, Model model) {
        // Traitement des données du formulaire
        if (userForm.validateForm()) {
            userForm.processForm();
            //model.addAttribute("successMessage", "Le formulaire a été soumis avec succès.");
        } else {
            //model.addAttribute("errorMessage", "Le formulaire est invalide.");
>>>>>>> a1d6bdbfa96412be456efea32a4c8a38690da5ec
        }

        userRepository.save(user);
        model.addAttribute("user", user);
        return "form"; // Vers une page de succès
    }
}






  

 




