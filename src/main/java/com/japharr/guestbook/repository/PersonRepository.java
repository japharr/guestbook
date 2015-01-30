package com.japharr.guestbook.repository;

import com.japharr.guestbook.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import com.google.appengine.api.datastore.Key;

/**
 * Created by Japharr on 28/1/2015.
 */
public interface PersonRepository extends JpaRepository<Person, Long> {
}
