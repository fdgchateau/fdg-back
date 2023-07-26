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
    
   private JavaMailSender javaMailSender;

    public EmailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    @Override
    public void send(EmailMessage emailM) {
        try {
            MimeMessage message = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");
            helper.setTo(emailM.getTo());
            helper.setSubject(emailM.getSubject());
            helper.setFrom("sandrine@gmail.fr");
            message.setContent(emailM.getContent(), "text/html");
            javaMailSender.send(message);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    public void send(String to, String subject, String body) {
    }
}