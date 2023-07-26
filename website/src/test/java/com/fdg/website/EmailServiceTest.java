package com.fdg.website;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import com.fdg.website.Entities.EmailMessage;
import com.fdg.website.Services.EmailService;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

public class EmailServiceTest {

      @Test
      public void testSend() throws MessagingException{
        // Mock du JavaMailSender
        JavaMailSender mockMailSender = mock(JavaMailSender.class);

        // Création du service de messagerie
        EmailService emailService = new EmailService(mockMailSender);

        // Données de test
        String recipient = "sagath25@gmail.com";
        String subject = "Test d'envoi de courrier électronique";
        String content = "Ceci est un message de test.";

        // Envoi d'un message de test
        EmailMessage emailMessage = new EmailMessage(recipient, subject, content);
        emailService.send(emailMessage);

        // Vérification que la méthode du JavaMailSender a été appelée avec les bonnes valeurs
        MimeMessage mimeMessage = new MimeMessage(Session.getDefaultInstance(System.getProperties()));
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true, "UTF-8");
        helper.setTo(recipient);
        helper.setSubject(subject);
        helper.setText(content, true);
        verify(mockMailSender, times(1)).send(mimeMessage);

      }
        
}