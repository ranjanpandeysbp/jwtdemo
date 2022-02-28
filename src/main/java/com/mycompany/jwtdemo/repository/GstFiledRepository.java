package com.mycompany.jwtdemo.repository;

import com.mycompany.jwtdemo.entity.GstFiledEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GstFiledRepository extends CrudRepository<GstFiledEntity,Long> {
    List<GstFiledEntity> findAllByGstNoAndReturnType(String gstNo, String returnType);
    List<GstFiledEntity> findAllByGstNoOrderByGstNo(String gstNo);
}
