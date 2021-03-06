package com.japharr.guestbook.web.controller;


import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import com.google.appengine.api.users.UserServiceFactory;
import com.japharr.guestbook.config.model.GaeUser;
import com.japharr.guestbook.config.model.UserRegistry;
import com.japharr.guestbook.config.security.AppRole;
import com.japharr.guestbook.config.security.GaeUserAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Japharr on 29/1/2015.
 */
@Controller
@RequestMapping(value="/register.htm")
public class RegistrationController {

    @Autowired
    private UserRegistry registry;

    @RequestMapping(method= RequestMethod.GET)
    public RegistrationForm registrationForm() {
        return new RegistrationForm();
    }

    @RequestMapping(method = RequestMethod.POST)
    public String register(@Valid RegistrationForm form, BindingResult result) {
        if (result.hasErrors()) {
            return null;
        }

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        GaeUser currentUser = (GaeUser)authentication.getPrincipal();
        Set<AppRole> roles = EnumSet.of(AppRole.USER);

        if (UserServiceFactory.getUserService().isUserAdmin()) {
            roles.add(AppRole.ADMIN);
        }

        GaeUser user = new GaeUser(currentUser.getUserId(), currentUser.getNickname(), currentUser.getEmail(),
                form.getForename(), form.getSurname(), roles, true);

        registry.registerUser(user);

        // Update the context with the full authentication
        SecurityContextHolder.getContext().setAuthentication(new GaeUserAuthentication(user, authentication.getDetails()));

        return "redirect:/home.htm";
    }
}
