package com.chariss.eazyschool.service;

import com.chariss.eazyschool.controller.ContactController;
import com.chariss.eazyschool.model.Contact;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import org.slf4j.LoggerFactory;

@Service
public class ContactService {

    private static Logger log = LoggerFactory.getLogger(ContactController.class);

    public boolean saveMessageDetails(Contact  contact) {
        boolean isSaved = true;
        log.info(contact.toString());
        return isSaved;
    }
}
