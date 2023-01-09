package com.chariss.eazyschool.repository;

import com.chariss.eazyschool.model.Courses;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursesRepository extends CrudRepository<Courses, Integer> {
}
