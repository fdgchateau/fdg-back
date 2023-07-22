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

  /*  private static final Logger log = LoggerFactory.getLogger(UserController.class);*/ 

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EmailService emailService;


    @PostMapping("/contacts-form")
    public String submitForm(@Valid @ModelAttribute("user") UserEntity user,
                             BindingResult bindingResult,
                             Model model) {

        if (bindingResult.hasErrors()) {
            // Des erreurs de validation ont été trouvées, renvoyez-les à la vue
            model.addAttribute("user", user);
            return "contacts"; // Nom de votre modèle HTML pour le formulaire
        }

        userRepository.save(user);
        model.addAttribute("user", user);
        return "form"; // Vers une page de succès
    }
}

   /* @PostMapping("/contacts-form")
    public String submitForm(@Valid @ModelAttribute(name= "user") UserEntity user, 
    BindingResult userBinding, 
    Model model) {
        System.out.println(user);
        userRepository.save(user);
        model.addAttribute("user", user);
        return "form";
    }
 */
  


 /* @PostMapping("/contacts-form")
public String submitForm(@Valid @ModelAttribute(name = "user") UserEntity user,
                           BindingResult bindingResult,
                           Model model) {

    if (bindingResult.hasErrors()) {
        log.error("errors = " + bindingResult.getAllErrors());
        return "actions";
    }
    model.addAttribute("user", user);
    userRepository.save(user);
    return "form";
}*/




  

 




