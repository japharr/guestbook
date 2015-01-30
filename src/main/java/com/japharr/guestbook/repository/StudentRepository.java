package com.japharr.guestbook.repository;

import com.google.appengine.api.datastore.Key;
import com.japharr.guestbook.domain.Person;
import com.japharr.guestbook.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Japharr on 28/1/2015.
 */
public interface StudentRepository extends JpaRepository<Student, Long> {
}
