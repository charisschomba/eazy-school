package com.chariss.eazyschool.repository;

import com.chariss.eazyschool.model.Roles;
import org.springframework.data.repository.CrudRepository;

public interface RolesRepository extends CrudRepository<Roles, Integer> {
    Roles getByRoleName(String roleName);
}
