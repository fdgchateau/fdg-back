package com.fdg.website.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fdg.website.Entities.SubjectEntity;

@Repository
public interface SubjectRepository extends CrudRepository<SubjectEntity, Integer> {
    
}
