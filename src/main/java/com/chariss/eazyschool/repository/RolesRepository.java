package com.chariss.eazyschool.repository;

import com.chariss.eazyschool.model.Roles;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(exported = false)
public interface RolesRepository extends CrudRepository<Roles, Integer> {
    Roles getByRoleName(String roleName);
}
