package com.fdg.website.Repositories;

import org.springframework.stereotype.Repository;

import com.fdg.website.Entities.EmailMessage;

@Repository
public interface EmailRepository {
    void send(EmailMessage email);
    
}
