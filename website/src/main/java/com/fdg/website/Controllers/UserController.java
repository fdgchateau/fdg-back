package com.fdg.website.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.fdg.website.Repositories.MessageRepository;
import com.fdg.website.Repositories.SubjectRepository;
import com.fdg.website.Repositories.UserRepository;


@Controller
public class UserController {
    
@Autowired
private MessageRepository messageRepository;

@Autowired
private SubjectRepository subjectRepository;

@Autowired
private UserRepository userRepository;

  /*  @PostMapping("/")
    public String submitForm(@ModelAttribute("userForm") UserForm userForm, Model model) {
    // Traitement des données du formulaire
    if (userForm.validateForm()) {
        userForm.processForm(userForm);
        model.addAttribute("successMessage", "Le formulaire a été soumis avec succès.");
    } else {
        model.addAttribute("errorMessage", "Le formulaire est invalide.");
    }
    return "contacts.html";
}


    @GetMapping("/")
    public String showForm(Model model) {
    List<String> subjects = Arrays.asList("Question d'ordre général", "Commentaire", "Problème", "Autre");
    model.addAttribute("subjects", subjects);
    return "contacts.html";
        }*/ 

}


