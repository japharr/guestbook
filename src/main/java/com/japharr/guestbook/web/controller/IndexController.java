package com.japharr.guestbook.web.controller;

import com.japharr.guestbook.domain.Person;
import com.japharr.guestbook.domain.Student;
import com.japharr.guestbook.model.User;
import com.japharr.guestbook.repository.PersonRepository;
import com.japharr.guestbook.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Japharr on 26/1/2015.
 */
@Controller
public class IndexController {
    @Autowired
    PersonRepository personRepository;

    @Autowired
    StudentRepository studentRepository;

    /*
    @RequestMapping
    private String home() {
        return "home";
    }
    */

    @RequestMapping(value = "/user", params = "json", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    private User json() {
        User user = new User("Adesina OMotayo", 22);
        return user;
    }

    @RequestMapping(value = "/persons", params = "json", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    private List<Person> persons() {
        List<Person> persons = new ArrayList<>();
        //persons.add(new Person("Omopari", "Omorele", new Date()));
        persons.add(new Person("Harry", "Porter", new Date()));
        persons.add(new Person("John", "Kerry", new Date()));
        persons.add(new Person("Williams", "Lee", new Date()));

        //personRepository.save(persons);

        return personRepository.findAll();
    }

    @RequestMapping(value = "/students", params = "json", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    private List<Student> students() {
        List<Student> students = new ArrayList<>();
        //persons.add(new Person("Omopari", "Omorele", new Date()));
        students.add(new Student("Harry", "Porter"));
        students.add(new Student("John", "Kerry"));
        students.add(new Student("Williams", "Lee"));

        //studentRepository.save(students);

        return studentRepository.findAll();
    }

    @RequestMapping(value = "/user", params = "xml", method = RequestMethod.GET, produces = "application/xml")
    @ResponseBody
    private User xml() {
        User user = new User("Adesina OMotayo", 22);
        return user;
    }
}
