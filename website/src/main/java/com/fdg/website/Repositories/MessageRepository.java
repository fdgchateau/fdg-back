package com.fdg.website.Repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fdg.website.Entities.MessageEntity;

@Repository
public interface MessageRepository extends CrudRepository<MessageEntity, Integer>{
    
}
