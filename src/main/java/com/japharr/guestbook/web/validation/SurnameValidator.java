package com.japharr.guestbook.web.validation;

import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by Japharr on 29/1/2015.
 */
public class SurnameValidator implements ConstraintValidator<Surname, String> {
    private static final Pattern VALID = Pattern.compile("[\\p{L}'\\-,.]+") ;

    public void initialize(Surname constraintAnnotation) {}

    public boolean isValid(String value, ConstraintValidatorContext context) {
        return VALID.matcher(value).matches();
    }
}
