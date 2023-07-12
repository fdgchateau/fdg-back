package com.fdg.website.Controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fdg.website.Entities.UserEntity;
import com.fdg.website.Repositories.UserRepository;
import com.fdg.website.Services.EmailService;

@Controller
@RequestMapping("")
public class UserController {

 

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EmailService emailService;


   
    
    @GetMapping("/contacts-form")
    public String showForm(Model model) {
        UserEntity userEntity = new UserEntity();
        List<String> subjects = Arrays.asList("Question d'ordre général", "Commentaire", "Problème", "Autre");
        model.addAttribute("userEntity", userEntity);
        model.addAttribute("subjects", subjects);
        model.addAttribute("user", new UserEntity());
        return "form";
    }

     @PostMapping("/contacts-form")
    public String submitForm(@ModelAttribute UserEntity userEntity, Model model) {
        userRepository.save(userEntity);
        model.addAttribute("userEntity", userEntity);
        return "form";
    }

}



  

 




