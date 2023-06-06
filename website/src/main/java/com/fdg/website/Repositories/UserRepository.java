package com.fdg.website.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.fdg.website.Entities.UserEntity;


public interface UserRepository extends CrudRepository<UserEntity, Integer>{
    
}
