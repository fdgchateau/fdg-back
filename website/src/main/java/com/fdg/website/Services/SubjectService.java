package com.fdg.website.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fdg.website.Entities.SubjectEntity;
import com.fdg.website.Repositories.SubjectRepository;

@Service
public class SubjectService {
     @Autowired
     private SubjectRepository subjectRepository;

     public Iterable<SubjectEntity> findAll(){
        return subjectRepository.findAll();
     }

     public Optional<SubjectEntity> findById(Integer id){
        return subjectRepository.findById(id);
     }

     public SubjectEntity save(SubjectEntity name){
        return subjectRepository.save(name);
     }
    
     public void deleteById(Integer id){
        subjectRepository.deleteById(id);
    }



}

