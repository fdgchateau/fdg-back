package com.fdg.website.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.fdg.website.Entities.SubjectEntity;


public interface SubjectRepository extends CrudRepository<SubjectEntity, Integer> {
    
}
