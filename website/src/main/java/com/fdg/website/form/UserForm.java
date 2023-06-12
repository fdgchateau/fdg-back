package com.fdg.website.form;
import java.util.List;


public class UserForm {
    private String firstname;
    private String name;
    private String email; 
    private String phone;
    private String subject;
    private List<String>messages;

    public UserForm(String firstname, String name, String email, String phone, String subject, List<String> messages){
        this.firstname = firstname;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.subject = subject;
        this.messages = messages;
       }
 
 // Getters et setters

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

       public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.email = phone;
    }


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }


    

    public boolean validateForm() {
     
        // Retourne true si le formulaire est valide, false sinon
       
        return firstname != null && !firstname.isEmpty()
                && name != null && !name.isEmpty()
                && email != null && !email.isEmpty()
                && phone != null && !phone.isEmpty()
                && subject != null && !subject.isEmpty();
    }
    
    public void processForm() {
        // Traite les données du formulaire
       
        System.out.println("Traitement du formulaire :");
        System.out.println("Prénom : " + firstname);
        System.out.println("Nom : " + name);
        System.out.println("Email : " + email);
        System.out.println("Téléphone : " + phone);
        System.out.println("Sujet : " + subject);
        System.out.println("Messages : " + messages);
    
    }
}


