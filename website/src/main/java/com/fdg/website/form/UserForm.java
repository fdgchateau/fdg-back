package com.fdg.website.form;

import com.fdg.website.Entities.UserEntity;


public class UserForm {
    private String firstname;
    private String name;
    private String email; 
    private String phone;
    private String subject;
    private String message;

   public UserForm(){
       
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
        this.phone = phone;
    }


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessages(String message) {
        this.message = message;
    }


    

    public boolean validateForm() {
     
        // Retourne true si le formulaire est valide, false sinon
       
        return firstname != null && !firstname.isEmpty()
                && name != null && !name.isEmpty()
                && email != null && !email.isEmpty()
                && phone != null && !phone.isEmpty()
                && subject != null && !subject.isEmpty();
    }
  

public void processForm(UserForm userForm) {

    UserEntity user = new UserEntity();



    user.setName(userForm.getName());
    user.setFirstname(userForm.getFirstname());
    user.setEmail(userForm.getEmail());
    user.setPhone(userForm.getPhone());


/* 
// Enregistre userEntity dans la base de données
UserRepository.save(user);

// Crée une instance de SubjectEntity à partir des données du formulaire
SubjectEntity subjectEntity = new SubjectEntity();
subjectEntity.setNameSubject(userForm.getSubject());

// Enregistre subjectEntity dans la base de données
SubjectRepository.save(subject);

// Créer une instance de MessageEntity à partir des données du formulaire
MessageEntity messageEntity = new MessageEntity();
messageEntity.setCommentaire(userForm.getMessage());
messageEntity.setDateEnvoi(new Date());



// Enregistre messageEntity dans la base de données
MessageRepository.save(message);
}*/

}

}


