package com.fdg.website.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fdg.website.Entities.UserEntity;
import com.fdg.website.Repositories.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public Iterable<UserEntity> findAll(){
        return userRepository.findAll();        
    }

    public Optional<UserEntity> findById(Integer id){
        return userRepository.findById(id);
    }

    public UserEntity save(UserEntity name){
        return userRepository.save(name);
    }

    public void deleteById(Integer id){
        userRepository.deleteById(id);
    }
}
