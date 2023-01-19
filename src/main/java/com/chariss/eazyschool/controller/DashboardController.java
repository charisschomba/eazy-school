package com.chariss.eazyschool.controller;

import com.chariss.eazyschool.model.Person;
import com.chariss.eazyschool.repository.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpSession;

@Slf4j
@Controller
public class DashboardController {

    @Value("${eazyschool.pageSize}")
    private int defaultPageSize;
    @Value("${eazyschool.contact.successMsg}")
    private String message;
    @Autowired
    PersonRepository personRepository;

    @Autowired
    private Environment environment;

    @RequestMapping("/dashboard")
    public String displayDashboard(Model model, Authentication authentication, HttpSession session) {
        Person person = personRepository.readByEmail(authentication.getName());
        model.addAttribute("username", person.getName());
        model.addAttribute("roles", authentication.getAuthorities().toString());
        if(null != person.getEazyClass() && null != person.getEazyClass().getName()){
            model.addAttribute("enrolledClass", person.getEazyClass().getName());
        }
        session.setAttribute("loggedInPerson", person);
        return "dashboard.html";
    }
}
