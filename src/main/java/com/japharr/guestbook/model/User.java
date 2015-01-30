package com.japharr.guestbook.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Japharr on 27/1/2015.
 */
@XmlRootElement(name = "coffee")
public class User {
    private String name;
    private Integer age;

    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    @XmlElement
    public void setAge(Integer age) {
        this.age = age;
    }
}
