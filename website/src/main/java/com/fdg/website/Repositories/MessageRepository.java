package com.fdg.website.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.fdg.website.Entities.MessageEntity;


public interface MessageRepository extends CrudRepository<MessageEntity, Integer>{
    
}
