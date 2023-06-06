package com.fdg.website.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fdg.website.Entities.MessageEntity;
import com.fdg.website.Repositories.MessageRepository;

@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;
    
    public Iterable<MessageEntity> findAll(){
        return messageRepository.findAll();
    }
    
    public Optional<MessageEntity>findById(Integer Id){
        return messageRepository.findById(Id);
    }


}
