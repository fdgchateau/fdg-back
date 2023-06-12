package com.fdg.website.Services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fdg.website.Entities.MessageEntity;
import com.fdg.website.Entities.UserEntity;
import com.fdg.website.Repositories.MessageRepository;

@Service
public class MessageService {
    
    
    private final MessageRepository messageRepository;

      @Autowired
    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

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

  

    public void insertMessages(List<String> messages, Date dateEnvoi, String commentaire, UserEntity userEntity) {
        for (String message : messages) {
            MessageEntity messageEntity = new MessageEntity();
            messageEntity.setCommentaire(commentaire);
            messageEntity.setDateEnvoi(dateEnvoi);
            messageEntity.setUser(userEntity);
            messageRepository.save(messageEntity);
        }
    }

 
}
