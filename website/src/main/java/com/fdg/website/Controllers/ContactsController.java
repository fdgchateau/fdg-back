package com.fdg.website.Controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.fdg.website.Entities.UserEntity;
import com.fdg.website.Repositories.UserRepository;
import com.fdg.website.Services.EmailService;



@Controller
public class ContactsController {

     @Autowired
    private UserRepository userRepository;

    @Autowired
    private EmailService emailService;

    @GetMapping("/contacts")
    public String contacts(Model model) {
        model.addAttribute("user", new UserEntity());
        List<String> subjects = Arrays.asList("Question d'ordre général", "Commentaire", "Problème", "Autre");
        model.addAttribute("subjects", subjects);
        return "contacts.html";
       
    }
@PostMapping("/form")
    public String processForm(@ModelAttribute("userEntity") UserEntity user, Model model) {
        
        userRepository.save(user);

        String to = "sagath25@gmail.com";
        String subject = "Nouveau formulaire soumis via le site FDG";
        String body = "Un nouveau formulaire a été stransmis avec les données suivantes : \n"
                + "Nom : " + user.getName() + "\n"
                + "Prénom : " + user.getFirstname() + "\n"
                + "Email : " + user.getEmail() + "\n"
                + "Téléphone : " + user.getPhone() + "\n"
                + "Sujet : " + user.getSubject() + "\n"
                + "Commentaire : " + user.getComment() + "\n";

        emailService.send(to, subject, body);

        return "form";
    }

 
}
