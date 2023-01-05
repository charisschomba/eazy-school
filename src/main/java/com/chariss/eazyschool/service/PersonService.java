package com.chariss.eazyschool.service;

import com.chariss.eazyschool.constants.EazySchoolConstants;
import com.chariss.eazyschool.model.Person;
import com.chariss.eazyschool.model.Roles;
import com.chariss.eazyschool.repository.PersonRepository;
import com.chariss.eazyschool.repository.RolesRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PersonService {
    @Autowired
    RolesRepository rolesRepository;
    @Autowired
    PersonRepository personRepository;

    public boolean createNewPerson(Person person) {
        boolean isSaved = false;

        Roles role = rolesRepository.getByRoleName(EazySchoolConstants.STUDENT_ROLE);
        person.setRoles(role);
        person = personRepository.save(person);
        if(person != null && person.getPersonId() > 0) {
            isSaved = true;
        }
        return isSaved;
    }
}
