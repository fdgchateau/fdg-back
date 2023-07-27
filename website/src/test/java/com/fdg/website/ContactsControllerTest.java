package com.fdg.website;


import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import com.fdg.website.Controllers.ContactsController;
import com.fdg.website.Entities.UserEntity;
import com.fdg.website.Services.EmailService;
import com.fdg.website.Services.UserService;

@SpringBootTest
@AutoConfigureMockMvc
public class ContactsControllerTest {

    @Mock
    private UserService userService;

    @Mock
    private EmailService emailService;

    @InjectMocks
    private ContactsController contactsController;

    private MockMvc mockMvc;

    @Test
    public void testProcessForm_Success() throws Exception {
        // Crée un utilisateur de test avec des valeurs fictives
        UserEntity user = new UserEntity();
        user.setName("Sandrine");
        user.setFirstname("Bateau");
        user.setEmail("sandrine.bateau@example.com");
        user.setPhone("+33123456789");
        user.setSubject("Problème");
        user.setComment("Ceci est un test de formulaire");

        // Défini le comportement du service de l'utilisateur pour renvoyer l'utilisateur créé lorsqu'il est enregistré
        when(userService.save(any(UserEntity.class))).thenReturn(user);

        // Effectue une requête POST avec les valeurs fictives du formulaire
        mockMvc.perform(post("/form")
                .param("name", "Sandrine")
                .param("firstname", "Bateau")
                .param("email", "sandrine.bateau@example.com")
                .param("phone", "+33123456789")
                .param("subject", "Problème")
                .param("comment", "Ceci est un test de formulaire"))
                .andExpect(status().isOk());
    }
}
