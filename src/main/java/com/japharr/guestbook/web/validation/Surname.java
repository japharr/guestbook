package com.japharr.guestbook.web.validation;

import static java.lang.annotation.ElementType.*;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by Japharr on 29/1/2015.
 */
@Target( { METHOD, FIELD, ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = SurnameValidator.class)
public @interface Surname {
    String message() default "{samples.gae.surname}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}