package com.chariss.eazyschool.service;

import com.chariss.eazyschool.model.Contact;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ContactService {
    public boolean saveMessageDetails(Contact  contact) {
        boolean isSaved = true;
        log.info(contact.toString());
        return isSaved;
    }
}
