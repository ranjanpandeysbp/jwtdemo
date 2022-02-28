package com.mycompany.jwtdemo.repository;

import com.mycompany.jwtdemo.entity.GstNotFiledEntity;
import org.springframework.data.repository.CrudRepository;

public interface GstNotFiledRepository extends CrudRepository<GstNotFiledEntity,Long> {
}
