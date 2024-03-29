package com.chariss.eazyschool.repository;

import com.chariss.eazyschool.model.EazyClass;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EazyClassRepository extends CrudRepository<EazyClass, Integer> {
}
