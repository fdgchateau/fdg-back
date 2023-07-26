package com.fdg.website.Services;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.fdg.website.Entities.EmailMessage;
import com.fdg.website.Repositories.EmailRepository;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;


@Service
public class EmailService implements EmailRepository {
    
    private final JavaMailSender javaMailSender;

    public EmailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public void send(EmailMessage emailMessage) {
        try {
            MimeMessage message = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");
            helper.setTo(emailMessage.getRecipient()); // Utilisez la propriété "recipient" au lieu de "to"
            helper.setSubject(emailMessage.getSubject());
            helper.setFrom("sandrine@gmail.fr");
            message.setContent(emailMessage.getContent(), "text/html");
            javaMailSender.send(message);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
    

    public void send(String to, String subject, String body) {
    }
}