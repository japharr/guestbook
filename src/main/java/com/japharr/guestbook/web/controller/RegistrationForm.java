package com.japharr.guestbook.web.controller;

import com.japharr.guestbook.web.validation.Forename;
import com.japharr.guestbook.web.validation.Surname;

/**
 * Created by Japharr on 29/1/2015.
 */
public class RegistrationForm {
    @Forename
    private String forename;
    @Surname
    private String surname;

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}