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
import com.fdg.website.Services.EmailService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("")
public class UserController {

 

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EmailService emailService;


   
    @PostMapping("/contacts-form")
    public String submitForm(@Valid @ModelAttribute(name= "user") UserEntity user, 
    BindingResult userBinding, 
    Model model) {
        System.out.println(user);
        userRepository.save(user);
        model.addAttribute("user", user);
        return "form";
    }

}



  

 




