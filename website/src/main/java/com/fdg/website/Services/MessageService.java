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

    //Renvoie tous les enregistrements

    public Iterable<MessageEntity> findAll(){
        return messageRepository.findAll();
    }
    //Renvoie un enregistrement de MessageEntity
    
    public Optional<MessageEntity>findById(Integer id){
        return messageRepository.findById(id);
    }

    public MessageEntity save(MessageEntity commentary){
        return messageRepository.save(commentary);
    }

    public void deleteById(Integer id){
        messageRepository.deleteById(id);
    }

 
}
