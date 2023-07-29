package com.fdg.website.Services;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.fdg.website.Entities.EmailMessage;

@Service
public class EmailService {

    private final JavaMailSender javaMailSender;

    public EmailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }
    
    @Async
    public void send(EmailMessage emailMessage) {
        try {
            /*
             * MimeMessage message = javaMailSender.createMimeMessage();
             * MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");
             * helper.setTo(emailMessage.getRecipient());
             * helper.setSubject(emailMessage.getSubject());
             * helper.setFrom("sagath25@gmail.com");
             * message.setContent(emailMessage.getContent(), "text/html");
             * javaMailSender.send(message);
             */

           

            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom("sagath25@gmail.com");
            message.setTo(emailMessage.getRecipient());
            message.setSubject(emailMessage.getSubject());
            message.setText(emailMessage.getContent());
            javaMailSender.send(message);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void send(String recipient, String subject, String content) {
    }
}