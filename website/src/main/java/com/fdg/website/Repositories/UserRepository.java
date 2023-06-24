package com.fdg.website.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fdg.website.Entities.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Integer>{
    
}
